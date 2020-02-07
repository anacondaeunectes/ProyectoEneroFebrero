package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		FuncionCliente c = new FuncionCliente();
		FuncionPelicula p = new FuncionPelicula();
		Excepcion ex=new Excepcion();
		
		p.addPelicula();
		c.addCliente();
		c.listaCliente.get(1).addPelicula(p.listaPelicula.get(0));
		c.listarCliente();
		c.ficharSoloCliente();
		//c.eliminarCliente();
		//c.listarCliente();
		//c.eliminarCliente();
		
	}

}
