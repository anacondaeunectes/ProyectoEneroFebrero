package Videoclub;

public class Videojuego extends Producto {

	Estilo est;
	Plataforma plat;
	
	Videojuego(){
		
	}
	
	Videojuego(String titulo, String tipo, double precioAlquiler, String plazoAlquiler, boolean alquilado, Estilo est, Plataforma plat){
		super(titulo, tipo, precioAlquiler, plazoAlquiler, alquilado);
		this.est=est;
		this.plat=plat;
	}

	public Estilo getEst() {
		return est;
	}

	public void setEst(Estilo est) {
		this.est = est;
	}

	public Plataforma getPlat() {
		return plat;
	}

	public void setPlat(Plataforma plat) {
		this.plat = plat;
	}
	
	
}
