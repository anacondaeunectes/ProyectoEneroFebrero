package Videoclub;

public class Pelicula extends Producto{

	Genero gen;
	String anio;
	String director;
	String interpretes;
	
	Pelicula(){
		
	}
	
	Pelicula(String titulo, double precioAlquiler, int plazoAlquiler, boolean alquilado, Genero gen, String anio, String director, String interpretes){
		super(titulo, precioAlquiler, plazoAlquiler, alquilado);
		this.gen=gen;
		this.anio=anio;
		this.director=director;
		this.interpretes=interpretes;
	}

	public Genero getGen() {
		return gen;
	}

	public void setGen(Genero gen) {
		this.gen = gen;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getInterpretes() {
		return interpretes;
	}

	public void setInterpretes(String interpretes) {
		this.interpretes = interpretes;
	}
	public String toString() {
		return "Titulo: "+titulo+"\nGenero: "+gen+"\nAnio: "+anio+"\nDirector: "+director+"\nInterpretes: "+interpretes+"\nPrecio: "+precioAlquiler;
	}
	
}
