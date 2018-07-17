package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static Conexion instancia;
	
	public static Conexion getInstancia(){
		if(instancia ==null){
			instancia = new Conexion();
		}
		return instancia;
	}
	
	public static Connection conectar(){
		Connection con = null;
		
		String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
		String URL = "jdbc:odbc:Personas";
		String USER = "";
		String PASSWD = "";
		
		try {
			con = DriverManager.getConnection(URL, USER, PASSWD);
			if(con != null)
				System.out.println("Conectado");
			
		} catch (SQLException e) {
			System.out.println("No se pudo conectar");
			e.printStackTrace();
		}
		
		return con;
		
	}

}
