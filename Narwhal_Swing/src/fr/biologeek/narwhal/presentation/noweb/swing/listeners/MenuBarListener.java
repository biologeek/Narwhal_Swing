package fr.biologeek.narwhal.presentation.noweb.swing.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.biologeek.narwhal.presentation.noweb.swing.operations.UpdateOperationPopUp;

public class MenuBarListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		
		case "AddOp" :
			new UpdateOperationPopUp();
			break;
		case "ModOp" :
			break;
		case "DelOp" :
			break;
			
		}
		
	}

}
