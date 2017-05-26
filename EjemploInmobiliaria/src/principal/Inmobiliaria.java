package principal;

public class Inmobiliaria implements ConPropietario {
	
	private String propietario="David Diego";
	private Inmueble InmuebleEnCartera[] =new Inmueble[500];
	private int siguientePos=0;
	
	/**
	 * Almacena los inmuebles del array.
	 * @param p
	 */
	public void add(Inmueble p){
		InmuebleEnCartera[siguientePos]=p;
		siguientePos++;
	}
	/**
	 * Devuelve la longitud del array
	 * @return
	 */
	public int size(){
		return siguientePos;
	}
	public boolean estaLleno(){
		return siguientePos==500;
	}
	


	/**
	 * En el metodo get recibe el valor que hay que mostrar del array;
	 * @param i
	 * @return
	 */
	public Inmueble get(int i) {
		return InmuebleEnCartera[i];
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="En la inmobiliaria de " +propietario+". Hay "+size()+ " inmuebles en nuestra cartera y son:"+
		"\n-------------------------------------------------------------------------------------"+
				"\n";
				
			for (int j=0;j<size();j++){
				s=s+InmuebleEnCartera[j].toString();//no se puede poner println en el metodo toString
				
			}
				
		
		return s;
				
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	
	
	
}
