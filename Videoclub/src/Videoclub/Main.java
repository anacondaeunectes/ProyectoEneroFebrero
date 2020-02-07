package Videoclub;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static FuncionCliente FunCliente = new FuncionCliente();
	static FuncionPelicula FunPelicula = new FuncionPelicula();
	static FuncionVideojuego FunVideojuego = new FuncionVideojuego();
	static FuncionRegistroAlquiler FunRegistroAlquiler = new FuncionRegistroAlquiler();
	
	static Scanner sc;
	
	public static void main(String[] args) throws IOException {
		
		sc = new Scanner(System.in);
		
		int opcion;
		
		do {
			
			menu();
			
			opcion = sc.nextInt();
			
			switch (opcion) {
			
			case 0:
				System.out.println("Cerrando programa...");
				break;
				
			case 1:
				switch (elegirProducto()) {
				case 1:
					FunPelicula.listarPelicula();
					break;

				case 2:
					FunVideojuego.listarVideojuegos();
					break;
					
				default:
					System.out.println("Opcion no valida. Introduzca una opcion valida, por favor.");
					break;
				}
				break;
				
			case 2:
				switch (elegirProducto()) {
				case 1:
					FunPelicula.addPelicula();
					break;
					
				case 2:
					FunVideojuego.addVideojuego();
					break;
						
				default:
					System.out.println("Opcion no valida. Introduzca una opcion valida, por favor.");
					break;
				}
				break;
				
			case 3:
				switch (elegirProducto()) {
				case 1:
					FunPelicula.fichaPelicula();
					break;
				
				case 2:
					FunVideojuego.fichaVideojuego();
					break;
					
				default:
					System.out.println("Opcion no valida. Introduzca una opcion valida, por favor.");
					break;
				}
				break;
				
			case 4:
				switch (elegirProducto()) {
				case 1:
					FunPelicula.eliminarPelicula();
					break;
					
				case 2:
					FunVideojuego.eliminarVideojuego();
					break;
						
				default:
					System.out.println("Opcion no valida. Introduzca una opcion valida, por favor.");
					break;
				}
				break;
				
			case 5:
				FunCliente.listarCliente();
				break;
				
			case 6:
				FunCliente.ficharSoloCliente();
				break;
				
			case 7:
				FunCliente.addCliente();
				break;
				
			case 8:
				FunCliente.eliminarCliente();
				break;
				
			case 9:
				alquilar();
				break;
			
			case 10:
				FunRegistroAlquiler.listarRegistroAlquiler();
				break;
				
			default:
				System.out.println("Opcion no valida. Introduzca una opcion valida, por favor.");
				break;
			}
			
		System.out.println("");
			
		} while (opcion != 0);
		
	sc.close();
	
	}
	
	public static void menu() {
		
		System.out.println("GESTION VIDEOCLUB");
		System.out.println("=================");
		System.out.println("0. Salir del programa");
		System.out.println("1. Listado de productos");
		System.out.println("2. Anadir productos");
		System.out.println("3. Ficha de producto");
		System.out.println("4. Eliminar producto");
		System.out.println("5. Listado de clientes");
		System.out.println("6. Ficha de cliente");
		System.out.println("7. Anadir cliente");
		System.out.println("8. Eliminar cliente");
		System.out.println("9. Alquilar producto");
		System.out.println("10. Listado de los registros de alquiler");
		
	}
	
	public static int elegirProducto() {
		
		System.out.println("Eliga el tipo de producto: ");
		System.out.println("1. Peliculas");
		System.out.println("2. Videojuegos");
		int opcion = sc.nextInt();
	
		return opcion;
	}
	
	public static void alquilar() throws IOException {
		
		FunCliente.listarCliente();
		System.out.println("Introduzca el identificador del cliente: ");
		int eleccion = sc.nextInt();
		Cliente ClienteTemporal = FunCliente.listaCliente.get(eleccion);
		switch (elegirProducto()) {
		case 1:
			FunPelicula.listarPelicula();
			System.out.println("Introduzca el identificador de la pelicula: ");
			eleccion = sc.nextInt();
			Pelicula peliculaTemporal = FunPelicula.listaPelicula.get(eleccion);
			
			ClienteTemporal.addPelicula(peliculaTemporal);
			
			RegistroAlquiler registroPelicula = new RegistroAlquiler(ClienteTemporal, peliculaTemporal, peliculaTemporal.getPrecioAlquiler());
			
			FunRegistroAlquiler.addRegistroPelicula(ClienteTemporal, peliculaTemporal);
			break;
			
		case 2:
			FunVideojuego.listarVideojuegos();
			System.out.println("Introduzca el identificador del videojuego:"); 
			eleccion = sc.nextInt();
			Videojuego VideojuegoTemporal = FunVideojuego.listaVideojuego.get(eleccion);
			
			ClienteTemporal.addVideojuego(VideojuegoTemporal);
			
			RegistroAlquiler registroVideojuego = new RegistroAlquiler(ClienteTemporal, VideojuegoTemporal, VideojuegoTemporal.getPrecioAlquiler());
			
			FunRegistroAlquiler.addRegistroVideojuego(ClienteTemporal, VideojuegoTemporal);
			
			break;
		default:
			break;
		}
		
	}

}
