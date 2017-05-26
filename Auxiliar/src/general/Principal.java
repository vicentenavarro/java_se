package general;

public class Principal {

	public static void main(String[] args){
			
	Clase01 o;
	o=new Clase01(); //Se hace para reservar un espacio en la memoría.
	o.definirDatos(); //Un metode de clase se llaman con la variable y un punto
	o.leerDatos();
	
	/**Hay que crear siempre la variable porque esa variable
	 * apunta siempre al objeto(no contiene el objeto) */	
	System.out.println(o);//Nos imprime el lugar de la memoria donde esta almacenado
	
	Clase01.saludar(); // Las static se llaman con el nombre de la clase
	}
}
