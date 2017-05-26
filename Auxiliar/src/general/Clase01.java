package general;

public class Clase01 {

		private int numero;
		private String nombre;
		
		public Clase01(int num, String nom);{
		numero=num;
		nombre=nom;
		}
		public void definirDatos(){
		
			
		}
		
		public void leerDatos(){
			System.out.println(numero +" " + nombre);
			
		}
		public static void saludar(){
			System.out.println("Hola");
		}
}
