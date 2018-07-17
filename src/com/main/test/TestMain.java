package com.main.test;

import com.dbf.dao.PersonaDaoImpl;
import com.dbf.idao.IPersonaDao;
import com.dbf.model.Persona;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestMain {
	
	public static void obtenerListaPersonas(){
		List<Persona> personas = new ArrayList<Persona>();
		IPersonaDao personaDao = new PersonaDaoImpl();
		personas = personaDao.obtener();
		System.out.println("Cantidad de Registros: " + personas.size());
		for (Persona persona : personas) {
			System.out.println("Datos del Cliente: Documento = "+ persona.getDocumento() + " -- Razon " + persona.getRazon());
		}
	}
	
	public static void registrarPersona() throws ParseException{
		Date fecha = new Date();
		java.sql.Date fecha2 = new java.sql.Date(fecha.getTime());

		Double sueldo = 0.0;
		
		
		Persona persona = new Persona(0, 32190367, 1, "Razon Test 13-7-2018", "Javier Videla 5418", 
									 "5418", "001", "4520022", fecha2, 
									 "M", "S", "Arquitecto de Software", "Pasaje", "Norte", "051", 
									 "Celular", "UNO", sueldo , fecha2 );
		
		IPersonaDao personaDao = new PersonaDaoImpl();
		personaDao.registrar(persona);
		
		
	}

	public static void main(String[] args) {
		
		obtenerListaPersonas();
		/*
		try {
			registrarPersona();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
