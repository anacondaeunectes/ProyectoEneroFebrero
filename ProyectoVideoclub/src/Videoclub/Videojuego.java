package Videoclub;

public class Videojuego extends Producto {

	Enum estilo;
	Enum plataforma;
	

	//Constructor vacio para objetos Videojuego. No recibe parametros
	public Videojuego(){
		
	}

	//Constructor sobrecargado completo para objetos Videojuego
	public Videojuego(String titulo, double precioAlquiler, int plazoAlquiler, boolean alquilado, Enum estilo, Enum plataforma){
		super(titulo, precioAlquiler, plazoAlquiler, alquilado);
		this.estilo=estilo;
		this.plataforma=plataforma;
	}

	
	//Getters y Setters
	public Enum getEstilo() {
		return estilo;
	}

	public void setEst(Enum estilo) {
		this.estilo = estilo;
	}

	public Enum getPlataforma() {
		return plataforma;
	}

	public void setPlat(Enum plataforma) {
		this.plataforma = plataforma;
	}

	/**
	 * Sobreescribe el metodo "toString" de la clase Videojuego para poder usarlo de forma que nos muestre la informacion del objeto videojuego como deseemos
	 */
	@Override
	public String toString() {
		return "[titulo= " + titulo + ", precioAlquiler=" + precioAlquiler
				+ ", plazoAlquiler=" + plazoAlquiler + ", alquilado=" + alquilado + ", estilo=" + estilo + ", plataforma=" + plataforma + "]";
	}
	
	
	
}
