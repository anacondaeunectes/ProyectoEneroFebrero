package Videoclub;

import java.util.ArrayList;
import java.util.Iterator;

public class FuncionRegistroAlquiler {

	static ArrayList<RegistroAlquiler> listaRegistroAlquiler = new ArrayList<>();
	
	public void addRegistroVideojuego(Cliente cliente, Videojuego videojuego) {
		
		listaRegistroAlquiler.add(new RegistroAlquiler(cliente, videojuego, videojuego.getPrecioAlquiler()));
		
	}
	
	public void addRegistroPelicula(Cliente e, Pelicula pelicula) {

		listaRegistroAlquiler.add(new RegistroAlquiler(e, pelicula, pelicula.getPrecioAlquiler()));
		
	}
	
	public void listarRegistroAlquiler() {
		Iterator<RegistroAlquiler> ite = listaRegistroAlquiler.iterator();
		
		while (ite.hasNext()) {
			
			System.out.println(ite.next().toString());
		}
	}


	public void alquilar() {
		
		
		
	}
	
	
	
}
