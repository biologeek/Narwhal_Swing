package fr.biologeek.narwhal.presentation.noweb.swing;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7510494983268245437L;

	
	
	JMenu menuOperations,menuParameters,menuItemCurrency;
	JMenuItem menuItemAddOperation,menuItemUpdateOperation,menuItemDeleteOperation
	,menuItemImposition,menuItemOptions,
	
	menuItemCurrencyEuro,menuItemCurrencyDollar,menuItemCurrencyPound;
	
	public MenuBar (){
		this.setUpMenus();
	}
	
	private void setUpMenus (){
		
		this.menuOperations = new JMenu("Opérations");
		this.menuParameters = new JMenu("Paramètres");
		
		
		this.menuItemAddOperation = new JMenuItem("Ajouter");	
		this.menuItemUpdateOperation = new JMenuItem("Modifier");
		this.menuItemDeleteOperation = new JMenuItem("Supprimer");
		
		this.menuItemCurrency = new JMenu("Devises");
		this.menuItemImposition = new JMenuItem("Impôts");
		this.menuItemOptions = new JMenuItem("Options");
		menuItemCurrencyDollar = new JMenuItem("Dollar");
		menuItemCurrencyEuro = new JMenuItem("Euro");
		menuItemCurrencyPound = new JMenuItem("Livre Sterling");
		
		
		
		menuItemCurrency.add(menuItemCurrencyDollar);
		menuItemCurrency.add(menuItemCurrencyEuro);
		menuItemCurrency.add(menuItemCurrencyPound);
		
		menuOperations.add(menuItemAddOperation);
		menuOperations.add(menuItemUpdateOperation);
		menuOperations.add(menuItemDeleteOperation);
		
		menuParameters.add(menuItemCurrency);
		menuParameters.add(menuItemImposition);
		menuParameters.add(menuItemOptions);
		
		
		
		this.add(menuOperations);
		this.add(menuParameters);
		
		
		
		
	}
}
