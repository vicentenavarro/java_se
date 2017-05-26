package principal;

public class array {
	 static int [] numero;
	 static boolean r;
	public static void main(String[] args) {
		 int rep=0;
		
	if(args.length==0){
		System.out.println("NO HAY PARAMETOS");
	}	
	else{
	for(int a=0;a<args.length;a++){
		numero[a]=Integer.parseInt(args[a]);
		
		r=repetidos(numero[a],a);
		if(r=true){
			rep++;
		}
	}
	System.out.println("La cantidad de números introducidos es: "+numero.length);
	
	System.out.println("El array es: ");
	for(int j : numero){
	System.out.println(j);
	}
	System.out.println("Hay "+rep+" números repetidos.");
	}
}
	static boolean repetidos(int n, int pos){
		for(int i=0;i<n;i++){
			if(numero[i]==n)
				return true;
		}
		return false;
	}
}