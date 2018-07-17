package com.dbf.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.connection.Conexion;
import com.dbf.idao.IPersonaDao;
import com.dbf.model.Persona;

public class PersonaDaoImpl implements IPersonaDao {

	@Override
	public boolean registrar(Persona persona) {
		
		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO personas VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			con = Conexion.conectar();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, persona.getId());
			ps.setInt(2, persona.getDocumento());
			ps.setInt(3, persona.getTipoDocumento());
			ps.setString(4, persona.getRazon());
			ps.setString(5, persona.getCalle());
			ps.setString(6, persona.getUbicacion());
			ps.setString(7, persona.getCodigoLocalizacion());
			ps.setString(8, persona.getTelefono());
			ps.setDate(9, (Date) persona.getFechaNacimiento());
			ps.setString(10, persona.getSexo());
			ps.setString(11, persona.getEstadoCivil());
			ps.setString(12, persona.getTrabajo());
			ps.setString(13, persona.getTipoCalle());
			ps.setString(14, persona.getTipoUbicacion());
			ps.setString(15, persona.getTipoCodigoLocalidad());
			ps.setString(16, persona.getTipoTelefono());
			ps.setString(17, persona.getTipoSeccion());
			ps.setDouble(18, persona.getSueldo());
			ps.setDate(19, (Date) persona.getFechaActual());
			
			ps.execute();
			
