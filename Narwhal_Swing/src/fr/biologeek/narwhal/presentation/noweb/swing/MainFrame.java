package fr.biologeek.narwhal.presentation.noweb.swing;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	

	private static final long serialVersionUID = 8990460753485399282L;
	private JPanel contentPane;
	private JMenuBar menuBar;

	public MainFrame() {
		
		this.setTitle("Narwhal v1.0");
		
		
		contentPane = new FinancialOperationListPanel ();
		this.setContentPane(contentPane);
		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}

}
