package dao;

import datos.Db;
import modelos.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOPersona {

		private Connection con=Db.getConexion();
		
	public boolean create(Persona p){
		
		Connection con=Db.getConexion();
		String sql="insert into persona (dni,nombre) values (?,?)";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,p.getDni());
			ps.setString(2,p.getNombre());
			ps.executeUpdate();
			ps.close();
			return true;
		}
		catch(SQLException sqle){
			return false;
		}
	}
	/**
	 * Metodo para que no devuelva una persona
	 * @param dni
	 * @return
	 */
	public Persona read(String dni){
		Persona p=null;
		
		String sql="select nombre from persona where dni=?";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, dni);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){//Utilizamos if porque solo nos va a devolver una fila ya que solo va haber una persona con ese dni
				p=new Persona(dni,rs.getString("nombre"));
			}
			rs.close();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			
		}
		return p;
	}
	/*
	 * Para actualizar los datos de una persona
	 */
	public boolean update(Persona p){
		String sql="update persona set"
				+ " nombre=?"//Ha que pner un espacio al principio
				+ " where dni=?";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, p.getNombre());
			ps.setString(2, p.getNombre());
			ps.executeUpdate();
			return true;
			
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			return false;
	}
	}
	/*
	 * Modelo para borrar datos de la base de datos
	 */
	
	public boolean delete(Persona p){
		String sql="delete from persona where dni=?";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, p.getDni());
			ps.executeUpdate();
			
			return true;
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			return false;
		}
	}
	public ArrayList<Persona> listar(){
		ArrayList<Persona> personas=new ArrayList<Persona>();
		
		String sql="select * from persona order by nombre";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Persona p=new Persona(rs.getString("dni"),rs.getString("nombre"));
				personas.add(p);
			}
			rs.close();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		return personas;
	}
}
