package com.dbf.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import com.dbf.controller.ControllerPrintPersona;
import com.dbf.model.Persona;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class ControllerPrintPersona {
	
public boolean generarReportePersona(Persona persona){
		
		try {
			JasperReport jasperReport = JasperCompileManager.compileReport("E:\\Documentos\\Desarrollos\\EclipseProjects\\MiAplicacionSwing2\\src\\reportes\\reportPersonaPdf.jrxml");
			JRDataSource datasource = new JREmptyDataSource();
			
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("documentoPersona", String.valueOf(persona.getDocumento()));
			parameters.put("razonSocialPersona", String.valueOf(persona.getRazon()));
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, datasource);
			
			JasperExportManager.exportReportToPdfFile(jasperPrint, "E:\\Documentos\\Desarrollos\\EclipseProjects\\MiAplicacionSwing2\\src\\reportes\\reportPersonaPdf.pdf");
			
			return true;
			
		} catch (JRException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	
	public void abrirReportePersona(){
		try {
			String url = "E:\\Documentos\\Desarrollos\\EclipseProjects\\MiAplicacionSwing2\\src\\reportes\\reportPersonaPdf.pdf";
			ProcessBuilder processBuilder = new ProcessBuilder();
			processBuilder.command("cmd.exe", "/c", url);
			processBuilder.start();
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
			Logger.getLogger(ControllerPrintPersona.class.getName()).log(null, e);
		}
	}

}
