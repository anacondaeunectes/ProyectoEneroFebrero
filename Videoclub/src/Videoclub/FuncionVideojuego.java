package Videoclub;

import java.util.ArrayList;
import java.util.Scanner;



public class FuncionVideojuego {
	
	Scanner teclado = new Scanner(System.in);

	static ArrayList<Videojuego> listaCliente = new ArrayList<>();
	
	public void addVideojuego() {
		System.out.println("Introduzca el titulo del videojuego: ");
		String titulo = teclado.nextLine();
		System.out.println("Introduzca el precio del alquiler del producto: ");
		double precio = teclado.nextDouble();
		System.out.println("Introduzca el plazo del alquiler(dias): ");
		int plazo = teclado.nextInt();
		System.out.println("Eliga el estilo del videojuego: ");
		System.out.println("ESTILOS:\n 1. Accion\n 2.Deportes\n 3. Aventuras\n 4. Puzzle\n 5. Infantil");
		int a = teclado.nextInt();
		Enum estilo = null;
		switch (a) {
		case 1:
			estilo = Estilo.ACCION;
			break;

		case 2:
			estilo = Estilo.DEPORTES;
			break;
		
		case 3:
			estilo = Estilo.AVENTURAS;
			break;
		
		case 4:
			estilo = Estilo.PUZZLE;
			break;
		
		case 5:
			estilo = Estilo.INFANTIL;
			break;
			
		default:
			System.out.println("Opcion introducida ni valida");
			break;
		}
		
		System.out.println("PLATAFORMA:\n 1. Xbox\n 2.PlayStation\n 3. WII");
		int b = teclado.nextInt();
		Enum plataforma = null;
		switch (b) {
		case 1:
			plataforma = Plataforma.XBOX;
			break;

		case 2:
			plataforma = Plataforma.PLAYSTATION;
			break;
		
		case 3:
			plataforma = Plataforma.WII;
			break;
			
		default:
			System.out.println("Opcion introducida ni valida");
			break;
		}
		
		listaCliente.add(new Videojuego(titulo, null, precio, plazo, false, estilo, plataforma));
		
	}
	
	public void busquedaVideojuego() {
		
	}
	
}
