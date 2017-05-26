package ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import dao.DAOAvion;
import datos.Db;
import modelos.Avion;
public class Principal {

	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
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
						listarAviones();
						break;
					case '2':
						mostrarAvion();
						break;
					case '3':
						modificarAvion();
						break;
					case '4':
						borrarAvion();
						break;
					case '5':
						insertarAvion();
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
		System.out.println("1.- Listar Aviones");
		System.out.println("2.- Mostrar Avion");
		System.out.println("3.- Modificar Avion");
		System.out.println("4.- Borrar Avion");
		System.out.println("5.- Insertar nuevo modelo Avion");
		System.out.println("--------------------------------");
		System.out.println("6.- Salir");
	}
	private static void listarAviones(){
		DAOAvion dao=new DAOAvion();
		ArrayList<Avion> listado=dao.listar();
		
		System.out.println("     Listado de Aviones      ");
		System.out.println("-------------------------------");
		for(Avion p: listado){
			System.out.println(p);
		}
	}
	private static int pedirIdentificador(){
		boolean hecho=false;
		int idproducto=0;
		
		while(!hecho){
			try{
				System.out.println("Introduzca el id: ");
				idproducto=sc.nextInt();
				sc.nextLine();
				hecho=true;
			}
			catch(InputMismatchException e){
				/*
				 * La excepción InputMismatchException es lanzada por la clase
				 *  Scanner cuando el elemento recibido no corresponde al tipo
				 *   de dato esperado
				 */
				System.out.println("Por favor introduce un número correcto");	
			}	
		}
		return idproducto;
	}
	private static void mostrarAvion(){
		
		int idavion=pedirIdentificador();
		DAOAvion dao=new DAOAvion();
		Avion p=dao.read(idavion);
		
		System.out.println("El Avión que ha seleccionado es \n"+p);
	}
	private static void modificarAvion(){
		int idavion=pedirIdentificador();
		System.out.println("Descripción del Avión: ");
		String descripcion=sc.nextLine();
		
		boolean hecho=false;
		double peso=0;
		while(!hecho){
			try{
				System.out.println("Peso del Avion: ");
				peso=sc.nextDouble();
				sc.nextLine();
				hecho=true;
			}
			catch(InputMismatchException e){ //Excepcion que se produce cuando el usuario no introduce un numero
				System.out.println("Por favor introduce un numero decimal valido");
				
			}
		}
		
		Avion p=new Avion(idavion,descripcion,peso);
		DAOAvion dao=new DAOAvion();
		dao.actualizar(p);
		
		
	}
	private static void borrarAvion(){
		int idavion=pedirIdentificador();
		DAOAvion dao=new DAOAvion();
		
		dao.borrar(idavion);
		
	}

	private static void insertarAvion(){
		
		System.out.println("Descripcion del producto: ");
		String descripcion=sc.nextLine();
		
		boolean hecho=false;
		double peso=0;
		while(!hecho){
			try{
				System.out.println("Peso del Avion: ");
				peso=sc.nextDouble();
				sc.nextLine();
				hecho=true;
			}
			catch(InputMismatchException e){ //Excepcion que se produce cuando el usuario no introduce un numero
				System.out.println("Por favor introduce un numero decimal valido");
			}
		}
		
		Avion p=new Avion(-1,descripcion,peso);//He puesto menos porque hay que enviar un valor a la variable ya que el constructor esta creado en 3 variables.
		DAOAvion dao=new DAOAvion();
		dao.insertar(p);
	}

}


