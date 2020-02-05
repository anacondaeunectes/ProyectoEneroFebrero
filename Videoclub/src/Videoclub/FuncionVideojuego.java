package Videoclub;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionVideojuego {
	
	Scanner teclado = new Scanner(System.in);

	ArrayList<Videojuego> listaCliente = new ArrayList<>();
	
	public void addVideojuego() {
		System.out.println("Introduzca el titulo del videojuego: ");
		String titulo = teclado.next();
		System.out.println("Introduzca el precio del alquiler del producto: ");
		double precio = teclado.nextDouble();
		System.out.println("Introduzca el plazo del alquiler(dias): ");
		int plazo = teclado.nextInt();
		System.out.println("Eliga el genero de la pelicula: ");
		
		
	}
	
}
