package principal;

public class InmuebleAlquiler extends Inmueble {

	private double precioAlquiler;
	
	public InmuebleAlquiler(){
		
	}
	
	
	public InmuebleAlquiler(double superficie, boolean edificable, String direccion,String propietario, double precioAlquiler){
		super(superficie,edificable,direccion,propietario);
		this.precioAlquiler=precioAlquiler;
		
	}
	public InmuebleAlquiler(InmuebleAlquiler ial){ //Copia de esta clase.
		super(ial);
		precioAlquiler=ial.precioAlquiler;
	}
	@Override
	public double getTipoIva() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precioAlquiler;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 
		return super.toString()+ "\n Precio de Alquiler: "+precioAlquiler+"\n";
	}


	public double getPrecioAlquiler() {
		return precioAlquiler;
	}


	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	@Override
	public void setPrecio(double p){
		precioAlquiler=p;
	}

}
