package fr.biologeek.narwhal.presentation.noweb.swing;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7510494983268245437L;

	
	
	JMenu menuOperations,menuParameters;
	JMenuItem menuItemAddOperation,menuItemUpdateOperation,menuItemDeleteOperation
	,menuItemImposition,menuItemCurrency,menuItemOptions;
	
	public MenuBar (){
		this.setUpMenus();
	}
	
	private void setUpMenus (){
		
		this.menuOperations = new JMenu("Opérations");
		this.menuParameters = new JMenu("Paramètres");
		this.menuItemAddOperation = new JMenuItem("Ajouter");
		
		this.add(menuOperations);
		this.add(menuParameters);
		
		this.menuItemUpdateOperation = new JMenuItem("Modifier");
		this.menuItemDeleteOperation = new JMenuItem("Supprimer");
		
		
	}
}
