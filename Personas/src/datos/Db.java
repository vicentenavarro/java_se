package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

		public static Connection con;
		
		public static void init(){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/personas","root","");
			}
			catch(ClassNotFoundException cnfe){
				System.out.println("--- No se puede conectar con la base de datos. Por favor, consulte a su administrador de sistemas---");
			}
			catch(SQLException sqle){
				System.out.println("---Base de datos inexistente o no se puede contectar. Por favor, contacte con el ademninstrador de la base de datos---");
			}
		}
		public static void cerrar(){
			try{
				con.close();}
				catch(SQLException sqle){
					
				}
			}
		
		
		public static Connection getConexion(){
			return con;
		}
}
