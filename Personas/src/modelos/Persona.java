package modelos;

public class Persona {

	
	private String dni;
	private String nombre;
	
	public Persona(String dni,String nombre){
		this.dni=dni;
		this.nombre=nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString(){
		return "D.N.I.: "+dni+" Nombre: "+nombre+"\n";
	}
}
