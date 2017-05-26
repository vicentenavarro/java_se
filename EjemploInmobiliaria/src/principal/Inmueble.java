package principal;
/**
 * clase padre
 * @author Vicente Navarro
 *
 */
public abstract class Inmueble implements ConPropietario {

	private double superficie;
	private boolean edificable;
	private String direccion;
	private String propietario;
	
	public Inmueble(){
		
	}
	
	public Inmueble(double superficie, boolean edificable, String direccion, String propietario){
		this.superficie=superficie;
		this.edificable=edificable;
		this.direccion=direccion;
		this.propietario=propietario;
	}
	public  Inmueble(Inmueble p){
		superficie=p.superficie;
		edificable=p.edificable;
		direccion=p.direccion;
		propietario=p.propietario;
	}
	public abstract double getTipoIva();
	public abstract double getPrecio();
	public double getPrecioTotal(){
		return getPrecio()*(1+getTipoIva());}
	
	
	

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public boolean isEdificable() {
		return edificable;
	}

	public void setEdificable(boolean edificable) {
		this.edificable = edificable;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPropietario() {
			return propietario;
		}
	
		public void setPropietario(String propietario) {
			this.propietario = propietario;
		}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n Propietario: "+propietario+"\n Superficie: "+superficie+"\n Edificable: "+(edificable ? "Si": "No")+"\n Dirección: "+direccion;
	}

	

	public abstract void setPrecio(double p);

	
	
}
