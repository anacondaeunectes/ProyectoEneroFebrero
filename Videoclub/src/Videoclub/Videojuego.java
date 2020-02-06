package Videoclub;

public class Videojuego extends Producto {

	Enum estilo;
	Enum plataforma;
	
	public Videojuego(){
		
	}
	
	public Videojuego(String titulo, double precioAlquiler, int plazoAlquiler, boolean alquilado, Enum estilo, Enum plataforma){
		super(titulo, precioAlquiler, plazoAlquiler, alquilado);
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

	@Override
	public String toString() {
		return "Videojuego [titulo= " + titulo + ", precioAlquiler=" + precioAlquiler
				+ ", plazoAlquiler=" + plazoAlquiler + ", alquilado=" + alquilado + ", estilo=" + estilo + ", plataforma=" + plataforma + "]";
	}
	
	
	
}
