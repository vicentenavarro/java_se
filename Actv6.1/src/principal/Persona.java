package principal;

public class Persona {
	/*
	 * Creo variables
	 */
		private String nombre;
		private byte edad;
		private char sexo;
		private String dni;
		private boolean bCasado;
		
		/**
		 * Constructores
		 */
	public Persona(){
		
	}
	
	public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.dni=dni;
		this.bCasado=bCasado;
	}
	public Persona(Persona p){
		nombre=p.nombre;
		edad=p.edad;
		sexo=p.sexo;
		dni=p.dni;
		bCasado=p.bCasado;
	}
	/**
	 * Metodos getter y setter
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public boolean isbCasado() {
		return bCasado;
	}
	public void setbCasado(boolean bCasado) {
		this.bCasado = bCasado;
	}
	
	/**
	 * metodo equals y tostring
	 * Hay que poner @override para la documentación ya se nos indica que sobrescribe.
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null){
			return false;
		}
		if(this==obj){
			return true;
		}
		else if(!(obj instanceof Persona)){
			return false;
		}
		else{
			Persona p=(Persona)obj;
			return nombre.equals(p.nombre) && edad==p.edad && sexo==p.sexo && dni.equals(p.dni) && bCasado==p.bCasado;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Persona\n"
		+ "Nombre: "+nombre+"\n"
		+ "Edad: "+edad+"\n"
		+ "Sexo: "+sexo+"\n"
		+"D.N.I.: "+dni+"\n"
		+ "Casado: "+(bCasado ? "Si" : "No");
	}
	public void Pintar(){
		System.out.println(this);
	}
		
	}

