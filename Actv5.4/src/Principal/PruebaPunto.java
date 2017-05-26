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
			
		System.out.println("--------------Mover Puntos----------------------");
		p1.moverPunto();
		p1.Pintar();
		p2.moverPunto(3,6);
		p2.Pintar();
		p3.moverPunto(4);
		p3.Pintar();
		
		System.out.println("     -----SETTER y GETTER-------");
		
		p1.getX();
		p1.setX(40);
		p1.getY();
		p1.setY(50);
		p2.getX();
		p2.setX(30);
		p2.getY();
		p2.setY(10);
		
		System.out.println("     -----to String  -------");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		System.out.println("     -----to Equals -------");
		if (p1.equals(p2)){
			System.out.println("p1 y p2 son iguales");
		}
		else{
			System.out.println("p1 y p2 son distintos");
		}
		
		
		
	}
	
}
