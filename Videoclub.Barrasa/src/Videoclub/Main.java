package Videoclub;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FuncionPelicula p = new FuncionPelicula();
		p.addPelicula();
		p.eliminarPelicula();
		p.listarPelicula();
	}

}
