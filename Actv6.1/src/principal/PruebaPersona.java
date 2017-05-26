package principal;

import principal.Empleado;
import principal.Persona;

public class PruebaPersona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		Persona p2=new Persona("Antonio",(byte)36,'V',"71526456P",true);
		Persona p3=new Persona(p2);
		
		Empleado e1=new Empleado();
		Empleado e2=new Empleado("Ana",(byte)23,'F',"03584478H",false,"prod1",1000);
		Empleado e3=new Empleado(p2,"admin1",2000);
		Empleado e4=new Empleado(e2);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);		

		p1.Pintar();
		p2.Pintar();
		p3.Pintar();
		
		e1.Pintar();
		e2.Pintar();
		e3.Pintar();
		e4.Pintar();
		
		if(p2.equals(p3)){
			System.out.println("Las personas son iguales");
		}else{
			System.out.println("Las personas son distintas");
		}
		
		if(e2.equals(e4)){
			System.out.println("Las personas son iguales");
		}else{
			System.out.println("Las personas son distintas");
		}

	}

}