			con.close();
			registrar=true;
			System.out.println(registrar);
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}
		
		
		return registrar;
	}

	@Override
	public List<Persona> obtener() {
		
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		
		String sql = "SELECT TOP 1 * FROM personas WHERE fbaja IS NULL ORDER BY docu";
		//String sql = "SELECT deleted('personas'), * FROM personas ORDER BY docu";
		
		List<Persona> listaPersona = new ArrayList<Persona>();
		
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				Persona p = new Persona();
				p.setDocumento(rs.getInt(2));
				p.setRazon(rs.getString(4));
				
				listaPersona.add(p);
			}
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtenere");
			e.printStackTrace();
		}
		
		return listaPersona;
	}
	
	@Override
	public int obtenerXdocumento(Persona persona) {
		boolean buscar = false;
		int rows = 0;
		
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		
		String sql = "SELECT COUNT(*) FROM personas WHERE docu = ?";
		
		try {
			con = Conexion.conectar();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, persona.getDocumento());
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				rows = rs.getInt(1);
			}else{
				System.out.println("Error: no hay registros para el documento " + persona.getDocumento());
			}
			
			con.close();
			System.out.println(buscar);
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtenerXdocumento");
			e.printStackTrace();
		}
		
		return rows;
	}

	@Override
	public boolean actualizar(Persona persona) {
		
		boolean actualizar = false;
		
		Statement stm = null;
		Connection con = null;
		String sql = "UPDATE personas SET tdocu = ?, razon = ?, calle = ?, ubica = ?, cloca = ?"
				+ "telefono = ?, nacido = ?, sexo = ?, ecivil = ?, trabajo = ?, tcalle = ?, tubica = ?"
				+ "tcloca = ?, ttelefo = ?, tseccion = ?, sueldo = ?, factual = ? WHERE docu = ?";
		
		try {
			con = Conexion.conectar();
			
			PreparedStatement ps = con.prepareStatement(sql);
			//ps.setInt(1, persona.getId());
			
			ps.setInt(1, persona.getTipoDocumento());
			ps.setString(2, persona.getRazon());
			ps.setString(3, persona.getCalle());
			ps.setString(4, persona.getUbicacion());
			ps.setString(5, persona.getCodigoLocalizacion());
			ps.setString(6, persona.getTelefono());
			ps.setDate(7, (Date) persona.getFechaNacimiento());
			ps.setString(8, persona.getSexo());
			ps.setString(9, persona.getEstadoCivil());
			ps.setString(10, persona.getTrabajo());
			ps.setString(11, persona.getTipoCalle());
			ps.setString(12, persona.getTipoUbicacion());
			ps.setString(13, persona.getTipoCodigoLocalidad());
			ps.setString(14, persona.getTipoTelefono());
			ps.setString(15, persona.getTipoSeccion());
			ps.setDouble(16, persona.getSueldo());
			ps.setDate(17, (Date) persona.getFechaActual());
			ps.setInt(18, persona.getDocumento());
			
			ps.executeUpdate();
			
			con.close();
			actualizar=true;
			System.out.println(actualizar);
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}
		
		return actualizar;
	}

	@Override
	public boolean eliminar(Persona persona) {
		
		boolean eliminar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "DELETE FROM personas WHERE docu = ?";
		
		try {
			con = Conexion.conectar();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, persona.getDocumento());
			
			ps.execute();
			
			con.close();
			System.out.println(eliminar);
			
		} catch (Exception e) {
			System.out.println("Error: Clase ClienteDaoImple, método eliminar");
			e.printStackTrace();
		}

		return eliminar;
	}

	@SuppressWarnings("null")
	@Override
	public Persona getBotonPrimero() {
		boolean buscar = false;
		
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		
		Persona persona = null;
		
		String sql = "SELECT TOP 1 * FROM personas WHERE fbaja IS NULL ORDER BY docu";
		
		try {
			con = Conexion.conectar();
			PreparedStatement ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				persona = new Persona();
				persona.setDocumento(rs.getInt(2));
				persona.setRazon(rs.getString(4));
				//persona.setDocumento(rs.getInt("docu"));
				//persona.setRazon(rs.getString("razon"));
			}else{
				System.out.println("Error: no se pudo recuperar el primer registro.");
			}
			
			con.close();
			System.out.println(buscar);
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método getBotonPrimero");
			e.printStackTrace();
			return persona;
		}
		
		return persona;
	}

	@Override
	public Persona getBotonAnterior(Persona persona) {
		boolean buscar = false;
		
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		
		Persona per = null;
		
		String sql = "SELECT TOP 1 docu, razon FROM personas WHERE fbaja IS NULL AND docu < ? ORDER BY docu DESC";
		
		try {
			con = Conexion.conectar();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, persona.getDocumento());
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				per = new Persona();
				per.setDocumento(rs.getInt(1));
				per.setRazon(rs.getString(2));
			}else{				
				System.out.println("Error: no se pudo recuperar el primer registro.");
			}
			
			con.close();
			System.out.println(buscar);
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método getBotonAnterior");
			e.printStackTrace();
			return null;
		}
		
		return per;
	}

	@Override
	public Persona getBotonSiguiente(Persona persona) {
		boolean buscar = false;
		
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		
		Persona per = null;
		
		String sql = "SELECT TOP 1 docu, razon FROM personas WHERE fbaja IS NULL AND docu > ? ORDER BY docu ASC";
		
		try {
			con = Conexion.conectar();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, persona.getDocumento());
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				per = new Persona();
				per.setDocumento(rs.getInt(1));
				per.setRazon(rs.getString(2));
			}else{
				System.out.println("Error: no se pudo recuperar el primer registro.");
			}
			
			con.close();
			System.out.println(buscar);
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método getBotonSiguiente");
			e.printStackTrace();
			return null;
		}
		
		return per;
	}

	@Override
	public Persona getBotonUltimo(Persona persona) {
		boolean buscar = false;
		
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		
		Persona per = null;
		
		String sql = "SELECT TOP 1 docu, razon FROM personas WHERE fbaja IS NULL AND docu > ? ORDER BY docu DESC";
		
		try {
			con = Conexion.conectar();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, persona.getDocumento());
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				per = new Persona();
				per.setDocumento(rs.getInt(1));
				per.setRazon(rs.getString(2));
			}else{
				System.out.println("Error: no se pudo recuperar el último registro.");
			}
			
			con.close();
			System.out.println(buscar);
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método getBotonUltimo");
			e.printStackTrace();
			return null;
		}
		
		return per;
	}
	
	

}
