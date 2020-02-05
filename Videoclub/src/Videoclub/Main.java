package Videoclub;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		Cliente e = new Cliente();
		FuncionVideojuego a = new FuncionVideojuego();
		
		a.addVideojuego();
		System.out.println(FuncionVideojuego.listaCliente.get(0));
//		e.a�adir();
	}

}
