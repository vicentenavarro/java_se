package Principal;

public class Punto {

	/**
	 * Variable coordenadas X
	 */
	private double x;
	/**
	 * Variable coordenas y
	 */
	private double y;
	
	/**
	 * Constructor sin parametros
	 */
	public Punto(){
		x=0.0;
		y=0.0;
		
	}
	/**
	 * Constructor con dos parametros
	 * @param x
	 * @param y
	 */
	public Punto(double x, double y){
		
		this.x=x;
		this.y=y;
	}
	/**
	 * Constructor con otro punto ya existente.
	 * @param p
	 */
	
	public Punto(Punto p){
		x=p.x;
		y=p.y;
	}
		
	public void Pintar(){
		System.out.println("Las cordenadas son : ("+x+","+y+")");
	}
	
}
