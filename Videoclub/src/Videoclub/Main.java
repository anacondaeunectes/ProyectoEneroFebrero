package Videoclub;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		Cliente e = new Cliente();
		FuncionVideojuego a = new FuncionVideojuego();
		
		a.addVideojuego();
		System.out.println(FuncionVideojuego.listaVideojuego.get(0));
		a.listarVideojuegos();
//		e.a�adir();
	}

}
