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
		 * Se introducen los números
		 */
		
		System.out.println("Escribe dos números enteros: ");
		numeroUno=sc.nextInt();
		sc.nextLine(); //Se hace para que no se quede en memoria
		numeroDos=sc.nextInt();
		sc.nextLine();
		System.out.println("Escribe un número decimal: ");
		numeroFloat = sc.nextFloat();
		sc.nextLine();
		
		
		System.out.println("------Suma tres números-----------------");
		
		float suma=numeroUno+numeroDos+numeroFloat;
		System.out.println(suma);
		
		/**
		 * Visualizar el entero mayor
		 */
		System.out.println("-------El entero mayor-----");
		
		if(numeroUno>=numeroDos){
			System.out.println("El número mayor es: "+numeroUno);
		}else{
			System.out.println("El número mayor es: "+numeroDos);
		}
		
		/**
		 * Se visualiza el resultado de la división del float con el resto de la división de los dos enteros.
		 */
		
		System.out.println("---------Resultado divisioón float con el resto------------");
		
		float division=numeroFloat/(numeroUno%numeroDos);
		System.out.println("El resultado es: "+division);
		
		/**
		 * Introducir dos palabras
		 */
		System.out.println("Escribe dos palabaras: ");
		letraUno=sc.nextLine();
		letraDos=sc.nextLine();
		
		/**
		 * Se visualiza la concatenación de las dos cadenas leídas.
		 */
		
		System.out.println("------Concatenacion de cadenas------");
		System.out.println(letraUno+" "+letraDos);
		
	}
	

}
