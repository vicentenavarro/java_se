import java.util.Random;// Importamos random para crear números aleatorios.
public class SeisNumeros {
	
	int seisEnteros[] =new int[6]; //Creo array de dimensión 6.
	
	/**
	 * Método en el que llena el array a mano.
	 * @param i
	 */
	public void rellenar(int i){
		seisEnteros[0] =1;
		seisEnteros[1] =2;
		seisEnteros[2] =3;
		seisEnteros[3] =4;
		seisEnteros[4] =5;
		seisEnteros[5] =5;
		
	}
	/**
	 * Metodo para llenar el array con numeros aleatorios.
	 */
	public void rellenar(){
		Random rnd=new Random(System.currentTimeMillis());
			for(int i=0;i<6;i++){
			
			
			int relleno=rnd.nextInt(49)+1;
			
				if(seisEnteros[i]!= relleno){
				seisEnteros[i]=relleno;
				
				}else{i--;}
			}
	}
	/**
	 * Metodo para imprimir el array.
	 */
	public void visualizar(){
		for (int j : seisEnteros){
			System.out.println(j);
			
		}
		
		
	}
	
	/**
	 * Metodo para ordenar el array
	 * Siguiendo el metodo de la burbuja.
	 */
	public void ordenar(){
		int cuentaintercambios=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<seisEnteros.length-1;i++){
                if (seisEnteros[i]>seisEnteros[i+1]){
                    //Intercambiamos valores
                    int variableauxiliar=seisEnteros[i];
                    seisEnteros[i]=seisEnteros[i+1];
                    seisEnteros[i+1]=variableauxiliar;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaintercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios=0;
        }
    }
}


