package datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	
	/*
	 * Declaro las variables que se van autilizar para la conexion a mysql
	 */
	private static final String password="";
	private static final String user="root";
	private static final String url="jdbc:mysql://localhost:3306/aeronaves";
	private static Connection conexion;
	
	/**
	 * Declaro el modelo para iniciar la conexion a la base de datos.
	 */
	
	public static boolean init(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");//Carga driver
			conexion=DriverManager.getConnection(url,user,password);
			return true;//Si conecta envia true.
		}
		
		/**
		 * Creo las Excepciones en caso que no pueda cargar el driver o
		 * conectarse a la base de datos
		 */
		catch(ClassNotFoundException cnfe){
			/*
			 * En la documentaci�n nos dice que esta 
			 * excepci�n se produce cuando el ClassLoader intenta 
			 * leer la descripci�n de una clase, y la definici�n de 
			 * dicha clase no es encontrada.
			 */
			System.out.println("Driver jdbc no encontrado");
			return false;
			
		}
		catch(SQLException sqle){
			System.out.println("No se se puede conectar a la base de datos");
			return false;
		}
	}
	public static Connection getConexion(){
		return conexion;
		/*
		 * El objeto Connection proporciona una conexi�n est�tica 
		 * a la base de datos. Esto significa que hasta que se llame
		 *  en forma expl�cita a su m�todo close() para cerrar la conexi�n
		 *  o se destruya el objeto Connection, la conexi�n a la base de datos
		 *   permanecer� activa.
		 */
	}
	public static void cerrar(){
		try{
			conexion.close();
		}
		catch(SQLException sqle){
			
		}
	}
	
	
	
}
	
