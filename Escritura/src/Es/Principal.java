package Es;
	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f=new File("prueba.dat");
			try(FileOutputStream fo=new FileOutputStream(f);){
				
				fo.write(100);
				fo.write(200);
				
			}
			catch(IOException ioe){
				System.out.println("No se ha podido escribir el archivo");
			}
	
	}

}
