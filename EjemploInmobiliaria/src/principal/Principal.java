package principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 */
		InmuebleEnVenta in1=new InmuebleEnVenta(200,false,"C/Membrilla","Jacinto Buen Dia",1000);
		InmuebleEnVenta in2=new InmuebleEnVenta(100,true,"C/Rio Azuer","Pepe Roman Jaime",5000);
		InmuebleEnVenta in3=new InmuebleEnVenta(150,true,"C/Toledo","Pablo Motos",6000);
		
		InmuebleAlquiler ia1=new InmuebleAlquiler(200,false,"C/Rio Estercilla","Raul Gonzalez Blanco",200);
		InmuebleAlquiler ia2=new InmuebleAlquiler(100,true,"C/Rio Manzanares","Iker Casillas",100);
		InmuebleAlquiler ia3=new InmuebleAlquiler(300,false,"C/Real","Francisco Moraleda Jimenez",50);
		
		/**
		 * Creo variable para imprimir
		 */
		Inmobiliaria in=new Inmobiliaria();
		
		in.add(in1);
		in.add(in2);
		in.add(in3);
		in.add(ia1);
		in.add(ia2);
		in.add(ia3);
		
		/**
		 * Esto nos permite modificar de los propietarios
		 */
		ConPropietario cp1=in;
		ConPropietario cp2=ia1;
		
		cp1.setPropietario("Antonio");//en este caso modifica el propietario de la inmobiliaria
		cp2.setPropietario("Juan");//en este otro modifica el de InmuebleAlquiler 1
		
		System.out.println(in);
		/**
		 * Se hace para incrementar el precio de venta un 10%
		 */
		
		for(int i=0;i<in.size();i++){
			Inmueble inm=in.get(i);
			double p=inm.getPrecio()*1.1;
			inm.setPrecio(p);
			
			System.out.println(inm);
		}
	}

}
