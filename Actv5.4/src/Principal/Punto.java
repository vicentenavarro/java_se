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
	
	private static int cuentaPuntos=0;
	
	/**
	 * Constructor sin parametros
	 */
	public Punto(){
		x=0.0;
		y=0.0;
		cuentaPuntos++;
		
	}
	/**
	 * Definiendo un atributo como public, static y final, obtenemos una constante que podrá ser accedida 
	 * desde cualquier clase (public), el acceso se podrá realizar sin tener que instanciar la clase mediante 
	 * el nombre de la clase (static) y su valor no podrá ser modificado en ningún momento (final).
	 * Tambien como son constantes se ponen en MAYUSCULAS.
	 */
	public static final int MIN_X=0;
	public static final int MAX_X=300;
	public static final int MIN_Y=0;
	public static final int MAX_Y=300;
	
	private boolean correcto=false;
	/**
	 * Constructor con dos parametros
	 * @param x
	 * @param y
	 */
	public Punto(double x, double y){
		
		this.x=x;
		this.y=y;
		cuentaPuntos++;
	}
	/**
	 * Constructor con otro punto ya existente.
	 * @param p
	 */
	
	public Punto(Punto p){
		x=p.x;
		y=p.y;
		cuentaPuntos++;
	}
	/**
	 * Función para comprobar que se cumple los limites maximos y minimos.
	 * @return
	 */
	public boolean esCorrecto(){
		if( x>MIN_X && x<MAX_X && y>MIN_Y && y<MAX_Y){
		return true;}
		return false;
	}
	public void moverPunto(){
		x=0;
		y=0;
	}
	public void moverPunto(int dx, int dy){
		this.x+=dx;
		this.y+=dy;
		if(x>MAX_X) x=MAX_X;
		if(x<MIN_X) x=MIN_X;
		if(x>MAX_Y) y=MAX_Y;
		if(x<MIN_Y) y=MIN_Y;
	}
	public void moverPunto(int d){
		this.x+=d;
		this.y+=d;
		if(x>MAX_X) x=MAX_X;
		if(x<MIN_X) x=MIN_X;
		if(x>MAX_Y) y=MAX_Y;
		if(x<MIN_Y) y=MIN_Y;
		
	}
	/**
	 * Creo la función get para devolver el valor de cuentaPuntos ya qu es privada.
	 * @return
	 */
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public static int getCuentaPuntos() {
		return cuentaPuntos;
	}
	public void setCuentaPuntos(int cuentaPuntos) {
		this.cuentaPuntos = cuentaPuntos;
	}
	public void Pintar(){
		System.out.println("Las cordenadas son : ("+x+","+y+")");
	}
	
	/**
	 * Metodo equals y toString
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Punto p=(Punto)obj;
		return x==p.x && y==p.y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return x+" "+y;
	}
	
}
