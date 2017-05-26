
public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Se definen las variables numeroUno y numeroDos
		 */
		int numeroUno=1;
		int numeroDos=100;
		
		int suma=(numeroUno+numeroDos)*((numeroDos-numeroUno+1)/2);
		suma+=(numeroDos-numeroUno+1)%2==0 ? 0 : suma+(numeroUno+numeroDos)/2;
		System.out.println(suma);
	}

}
