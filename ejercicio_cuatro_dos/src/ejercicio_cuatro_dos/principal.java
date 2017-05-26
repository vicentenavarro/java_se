package ejercicio_cuatro_dos;

//import java.util.Scanner;
		
public class principal {
	
	static int[] numeros;
	
	public static void main(String[] args) {
	//podr�amos hacerlo como en comentado, pero como metemos los
	//argumentos como dice el ejercicio, pues no lo hacemos as�
		//Scanner sc;
		//sc=new Scanner(System.in);
		//System.out.println("Introduce varios n�meros");		
		//String r="";
		//r=sc.nextLine();
		//int n=Integer.parseInt(r);
		//System.out.println(n);
		
		if(args.length==0){
			System.out.println("No hay par�metros");
			
		}else{
			
			//entonces poniendo esta l�nea siguiente, rellena el array
			//con los argumentos que hemos metido a mano
			numeros=new int[args.length];	
			int repetidos=0;			
			
			for(int i=0;i<args.length;i++){
				numeros[i]=Integer.parseInt(args[i]);			
				if(yaIntroducido(numeros[i],i)){
					repetidos++;
				}
			}
						
			System.out.println("Cantidad de n�meros introducidos: " + numeros.length);
			System.out.println("N�meros introducidos: ");
			for(int n : numeros){
				System.out.println(n + "");
			}
			System.out.println("Cantidad de repetidos: " + repetidos);
		}
		

	}
	
	static boolean yaIntroducido(int n, int pos){
		for(int i=0;i<pos;i++){
			if(numeros[i]==n) return true;
		}
		return false;
	}

}
