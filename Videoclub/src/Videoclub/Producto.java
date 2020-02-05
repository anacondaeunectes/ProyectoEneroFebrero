package Videoclub;

public class Producto {

	String titulo;
	String tipo; //Ver si es necesario
	double precioAlquiler;
	int plazoAlquiler;
	boolean alquilado=false;
	
	Producto(){
		
	}
	
	Producto(String titulo, String tipo, double precioAlquiler, int plazoAlquiler, boolean alquilado){
		this.titulo=titulo;
		this.tipo=tipo;
		this.precioAlquiler=precioAlquiler;
		this.plazoAlquiler=plazoAlquiler;
		this.alquilado=alquilado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	@Override
	public String toString() {
		return "Producto [titulo=" + titulo + ", tipo=" + tipo + ", precioAlquiler=" + precioAlquiler
				+ ", plazoAlquiler=" + plazoAlquiler + ", alquilado=" + alquilado + "]";
	}
	
	
	
	
}
