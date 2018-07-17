package com.dbf.model;

import java.util.Date;

public class Persona {
	private int id;
	
	private int documento;
	private int tipoDocumento;
	private String razon;
	private String calle;
	private String ubicacion;
	private String codigoLocalizacion;
	private String telefono;
	private Date fechaNacimiento;
	private String sexo;
	private String estadoCivil;
	private String trabajo;
	private String tipoCalle;
	private String tipoUbicacion;
	private String tipoCodigoLocalidad;
	private String tipoTelefono;
	private String tipoSeccion;
	private double sueldo;
	private Date fechaActual;
	
	public Persona() {
	}

	public Persona(int id, int documento, int tipoDocumento, String razon, String calle, String ubicacion,
			String codigoLocalizacion, String telefono, Date fechaNacimiento, String sexo, String estadoCivil,
			String trabajo, String tipoCalle, String tipoUbicacion, String tipoCodigoLocalidad, String tipoTelefono,
			String tipoSeccion, double sueldo, Date fechaActual) {
		this.id = id;
		this.documento = documento;
		this.tipoDocumento = tipoDocumento;
		this.razon = razon;
		this.calle = calle;
		this.ubicacion = ubicacion;
		this.codigoLocalizacion = codigoLocalizacion;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.trabajo = trabajo;
		this.tipoCalle = tipoCalle;
		this.tipoUbicacion = tipoUbicacion;
		this.tipoCodigoLocalidad = tipoCodigoLocalidad;
		this.tipoTelefono = tipoTelefono;
		this.tipoSeccion = tipoSeccion;
		this.sueldo = sueldo;
		this.fechaActual = fechaActual;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public int getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getRazon() {
		return razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getCodigoLocalizacion() {
		return codigoLocalizacion;
	}

	public void setCodigoLocalizacion(String codigoLocalizacion) {
		this.codigoLocalizacion = codigoLocalizacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public String getTipoCalle() {
		return tipoCalle;
	}

	public void setTipoCalle(String tipoCalle) {
		this.tipoCalle = tipoCalle;
	}

	public String getTipoUbicacion() {
		return tipoUbicacion;
	}

	public void setTipoUbicacion(String tipoUbicacion) {
		this.tipoUbicacion = tipoUbicacion;
	}

	public String getTipoCodigoLocalidad() {
		return tipoCodigoLocalidad;
	}

	public void setTipoCodigoLocalidad(String tipoCodigoLocalidad) {
		this.tipoCodigoLocalidad = tipoCodigoLocalidad;
	}

	public String getTipoTelefono() {
		return tipoTelefono;
	}

	public void setTipoTelefono(String tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}

	public String getTipoSeccion() {
		return tipoSeccion;
	}

	public void setTipoSeccion(String tipoSeccion) {
		this.tipoSeccion = tipoSeccion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Date getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(Date fechaActual) {
		this.fechaActual = fechaActual;
	}
	
	
	
	
	

}
