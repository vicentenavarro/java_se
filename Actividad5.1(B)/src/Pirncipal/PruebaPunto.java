package Pirncipal;

import java.util.Random;

public class PruebaPunto {
	public static void main(String[] args) {
		
		Punto p1=new Punto();
		Punto p2=new Punto(5.6,3.8);
		Punto p3=new Punto(p2);
		
		p1.pintar();
		p2.pintar();
		p3.pintar();
		
		Random rnd=new Random(System.currentTimeMillis());
		int tamañoArray=rnd.nextInt(20);
		
		Punto[] puntos=new Punto[tamañoArray];
		
		for(int i=0; i<puntos.length;i++){
			double x=rnd.nextDouble()*100;//se multiplica por 100 porque nextdoble es un número entre 0 y 1.
			double y=rnd.nextDouble()*100;
			puntos[i]=new Punto(x,y);
		
		}
		
		for (Punto p : puntos){
			p.pintar();
			
		}
		
		
		
	}
}
