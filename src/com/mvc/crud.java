package com.mvc;

import com.dbf.controller.ControllerPersona;
import com.dbf.controller.ControllerPrintPersona;
import com.dbf.model.Persona;
import com.view.FrmPersona;
import com.view.ViewController;

public class crud {
	
	public static void main(String[] args) {

		Persona mod = new Persona();
		ControllerPersona modC = new ControllerPersona();
		FrmPersona frm = new FrmPersona();
		ControllerPrintPersona controladorPrintPersona = new ControllerPrintPersona();
		
		ViewController viewController = new ViewController(mod, modC, frm, controladorPrintPersona);
		viewController.iniciar();
		frm.setVisible(true);

	}

}
