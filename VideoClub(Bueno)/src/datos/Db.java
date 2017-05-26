package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

	private static final String password="";
	private static final String user="";
	private static final String url="jdbc:mysql://localhost:3306/videoclub";
	private static Connection conexion;
	
	public static boolean init(){
		try{
			Class.forName("con.mysql.jdbc.Driver");//Carga el driver
			conexion=DriverManager.getConnection(url,user,password);
			return true;
		}
		catch(ClassNotFoundException cnfe){
			System.out.println("Driver no encontrado");
			return false;
		}
		catch(SQLException sqle){
			System.out.println("No se puede conectar a la base de datos");
			return false;
		}
	}
	public static Connection getConexion(){
		return conexion;
		/*
		 * El objeto Connection proporciona una conexión estática 
		 * a la base de datos. Esto significa que hasta que se llame
		 *  en forma explícita a su método close() para cerrar la conexión
		 *  o se destruya el objeto Connection, la conexión a la base de datos
		 *   permanecerá activa.
		 */
		
	}
	public static void cerrar(){
		try{
			conexion.close();
		}
		catch(SQLException sql){
			
		}
	}
}
