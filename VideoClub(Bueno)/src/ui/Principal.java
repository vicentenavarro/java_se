package ui;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import dao.DaoVideoClub;
import datos.Db;
import modelos.VideoClub;
public class Principal {
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(Db.init()){
			boolean seguir=true;
			
			while(seguir){
				imprimirMenu();//Para dejar un espacio.
				System.out.println();
				System.out.println("Introduzca una opción: ");
				
				String s=sc.nextLine();
				s=s.trim();//trim elimina caracteres.
				if(s.length()>0){
					char o=s.charAt(0);//cartAt te devuelve el primer caracter
					switch(o){
					case '1':
						listarPeliculas();
						break;
					case '2':
						mostrarGenero();
						break;
					case '3':
						modificarPelicula();
						break;
					case '4':
						borrarPelicula();
						break;
					case '5':
						insertarPelicula();
						break;
					case '6':
						seguir=false;
						Db.cerrar();
						break;

					}
				}
			}
		}
	}
	public static void imprimirMenu(){
		System.out.println("               MENU             ");
		System.out.println("--------------------------------");
		System.out.println("1.- Listar Peliculas");
		System.out.println("2.- Mostrar peliculas por genero");
		System.out.println("3.- Modificar Pelicula");
		System.out.println("4.- Borrar Pelicula");
		System.out.println("5.- Insertar nueva Pelicula");
		System.out.println("--------------------------------");
		System.out.println("6.- Salir");
	}

private static void listarPeliculas(){
	DaoVideoClub dao=new DaoVideoClub();
	ArrayList<VideoClub> listado=dao.listar();
	
	System.out.println("           Listado de Peliculas         ");
	System.out.println("----------------------------------------");
	for(VideoClub p : listado){
		System.out.println(p);
	}
}
	



private static void mostrarGenero(){
	System.out.println("Introduzca el genero: ");
	String genero=sc.nextLine();
	
	DaoVideoClub dao=new DaoVideoClub();
	VideoClub p=dao.read(genero);
	
	System.out.println("Del "+genero+"hay las siguientes peliculas"
			+"\n"+p);
		
}
private static void modificarPelicula(){
	System.out.println("Introduzca el titulo: ");
	String titulo=sc.nextLine();
	System.out.println("Introduzca el director: ");
	String director=sc.nextLine();
	System.out.println("Introduzca el estreno: ");
	int estreno=sc.nextInt();
			sc.nextLine();
	System.out.println("Introduzca el genero: ");
	String genero=sc.nextLine();
	System.out.println("Introduzca el cantidad: ");
	int cantidad=sc.nextInt();
			sc.nextLine();
			
		VideoClub p= new VideoClub(titulo,director,estreno,genero,cantidad);
		DaoVideoClub dao=new DaoVideoClub();
		dao.actualizar(p);

}
private static void borrarPelicula(){
	System.out.println("Introduzca el titulo: ");
	String titulo=sc.nextLine();
	
	DaoVideoClub dao=new DaoVideoClub();
	dao.borrar(titulo);
}
private static void insertarPelicula(){
	System.out.println("Introduzca el titulo: ");
	String titulo=sc.nextLine();
	System.out.println("Introduzca el director: ");
	String director=sc.nextLine();
	System.out.println("Introduzca el estreno: ");
	int estreno=sc.nextInt();
			sc.nextLine();
	System.out.println("Introduzca el genero: ");
	String genero=sc.nextLine();
	System.out.println("Introduzca el cantidad: ");
	int cantidad=sc.nextInt();
			sc.nextLine();
			VideoClub p= new VideoClub(titulo,director,estreno,genero,cantidad);
			DaoVideoClub dao=new DaoVideoClub();
			dao.insertar(p);
}
}
