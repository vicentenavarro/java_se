package Pirncipal;

public class Punto {

	//Declarar las variables
	private static int numeroPuntos=0; //Actividad 5.2
	private double x;
	private double y;
	
	public Punto(){
		x=0.0;
		y=0.0;
		numeroPuntos++; //Actividad 5.2
	}
	
	public Punto(double x, double y){
		this.x=x;
		this.y=y;
		numeroPuntos++; //Actividad 5.2
	}
	
	public Punto(Punto p){
		x=p.x;
		y=p.y;
		numeroPuntos++; //Actividad 5.2
	}
	
	public void pintar(){
		System.out.println("("+x+","+y+")");
	}
	public static int getNumeroPunto(){//Actividad 5.2
		return numeroPuntos;
	}
	
	
	
}

