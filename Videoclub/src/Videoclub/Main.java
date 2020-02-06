package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		FuncionCliente c = new FuncionCliente();
		FuncionPelicula p = new FuncionPelicula();
		
		c.addCliente();
		c.addCliente();
		c.listarCliente();
		c.fichaUnCliente();
		c.eliminarCliente();
		c.listarCliente();
	}

}
