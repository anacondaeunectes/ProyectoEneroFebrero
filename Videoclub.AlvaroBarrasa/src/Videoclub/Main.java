package Videoclub;

import java.io.IOException;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FuncionPelicula p = new FuncionPelicula();
		p.addPelicula();
		p.addPelicula();
		p.listarPelicula();
	}
	
	public void alquilar() {
		
	}
}
