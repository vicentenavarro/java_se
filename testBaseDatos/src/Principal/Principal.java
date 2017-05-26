package Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement; //prepara una orden sql para su ejecución.
import java.sql.ResultSet;
public class Principal {
	private static Connection con;
	
	public static void main(String[]  args){
		
		
		/**
		 * Siempre que vayamos a usar una base de datos hay que hacer esto.
		 */
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/personas","root","");//direccion del host
			ResultSet rs=getlistado();
			/*
			 * Imprimir todas las filas que nos han salido en una tabla pero no
			 * tienes porque guardarla en la memoria.
			 * con rs.next() va avanzado en bilas y devuelve un booleano true hasta que no
			 * encuentre más filas.
			 */
			while(rs.next()){//Nos muestra el valor de las filas
				System.out.println("D.N.I: "+rs.getString("dni")+" Nombre: "+rs.getString("nombre"));
			}
			rs.close(); //Hay que cerrar el Resulet
			insertarPersona("54785475T","Francisco El cigala");
		}
		/*
		 * Hay que crear excepciones.
		 */
		catch(ClassNotFoundException cnfe){
				cnfe.printStackTrace();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
	}
	/**
	 * Creamos un metodo en el que lanza la consulta y nos devuelve el ResultSet
	 */
	private static ResultSet getlistado(){
		
		ResultSet rs=null;
		
		try{
		String sql="select* from persona";// "pesona es la tabla de la base de datos(prepara la consulta)
		PreparedStatement stm=con.prepareStatement(sql);
		rs=stm.executeQuery();
		
		}catch(SQLException sqle){
			sqle.printStackTrace();
			
		}
		return rs;
		}
	/**
	 * Hacemos un metodo para insertar datos
	 */
	public static void insertarPersona(String dni, String nombre){
		try{
			String sql="insert into persona(dni,nombre) values (?,?)";//Impide ataquer por inyección de sql;
			PreparedStatement stm=con.prepareStatement(sql);
			stm.setString(1,dni);//Sustituye la primera ?
			stm.setString(2,nombre);// Sustituye la segunda ?
			stm.executeUpdate();//De inserción sin devolución se puede borrar modificar e insertar.
			
			}catch(SQLException sqle){
				sqle.printStackTrace();
				
			}
	}
}


