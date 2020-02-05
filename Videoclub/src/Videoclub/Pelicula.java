package Videoclub;

public class Pelicula extends Producto{

	Enum genero;
	String anio;
	String director;
	String interpretes;
	
	Pelicula(){
		
	}
	
	Pelicula(String titulo, String tipo, double precioAlquiler, int plazoAlquiler, boolean alquilado, Enum gen, String anio, String director, String interpretes){
		super(titulo, tipo, precioAlquiler, plazoAlquiler, alquilado);
		this.tipo="Pelicula";
		this.genero=genero;
		this.anio=anio;
		this.director=director;
		this.interpretes=interpretes;
	}

	public Enum getGen() {
		return genero;
	}

	public void setGen(Enum gen) {
		this.genero = gen;
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
	
}
