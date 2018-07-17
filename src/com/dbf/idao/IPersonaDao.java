package com.dbf.idao;

import java.util.List;

import com.dbf.model.Persona;

public interface IPersonaDao {
	
	public boolean registrar(Persona persona);
	public List<Persona> obtener();
	public int obtenerXdocumento(Persona persona);
	public boolean actualizar(Persona persona);
	public boolean eliminar (Persona persona);
	public Persona getBotonPrimero();
	public Persona getBotonAnterior(Persona persona);
	public Persona getBotonSiguiente(Persona persona);
	public Persona getBotonUltimo(Persona persona);
	
	

}
