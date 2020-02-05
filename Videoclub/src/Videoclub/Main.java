package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		Cliente e = new Cliente();
		
		Excepcion ex = new Excepcion();
		String a=teclado.readLine();
		ex.soloNumero(a);
		
	}

}
