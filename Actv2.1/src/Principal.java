import java.util.Scanner; // Importamos Scanner para poder coger datos en el teclado.
public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in); //Se crea la varialbe sc para guardar lo que se teclea.
		int numeroUno;
		int numeroDos;
		float numeroFloat;
		String letraUno;
		String letraDos;
		
		/**
		 * Se introducen los n�meros
		 */
		
		System.out.println("Escribe dos n�meros enteros: ");
		numeroUno=sc.nextInt();
		sc.nextLine(); //Se hace para que no se quede en memoria
		numeroDos=sc.nextInt();
		sc.nextLine();
		System.out.println("Escribe un n�mero decimal: ");
		numeroFloat = sc.nextFloat();
		sc.nextLine();
		
		
		System.out.println("------Suma tres n�meros-----------------");
		
		float suma=numeroUno+numeroDos+numeroFloat;
		System.out.println(suma);
		
		/**
		 * Visualizar el entero mayor
		 */
		System.out.println("-------El entero mayor-----");
		
		if(numeroUno>=numeroDos){
			System.out.println("El n�mero mayor es: "+numeroUno);
		}else{
			System.out.println("El n�mero mayor es: "+numeroDos);
		}
		
		/**
		 * Se visualiza el resultado de la divisi�n del float con el resto de la divisi�n de los dos enteros.
		 */
		
		System.out.println("---------Resultado divisio�n float con el resto------------");
		
		float division=numeroFloat/(numeroUno%numeroDos);
		System.out.println("El resultado es: "+division);
		
		/**
		 * Introducir dos palabras
		 */
		System.out.println("Escribe dos palabaras: ");
		letraUno=sc.nextLine();
		letraDos=sc.nextLine();
		
		/**
		 * Se visualiza la concatenaci�n de las dos cadenas le�das.
		 */
		
		System.out.println("------Concatenacion de cadenas------");
		System.out.println(letraUno+" "+letraDos);
		
	}
	

}
