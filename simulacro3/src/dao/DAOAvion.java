package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//Importo los modelos  donde se ha creado la conexion y los datos.
import datos.Db; 
import modelos.Avion;

public class DAOAvion {
Connection con =Db.getConexion(); //Para conectar con la base de datos
	
	/**
	 * Creo el modelo para inserta productos en la base de datos.
	 */
	
	public boolean insertar(Avion p){
		//Esta es la sentencia de sql que inserta datos en la tabla.
		//No se pone idproducto porque es AUTO_INCREMENT.
		String sql= "insert into aviones (descripcion,peso) values (?,?)"	;
		/**
		 * Creo Un objeto PreparedStatement se usa para sentencias SQL
		 *  que toman uno o más parámetros como argumentos de entrada 
		 */
		try(PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1,p.getDescripcion());
			ps.setDouble(2,p.getPeso());
			ps.executeUpdate();
			return true;
			
			}
		catch(SQLException sqle){
			System.out.println("No se ha podido crear el nuevo avion");
			return false;
		}
	}
		
		/**
		 * Creo el modelo para actualizar producto(cambiar algo)
		 */
		public boolean actualizar(Avion a){
			//Esta es la sentencia de sql que inserta datos en la tabla.
			
			String sql= "update aviones set descripcion=? ,peso=? where idavion=?";
			
			try(PreparedStatement ps = con.prepareStatement(sql)){
				ps.setString(1,a.getDescripcion());
				ps.setDouble(2,a.getPeso());
				ps.setInt(3, a.getIdavion());
				ps.executeUpdate();//Se utiliza para insertar, actualizar
				return true;
				
				}
			catch(SQLException sqle){
				System.out.println("No se ha podido actualizar el avion");
				return false;
			}
		}
		public boolean borrar(int idavion){
			//Esta es la sentencia de sql que inserta datos en la tabla.
			//Solo se pone que borre idproducto porque las bases de datos borran por lineas.
			String sql= "delete from aviones  where idavion=?";
			
			try(PreparedStatement ps = con.prepareStatement(sql)){
				ps.setInt(1, idavion);
				ps.executeUpdate();//Se utiliza para insertar, actualizar
				return true;
				
				}
			catch(SQLException sqle){
				System.out.println("No se ha podido borrar avion");
				return false;
			}
		}
		public Avion read(int idproducto){
			Avion p=null;
			String sql="select descripcion,peso from aviones where idavion=?";
			try(PreparedStatement ps = con.prepareStatement(sql)){
				ps.setInt(1, idproducto);
				ResultSet rs=ps.executeQuery();//executeQuery se utiliza para consultas
				//next() rescorre la base datos linea por linea.
				if(rs.next()){
					//Creo el objeto que he definido fuera como null
					p=new Avion(idproducto,rs.getString("descripcion"),rs.getDouble("peso"));
				}
				rs.close(); //Se cierra la base de datos;
			}
			catch(SQLException sqle){
				System.out.println("Fallo al recuperar Avion");
			}
			return p;
					
				
			}
		/**
		 * Se crea con ArrayLIst el array para listar los datos
		 * de la base de datos.
		 */
		public ArrayList<Avion> listar(){
			ArrayList<Avion> listado=new ArrayList<Avion>();
			Avion p=null;
			String sql="select * from aviones order by idavion asc";
			try(PreparedStatement ps = con.prepareStatement(sql)){
				ResultSet rs=ps.executeQuery();//executeQuery se utiliza para consultas
				//next() rescorre la base datos linea por linea.
				while(rs.next()){
					
					p=new Avion(rs.getInt("idavion"),rs.getString("descripcion"),rs.getDouble("peso"));
					listado.add(p);
				}
				
			}
			catch(SQLException sqle){
	    		System.out.println("No se puede leer de la base de datos");
	    	}
	    	
	    	return listado;
			
		}
}
