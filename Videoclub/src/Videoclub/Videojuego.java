package Videoclub;

public class Videojuego extends Producto {

	Enum estilo;
	Enum plataforma;
	
	Videojuego(){
		
	}
	
	Videojuego(String titulo, String tipo, double precioAlquiler, int plazoAlquiler, boolean alquilado, Enum estilo, Enum plataforma){
		super(titulo, tipo, precioAlquiler, plazoAlquiler, alquilado);
		this.estilo=estilo;
		this.plataforma=plataforma;
	}

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
	
	
}
