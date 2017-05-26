package ui;

import workers.T1;
import workers.T2;
import workers.Cronometro;

public class Principal {

	public static void main(String[] args) {
		
		//T1 t1=new T1();
		//T2 t2=new T2();

		//t1.start();
		//t2.start();
		Cronometro c=new Cronometro();
		c.start();
		Cronometro c2=new Cronometro();
		c2.start();
		
		
		try{
			c.join();
			c2.join();
		
		}
		catch{
			System.out.println("Algo a pasado");
		}
		
	}

}
