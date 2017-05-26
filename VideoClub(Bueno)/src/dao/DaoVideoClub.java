package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

import datos.Db;
import modelos.VideoClub;

public class DaoVideoClub {
	Connection con =Db.getConexion();
	
public boolean insertar(VideoClub p){
	String sql="insert into peliculas (titulo,director,estreno,genero,cantidad) values (?,?,?,?,?)";
	
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, p.getTitulo());
		ps.setString(2, p.getDirector());
		ps.setInt(3, p.getEstreno());
		ps.setString(4, p.getGenero());
		ps.setInt(5, p.getCantidad());
		ps.executeUpdate();
		return true;
	}
	catch(SQLException sqle){
		System.out.println("No se ha podido crear");
		return false;
	}
}
public boolean actualizar(VideoClub p){
	String sql="uptdate peliculas set director=? ,estreno=? , genero=? , cantidad=? where titulo=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(1, p.getDirector());
		ps.setInt(2, p.getEstreno());
		ps.setString(3, p.getGenero());
		ps.setInt(4, p.getCantidad());
		ps.setString(5, p.getTitulo());
		ps.executeUpdate();
		return true;
	}
	catch(SQLException sqle){
		System.out.println("No se ha podido actulizar la pelicula");
		return false;
	}
	
}
public boolean borrar(String titulo){
	String sql="delete from peliculas where titulo=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, titulo);
		ps.executeUpdate();
		return true;
	}
	catch(SQLException sqle){
		System.out.println("No se ha podido borrar la pelicula");
		return false;
	}
}
public VideoClub read(String genero){
	VideoClub p=null;
	String sql="select titulo,director,estreno,cantidad where genero=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,genero);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			p=new VideoClub(rs.getString("titulo"),rs.getString("director"),rs.getInt("estreno"),genero,rs.getInt("cantidad"));
		}
		rs.close();	
	}
	catch(SQLException sqle){
		System.out.println("Error al listar base datos");
	}
	return p;
}
public ArrayList<VideoClub> listar(){
	ArrayList<VideoClub> listado=new ArrayList<VideoClub>();
	VideoClub p=null;
	String sql="selet* from peliculas order by titulo asc";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			p=new VideoClub(rs.getString("titulo"),rs.getString("director"),rs.getInt("estreno"),rs.getString("genero"),rs.getInt("cantidad"));
			listado.add(p);
		}
	}
	catch(SQLException sqle){
		System.out.println("No se puede leer de la base de datos");
	}
	return listado;
}


}
	
	
		
	
	

