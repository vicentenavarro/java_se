package principal;

public class Empleado extends Persona{

	private String idPersona;
	private float sueldo;
	
	public Empleado(){
		
	}
	
	public Empleado(String nombre,byte edad,char sexo,String dni,boolean bCasado, String idPersona, float sueldo){
		super(nombre,edad,sexo,dni,bCasado);
		this.idPersona=idPersona;
		this.sueldo=sueldo;
	}
	public Empleado(Persona p, String idPersona, float  sueldo){
		super(p);
		this.idPersona=idPersona;
		this.sueldo=sueldo;
	}
	public Empleado(Empleado emp){
		super(emp);
		this.idPersona=emp.idPersona;
		this.sueldo=emp.sueldo;
	}

	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
	return super.toString()+"\nEs un empleado\n"
	+ "Identificador personal: "+idPersona+"\n"
	+ "Sueldo: "+sueldo;
}

	@Override
	public void Pintar(){
		System.out.println(this);
	}
}
