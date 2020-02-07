package Videoclub;

public class Producto {

	String titulo;
	double precioAlquiler;
	int plazoAlquiler;
	boolean alquilado=false;
	

	//Constructor vacio para objetos Producto. No recibe parametros
	Producto(){
		
	}
	
	//Constructor sobrecargado completo para objetos Producto.
	Producto(String titulo, double precioAlquiler, int plazoAlquiler, boolean alquilado){
		this.titulo=titulo;
		this.precioAlquiler=precioAlquiler;
		this.plazoAlquiler=plazoAlquiler;
		this.alquilado=alquilado;
	}
	

	//Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public int getPlazoAlquiler() {
		return plazoAlquiler;
	}

	public void setPlazoAlquiler(int plazoAlquiler) {
		this.plazoAlquiler = plazoAlquiler;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}
	
	
}
