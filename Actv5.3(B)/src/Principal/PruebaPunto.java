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
			double x=rnd.nextDouble()*500;//Lo multiplico por número mayores de 300 para comprobar que funcionan los limites.
			double y=rnd.nextDouble()*500;
			puntos[i]=new Punto(x,y);
		}
		System.out.println("-------------------------------------------------");
		for(Punto p: puntos){
			System.out.println(p.esCorrecto() ? "El punto es valido" : "El punto NO es valido");
			p.Pintar();
		}
		System.out.println("-----------Contador de Puntos-------------------");
			System.out.println("Ha un total de "+ Punto.getCuentaPuntos());
			
	
		
		
		
	}
	
}
