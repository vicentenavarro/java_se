package Principal;

/**
 * 
 * @author Vicente Navarro
 *
 */
/**
 * Importo Random para los números aleatorios.
 */

import java.util.Random;

public class PruebaPunto {

	public static void main(String[] args) {
		
		/**
		 * Sobrecarga de metodos
		 */
		Punto p1=new Punto();
		Punto p2=new Punto(3.5,2.5);
		Punto p3=new Punto(p2);
		/**
		 * Imprime los puntos
		 */
		System.out.println("**********Función pintas**********");
		p1.Pintar();
		p2.Pintar();
		p3.Pintar();
	
		/**
		 * Se crea el array aleatorio para llenar de coordenadas.
		 */
		Random rnd=new Random(System.currentTimeMillis());
		int aleatorio=rnd.nextInt(20);
		Punto[] puntos=new Punto[aleatorio];
		
		for(int i=0;i<aleatorio;i++){
			double x=rnd.nextDouble()*100;
			double y=rnd.nextDouble()*100;
			puntos[i]=new Punto(x,y);
		}
		System.out.println("**********Array aleatorio**********");
		for(Punto p: puntos){
			p.Pintar();
		}
	}
	
}
