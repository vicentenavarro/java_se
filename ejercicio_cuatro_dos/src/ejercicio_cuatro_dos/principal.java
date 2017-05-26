package ejercicio_cuatro_dos;

//import java.util.Scanner;
		
public class principal {
	
	static int[] numeros;
	
	public static void main(String[] args) {
	//podríamos hacerlo como en comentado, pero como metemos los
	//argumentos como dice el ejercicio, pues no lo hacemos así
		//Scanner sc;
		//sc=new Scanner(System.in);
		//System.out.println("Introduce varios números");		
		//String r="";
		//r=sc.nextLine();
		//int n=Integer.parseInt(r);
		//System.out.println(n);
		
		if(args.length==0){
			System.out.println("No hay parámetros");
			
		}else{
			
			//entonces poniendo esta línea siguiente, rellena el array
			//con los argumentos que hemos metido a mano
			numeros=new int[args.length];	
			int repetidos=0;			
			
			for(int i=0;i<args.length;i++){
				numeros[i]=Integer.parseInt(args[i]);			
				if(yaIntroducido(numeros[i],i)){
					repetidos++;
				}
			}
						
			System.out.println("Cantidad de números introducidos: " + numeros.length);
			System.out.println("Números introducidos: ");
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
