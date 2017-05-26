
public class gaus {

	public static void main(String[] args) {
		int primero=1;
		int ultimo=100;
		
		int suma=(primero+ultimo)*((ultimo- primero+1)/2);
		suma+=(ultimo-primero+1)%2==0 ? 0 : suma+(primero+ultimo)/2;
		System.out.println(suma);
		

		
		int j=0;
		for(int i=0;i<5;i++){
		j+=i;
		}
		System.out.println(j);
}
}
