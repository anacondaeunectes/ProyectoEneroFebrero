package Videoclub;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class FuncionVideojuego {
	
	Scanner teclado = new Scanner(System.in);

	static ArrayList<Videojuego> listaVideojuego = new ArrayList<>();
	
	public void addVideojuego() {
		System.out.println("Introduzca el titulo del videojuego: ");
		String titulo = teclado.nextLine();
		System.out.println("Introduzca el precio del alquiler del producto: ");
		double precio = teclado.nextDouble();
		System.out.println("Introduzca el plazo del alquiler(dias): ");
		int plazo = teclado.nextInt();
		System.out.println("Eliga el estilo del videojuego: ");
		System.out.println("ESTILOS:\n 1. Accion\n 2.Deportes\n 3. Aventuras\n 4. Puzzle\n 5. Infantil");
		Enum estilo = null;
		int a;
		do {
			a = teclado.nextInt();
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
		}while(a<1 || a>5);
		
		System.out.println("PLATAFORMA:\n 1. Xbox\n 2.PlayStation\n 3. WII");
		Enum plataforma = null;
		int b;
		do {
			b = teclado.nextInt();
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
		}while(b<1 || b>3);
		
		listaVideojuego.add(new Videojuego(titulo, null, precio, plazo, false, estilo, plataforma));
		
	}
	
	public void listarVideojuegos() {
		
		Iterator<Videojuego> ite = listaVideojuego.iterator();
		
		while (ite.hasNext()) {
			
			System.out.println(ite.next().toString());
			
		}
		
	}
	
//	public Videojuego busquedaVideojuego(int a) {
//		
//		return listaVideojuego.get(a);
//		
//	}
	
//	public void alquilar() {
//		
//		listarVideojuegos();
//		int numero = teclado.nextInt();
//		busquedaVideojuego(numero);
//		
//	}
	
	public void fichaVideojuego() {
		
		listarVideojuegos();
		System.out.println("Introduzca un videojuego: ");
		int opcion = teclado.nextInt();
		System.out.println(listaVideojuego.get(opcion).toString());
	}
	
	public void eliminarVideojuego() {
		
		listarVideojuegos();
		int opcion = teclado.nextInt();
		listaVideojuego.remove(opcion);
		
	}
	
}
