package Videoclub;

import java.time.LocalDate;

public class RegistroAlquiler {

	private  Cliente cliente;
	private Producto producto;
	private LocalDate fechaAlquiler;
	private LocalDate fechaDevolucion;
	private double importe;
	
	public RegistroAlquiler() {
		
	}
	
	public RegistroAlquiler(Cliente cliente, Producto producto, LocalDate fechaAlquiler, LocalDate fechaDevolucion, double importe) {
		this.cliente=cliente;
		this.producto=producto;
		this.fechaAlquiler=fechaAlquiler;
		this.fechaDevolucion=fechaDevolucion;
		this.importe=importe;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
}
