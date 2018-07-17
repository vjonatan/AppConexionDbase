package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.dbf.controller.ControllerPersona;
import com.dbf.controller.ControllerPrintPersona;
import com.dbf.model.Persona;

public class ViewController implements ActionListener {
	
	private Persona modPersona;
	private ControllerPersona contPersona;
	private ControllerPrintPersona contPrintPersona;
	private FrmPersona frmPersona;
	
	boolean flagModificar = false;
	
	public ViewController(Persona modPersona, ControllerPersona contPersona, FrmPersona frmPersona, ControllerPrintPersona contPrintPersona){
		this.modPersona = modPersona;
		this.contPersona = contPersona;
		this.frmPersona = frmPersona;
		this.contPrintPersona = contPrintPersona;
		
		this.frmPersona.btnPrimero.addActionListener(this);
		this.frmPersona.btnAnterior.addActionListener(this);
		this.frmPersona.btnSiguiente.addActionListener(this);
		this.frmPersona.btnUltimo.addActionListener(this);
		
		this.frmPersona.btnNuevo.addActionListener(this);
		this.frmPersona.btnModificar.addActionListener(this);
		this.frmPersona.btnGuardar.addActionListener(this);
		this.frmPersona.btnEliminar.addActionListener(this);
		this.frmPersona.btnDeshacer.addActionListener(this);
		this.frmPersona.btnImprimir.addActionListener(this);
		
		this.frmPersona.txtDni.addFocusListener(null);	
	}
	
	public void iniciar(){
		frmPersona.setTitle("Consulta de Personas");
		frmPersona.setLocationRelativeTo(null);
		frmPersona.setResizable(false);
		this.habilitarBtnGuardar(false);
	}
	
	public void actionPerformed(ActionEvent e) {	
		
		if (e.getSource() == frmPersona.btnNuevo){
			
			frmPersona.setEstadoEdicion(true);
			frmPersona.txtDni.setRequestFocusEnabled(true);
			flagModificar = false;
			this.habilitarBtnGuardar(true);
			this.limpiarFormPersona();
			
		}
		
		if ( e.getSource() == frmPersona.btnGuardar ){
			
			modPersona.setDocumento(Integer.parseInt(frmPersona.txtDni.getText()));
			modPersona.setRazon(frmPersona.txtNombre.getText());
			
			if ( flagModificar == false){
				contPersona.registrar(modPersona);
				JOptionPane.showMessageDialog(null, "Registro Guardado");
			}else{
				contPersona.registrar(modPersona);
				JOptionPane.showMessageDialog(null, "Registro Actualizado");
			}
			frmPersona.setEstadoEdicion(false);
			frmPersona.btnDeshacer.doClick();
			
		}	
		
		if ( e.getSource() == frmPersona.btnModificar ){
			
			frmPersona.setEstadoEdicion(true);
			frmPersona.txtNombre.setRequestFocusEnabled(true);
			flagModificar = true;
			
		}
		
		if ( e.getSource() == frmPersona.btnEliminar ){
			
			modPersona.setDocumento(Integer.parseInt(frmPersona.txtDni.getText()));
			modPersona.setRazon(frmPersona.txtNombre.getText());
			contPersona.eliminar(modPersona);
			
		}
		
		/******************************************************************************
		 * Botones de Primero - Anterior - Siguiente - Ultimo
		 */
		if (e.getSource() == frmPersona.btnPrimero){
			
			if(contPersona.getBotonPrimero() != null){
				modPersona = contPersona.getBotonPrimero();
				frmPersona.txtDni.setText(String.valueOf(modPersona.getDocumento()));
				frmPersona.txtNombre.setText(modPersona.getRazon());
				
			}else{
				JOptionPane.showMessageDialog(null, "No hay registros anteriores al actual", "Advertencia", JOptionPane.WARNING_MESSAGE);
			}
			
			
		}
		
		if (e.getSource() == frmPersona.btnAnterior){
			
			if (contPersona.getBotonAnterior(modPersona) != null){
				modPersona = contPersona.getBotonAnterior(modPersona);
				frmPersona.txtDni.setText(String.valueOf(modPersona.getDocumento()));
				frmPersona.txtNombre.setText(String.valueOf(modPersona.getRazon()));
				
			}else{
				JOptionPane.showMessageDialog(null, "No hay registros anteriores al actual", "Advertencia", JOptionPane.WARNING_MESSAGE);
			}
			
			
		}
		
		if (e.getSource() == frmPersona.btnSiguiente){
			
			if(contPersona.getBotonSiguiente(modPersona) != null){
				modPersona = contPersona.getBotonSiguiente(modPersona);
				frmPersona.txtDni.setText(String.valueOf(modPersona.getDocumento()));
				frmPersona.txtNombre.setText(String.valueOf(modPersona.getRazon()));
				
			}else{
				JOptionPane.showMessageDialog(null, "Último registro", "Advertencia", JOptionPane.WARNING_MESSAGE);
			}
			
			
		}
		
		if (e.getSource() == frmPersona.btnUltimo){
			
			if(contPersona.getBotonUltimo(modPersona) != null){
				modPersona = contPersona.getBotonUltimo(modPersona);
				frmPersona.txtDni.setText(String.valueOf(modPersona.getDocumento()));
				frmPersona.txtNombre.setText(String.valueOf(modPersona.getRazon()));
				
			}else{
				JOptionPane.showMessageDialog(null, "Último registro","Advertencia", JOptionPane.WARNING_MESSAGE);
			}
			
			
		}		
		
		if (e.getSource() == frmPersona.btnImprimir){
			
			modPersona.setDocumento(Integer.parseInt(frmPersona.txtDni.getText()));
			modPersona.setRazon(frmPersona.txtNombre.getText());
			
			if ( contPrintPersona.generarReportePersona(modPersona) ){
				contPrintPersona.abrirReportePersona();
			}
			
		}
		
		if (e.getSource() == frmPersona.btnDeshacer){
			this.limpiarFormPersona();
			frmPersona.setEstadoEdicion(false);
			frmPersona.txtDni.setRequestFocusEnabled(false);
		}		
		
	}
	
	public void habilitarBtnGuardar(Boolean valor){
		frmPersona.btnGuardar.setEnabled(valor);
	}
	public void limpiarFormPersona(){
		frmPersona.txtId.setText(null);
		frmPersona.txtDni.setText(null);
		frmPersona.txtNombre.setText(null);
	}
	

}
