package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepcion {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	public boolean soloNumero(String a) {
		try {
			Integer.parseInt(a);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	
	public String soloTexto(String a) throws IOException {
		int cont=0;
		do {
			if (a.toLowerCase().matches("^([a-z]+[ ]?){1,2}$")==false) {
				System.out.println("Introduzca solo letras, por favor.");
				a=teclado.readLine();
			}else {
				cont=1;
			}
		} while (cont==0);
		return a;
	}
}
