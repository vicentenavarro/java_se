package modelos;

public class VideoClub {

	private String titulo;
	private String director;
	private int estreno;
	private String genero;
	private int cantidad;
	
	public VideoClub (String titulo, String director, int estreno, String genero,int cantidad){
		this.titulo=titulo;
		this.director=director;
		this.estreno=estreno;
		this.genero=genero;
		this.cantidad=cantidad;
		
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getEstreno() {
		return estreno;
	}


	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		
		return "Titulo: " +titulo+
				"\n Director: "+director+
				"\n Estreno : "+estreno+
				"\n Genero : "+genero+
				"\n Cantidad: "+cantidad;
				
	}
		
	
	
}
