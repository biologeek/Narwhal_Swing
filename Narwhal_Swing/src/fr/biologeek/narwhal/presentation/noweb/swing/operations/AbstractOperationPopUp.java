package fr.biologeek.narwhal.presentation.noweb.swing.operations;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.DateFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import fr.biologeek.narwhal.business.entities.Operation;

@SuppressWarnings("serial")
public abstract class AbstractOperationPopUp extends JFrame {

	JPanel contentPane;
	private Operation op;
	
	public static final int POPUP_WIDTH = 400;
	public static final int POPUP_HEIGHT= 200;
	
	
	
	public AbstractOperationPopUp() {
		super();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(POPUP_WIDTH, POPUP_HEIGHT);
		this.setLocationRelativeTo(null);
		contentPane = new JPanelForAbsPopUp(op);
		this.setContentPane(contentPane);
		this.setVisible(true);
	}
	
	public class JPanelForAbsPopUp extends JPanel {
		
		private Operation operation;
		private List<LayoutManager> layout;
		private JPanel leftPane;
		private JPanel rightPane;

		public JPanelForAbsPopUp (Operation op) {
			this.operation = op;
			this.leftPane = new JPanel();
			this.rightPane = new JPanel();
			layout = new ArrayList<LayoutManager>();
			
			layout.add(new FlowLayout());
			layout.add(new BoxLayout(leftPane, BoxLayout.PAGE_AXIS));
			layout.add(new BoxLayout(rightPane, BoxLayout.Y_AXIS));
			
			this.setMaximumSize(new Dimension(POPUP_WIDTH,POPUP_HEIGHT-30));
			this.leftPane.setLayout(layout.get(1));
			this.rightPane.setLayout(layout.get(2));
			this.leftPane.setMaximumSize(new Dimension(130,400));
			this.rightPane.setMaximumSize(new Dimension(170,400));
			this.add(leftPane);
			this.add(rightPane);
			this.setLayout((LayoutManager) layout.get(0));
			this.setUpWidgets();

		}

		private void setUpWidgets() {
			
			JLabel label1 = new JLabel ("Label");
			label1.setPreferredSize(new Dimension(150,20));
			JLabel label2 = new JLabel ("Dépense/Recette");
			JLabel label3 = new JLabel ("Date");
			JLabel label4 = new JLabel ("Compte");
			JLabel label5 = new JLabel ("Catégorie");
			JLabel label6 = new JLabel ("Sous-catégorie");

			label2.setPreferredSize(new Dimension(150,20));
			label3.setPreferredSize(new Dimension(150,20));
			label4.setPreferredSize(new Dimension(150,20));
			label5.setPreferredSize(new Dimension(150,20));
			label6.setPreferredSize(new Dimension(150,20));

			JLabel label = new JLabel ("");


			UtilDateModel model = new UtilDateModel();
			Properties p = new Properties();
			p.put("text.today", "Today");
			p.put("text.month", "Month");
			p.put("text.year", "Year");
			JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
			JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateFormatter());
			
			
			JComboBox<String> isABuying = new JComboBox<String>();
			isABuying.addItem("Recette");
			isABuying.addItem("Dépense");
			
			JComboBox<String> accounts = new JComboBox<String>();
			
			// Tout doux : Get accounts list and add them to JComboBox
			
			JComboBox<String> categories = new JComboBox<String>();
			JComboBox<String> subcategories = new JComboBox<String>();
			
			JButton validate = new JButton ("Valider");
			JButton cancel = new JButton("Annuler");
			this.rightPane.add(label);
			this.rightPane.add(subcategories);
			this.rightPane.add(categories);
			this.rightPane.add(accounts);
			this.rightPane.add(isABuying);
			this.rightPane.add(datePicker);
			this.rightPane.add(validate);
			this.rightPane.add(cancel);

			this.leftPane.add(label1);
			this.leftPane.add(label2);
			this.leftPane.add(label3);
			this.leftPane.add(label4);
			this.leftPane.add(label5);
			this.leftPane.add(label6);
			this.leftPane.add(new JPanel());
			
		}
		
	}
	

}
