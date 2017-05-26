package ui;

import java.util.ArrayList;
import java.util.Scanner;

import dao.DAOPersona;
import datos.Db;
import modelos.Persona;

public class Principal {
	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		Db.init();
		boolean continuar=true;
		while(continuar){
			imprimirMenu();
			System.out.println("\n Introduzca la opcion");
			String s=teclado.nextLine();
			s=s.trim();//Elimina los espacios, tabuladores y saldo de la linea del principio y fin de la cadana
			if(s.length()>0){
				char o=s.charAt(0);// Obtiene el primer caracter de la cadena
				switch(o){
				case '1':
					insertarPersona();
					break;
				case '2':
					buscarPersona();
					break;
				case '3':
					modificarPersona();
					break;
				case '4':
					borrarPersona();
					break;
				case '5':
					listarPersonas();
					break;
				case '6':
					System.out.println("Adios. Gracias por utilizar la aplicación");
					continuar=false;
					Db.cerrar();
					break;
				default:
					System.out.println("Introduzca una opción valida");
				}
			}
		}

	}
	private static void imprimirMenu(){
		System.out.println("MENU");
		System.out.println("-----------------------------------");
		System.out.println("1.Insertar Persona");
		System.out.println("2.Buscar Persona");
		System.out.println("3.Modificar Persona");
		System.out.println("4.Borrar Persona");
		System.out.println("5.Listar todas Personas");
		System.out.println("-----------------------------------");
		System.out.println("6.Salir");
	}
	private static void insertarPersona(){
		
		System.out.println("D.N.I.: ");
		String dni=teclado.nextLine();
		System.out.println("Nombre: ");
		String nombre=teclado.nextLine();
		
		Persona p=new Persona(dni,nombre);
		DAOPersona dao=new DAOPersona();
		if(!dao.create(p)){//si no ha podido crear
			System.out.println("Fallo en la insercion. ¿La persona ya está insertada?");}
			
		}
		private static void buscarPersona(){
			
			System.out.println("D.N.I.: ");
			String dni=teclado.nextLine();
			
			DAOPersona dao=new DAOPersona();
			Persona p=dao.read(dni);
			if(p!=null){
				System.out.println(p);
				
			}	
			else{
				System.out.println("El DNI no consta en la base de datos");
			}
		
	}
		private static void modificarPersona(){
			
			System.out.println("D.N.I.: ");
			String dni=teclado.nextLine();
			System.out.println("Nombre: ");
			String nombre=teclado.nextLine();
			
			Persona p=new Persona(dni,nombre);
			DAOPersona dao=new DAOPersona();
			if(!dao.update(p)){//si no ha podido modificar
				System.out.println("Fallo en la modificacion");}
				
			}
		private static void listarPersonas(){
			System.out.println("Listado de Personas");
			System.out.println("----------------------");
			DAOPersona dao=new DAOPersona();
			ArrayList<Persona> a=dao.listar();
			
			for (Persona p : a){
				System.out.println(p);
			}
		}
		public static void borrarPersona(){
			System.out.println("D.N.I.: ");
			String dni=teclado.nextLine();
			DAOPersona dao=new DAOPersona();
			Persona p=new Persona(dni,null);
			if(!dao.delete(p)){
				System.out.println("Fallo al borrar personas");
				
			}	
			
		}

}
