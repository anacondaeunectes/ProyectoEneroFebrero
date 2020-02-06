package Videoclub;

import java.io.IOException;

public class Main {
	
	static FuncionVideojuego a = new FuncionVideojuego();
	static FuncionCliente b = new FuncionCliente();
	static FuncionPelicula c = new FuncionPelicula();
	static FuncionRegistroAlquiler d = new FuncionRegistroAlquiler();

	public static void main(String[] args) throws IOException {
		
		Cliente e = new Cliente();
		
		a.addVideojuego();
		

		
//		System.out.println(FuncionVideojuego.listaVideojuego.get(0));
//		a.listarVideojuegos();
		a.getClass().toString();
//		e.a�adir();
		
	}
	
	public void alquilar() {
		
		
		
	}

}
