package com.main.test;

import java.sql.*;
import java.io.*;

public class MainDdfAccess {
	public static void main(String argv[]) {
		String DRIVER, URL, USER, PASSWD;
		try {
			String NombreBase = "D:/PERSONAS.dbf";
			//String manejadorDB = "jdbc:odbc:Personas={Microsoft dBASE Driver (*.dbf)};DBQ=" + NombreBase;
			String manejadorDB = "jdbc:odbc:Personas";
			DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
			URL = manejadorDB;
			USER = "";
			PASSWD = "";
			
			////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////			
			   // LISTA TODAS LOS REGISTROS DE LA TABLA PERSONAS.DBF
			////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////
			/*			
			// Cargar un driver
			Class.forName(DRIVER);
			
			// Crear la conexión a la base de datos
			Connection con = DriverManager.getConnection(URL, "", "");
			String gs = "select TOP 2 docu, tdocu, razon, calle, trabajo from PERSONAS ORDER BY docu ASC";
			
			// Crear el objeto Statement
			Statement stmt = con.createStatement();
			
			// Ejecuta SQL Statement y retorna conjunto de resultados
			ResultSet rsDA = stmt.executeQuery(gs);
			
			// Iteraciones del ResultSet
			ResultSetMetaData md = rsDA.getMetaData();
			System.out.println("Cantidad de registros: " + md.getColumnCount());
			boolean filas = rsDA.next();
			while (filas) {
				for (int i = 1; i <= md.getColumnCount(); i++) {
					System.out.println("i=>> " + i);
					System.out.println(md.getColumnName(i) + ": " + rsDA.getString(i) + " | ");
					
				}
				System.out.println("\n");
				filas = rsDA.next();
			}
			rsDA.close();
			*/
			////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////			
			
			
			////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////
			/*   // ACTUALIZA REGISTROS
			////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////
			
			
			// Cargar un driver
			Class.forName(DRIVER);
			
			// Crear la conexión a la base de datos
			Connection con = DriverManager.getConnection(URL, "", "");
			String gs = "update PERSONAS set calle = 'CALLE POCHO LA PANTERA YUPIIIIIIIIIIIIIIIIIIIIII'";
			
			// Crear el objeto Statement
			Statement stmt = con.createStatement();
			
			// Ejecuta SQL Statement y retorna conjunto de resultados
			int valorRetornado = stmt.executeUpdate(gs);
			System.out.println("cantidad de registros actualizados: " + valorRetornado);
			con.commit();
			stmt.close();	
			
			////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////
			*/
			
			////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////
			    // ELIMINAR REGISTROS
			///////////////////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////////////////
					
			// Cargar un driver
			Class.forName(DRIVER);
			
			// Crear la conexión a la base de datos
			Connection con = DriverManager.getConnection(URL, "", "");
			String gs = "delete from PERSONAS where docu=1";
			
			// Crear el objeto Statement
			Statement stmt = con.createStatement();
			
			// Ejecuta SQL Statement y retorna conjunto de resultados
			int valorRetornado = stmt.executeUpdate(gs);
			System.out.println("cantidad de registros eliminados: " + valorRetornado);
			con.commit();
			stmt.close();	
			
			////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////
			
			
			////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////
			/*        // INSERTAR REGISTROS
			///////////////////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////////////////
			
			// Cargar un driver
			Class.forName(DRIVER);
			
			// Crear la conexión a la base de datos
			Connection con = DriverManager.getConnection(URL, "", "");
			String gs = "insert into PERSONAS values (NULL, 32190000, NULL, 'TESTING LOCO', 'CALLE LOCA 123', NULL, NULL, '4520000', '01/01/2900', 'M',"
													+ "'S', 'TRABAJO DE LO QUE SEA', 'TIPO DE CALLE', '000', '11', '6666666', 'SEXTA SECCION', 1.22, '01/01/2900')";
			
			// Crear el objeto Statement
			Statement stmt = con.createStatement();
			
			// Ejecuta SQL Statement y retorna conjunto de resultados
			int valorRetornado = stmt.executeUpdate(gs);
			System.out.println("cantidad de registros insertados: " + valorRetornado);
			con.commit();
			stmt.close();	
			*/
			
			
		}
		// Produce una excepción si encuentra un error en el bloque try
		catch (java.lang.Exception ex) {
			System.out.println("**Error en los datos. **");
			ex.printStackTrace();
		}
	}
}
