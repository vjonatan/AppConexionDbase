package com.dbf.controller;

import java.util.ArrayList;
import java.util.List;

import com.dbf.dao.PersonaDaoImpl;
import com.dbf.idao.IPersonaDao;
import com.dbf.model.Persona;

public class ControllerPersona {
	
	public ControllerPersona () {
	}
	
	//llama al DAO para guardar un Persona
	public void registrar(Persona persona) {
		IPersonaDao dao= new  PersonaDaoImpl();
		dao.registrar(persona);
	}
	
	//llama al DAO para actualizar un Persona
	public void actualizar(Persona persona) {
		IPersonaDao dao= new  PersonaDaoImpl();
		dao.actualizar(persona);
	}
	
	//llama al DAO para eliminar un Persona
	public void eliminar(Persona persona) {
		IPersonaDao dao= new  PersonaDaoImpl();
		dao.eliminar(persona);
	}
	
	//llama al DAO para obtener todos los Personas y luego los muestra en la vista
	public void verPersonas(){
		List<Persona> personas = new ArrayList<Persona>();
		IPersonaDao dao = new  PersonaDaoImpl();
		personas = dao.obtener();
		//vista.verPersonas(personas);
	}
	
	//llama al DAO para obtener el primer registro de la base
	public Persona getBotonPrimero(){
		IPersonaDao dao = new PersonaDaoImpl();
		Persona per = new Persona();
		per = dao.getBotonPrimero();
		
		return per;
	}
	
	//llama al DAO para obtener el registro anterior del actual de la base
	public Persona getBotonAnterior(Persona persona){
		IPersonaDao dao = new PersonaDaoImpl();
		Persona per = new Persona();
		per = dao.getBotonAnterior(persona);
		
		return per;
	}
	
	//llama al DAO para obtener el registro siguiente del actual de la base
	public Persona getBotonSiguiente(Persona persona){
		IPersonaDao dao = new PersonaDaoImpl();
		Persona per = new Persona();
		per = dao.getBotonSiguiente(persona);
		
		return per;
	}
	
	//llama al DAO para obtener el registro ultimo del actual de la base
	public Persona getBotonUltimo(Persona persona){
		IPersonaDao dao = new PersonaDaoImpl();
		Persona per = new Persona();
		per = dao.getBotonUltimo(persona);
		
		return per;
	}	
	

}
