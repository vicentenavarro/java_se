package principal;

public class InmuebleEnVenta extends Inmueble {

	private double precioVenta;
	
	/**
	 * Metodo constructor vacio que genera un
	 */
	public InmuebleEnVenta(){
		
	}
	
	
	public InmuebleEnVenta(double superficie, boolean edificable, String direccion, String propietario, double precioVenta){
		super(superficie,edificable,direccion,propietario);
		this.precioVenta=precioVenta;
		
	}
	/**
	 * Metodo contructor que Copia un objeto de la clase InmuebleEnVenta
	 * @param p 	Objeto InmuebleEnVenta del que se sustraen los atributos para el nuevo objeto.
	 */
	public InmuebleEnVenta(InmuebleEnVenta p){ //Copia de esta clase.
		super(p);
		precioVenta=p.precioVenta;
	}
	@Override
	public double getTipoIva() {
		// TODO Auto-generated method stub
		return 0.21;
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precioVenta;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 
		return super.toString()+ "\n Precio de Venta: "+precioVenta+"\n";
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	@Override
	public void setPrecio(double p){
		precioVenta=p;
	}
	
}
