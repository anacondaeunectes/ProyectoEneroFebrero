package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;


public class FuncionPelicula {
//	BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
	Scanner e = new Scanner(System.in);
	ArrayList<Pelicula> listaPelicula = new ArrayList<>();
	
	FuncionPelicula(){}
	
	public void addPelicula() throws IOException {
		System.out.println("-ANIADIR PELICULA- \nTitulo de la pelicula");
		String titulo =e.nextLine();
		String tipo="Pelicula";
		System.out.println("Anio:");
		String anio= e.nextLine();
		System.out.println("Director:");
		String director = e.nextLine();
		System.out.println("Interpretes:");
		String interpretes = e.nextLine();
		Boolean alquilado=false;
		System.out.println("Genero:\nOpcion 1 para Accion\nOpcion 2 para Drama\nOpcion 3 para Aventuras\nOpcion 4 para Infantil");
		Genero genero=null;
		int k;
		do {
			k= e.nextInt();
		switch(k) {
			case 1:
				genero= Genero.ACCION;
				break;
			case 2: 
				genero= Genero.DRAMA;
				break;
			case 3:
				genero = Genero.AVENTURAS;
				break;
			case 4:
				genero = Genero.INFANTIL;
				break;
			default:
				System.out.println("Opcion no valida");
				break;
		}
		}while(k<0 || k>4);
		System.out.println("Plazo de alquiler (Introduzca los dias):");
		int plazoAlquiler = e.nextInt();
		System.out.println("Precio:");
		Double precioD=e.nextDouble();
		listaPelicula.add(new Pelicula(titulo, tipo, precioD, plazoAlquiler, alquilado, genero, anio, director, interpretes));
	}
	public void listarPelicula(){
		Iterator<Pelicula> ite = listaPelicula.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next().toString());
		}
		if (listaPelicula.isEmpty()) {
			System.out.println("No se han encontrado peliculas");
		}
	}
	public void ficharPelicula() throws IOException {
		listarPelicula();
		System.out.println("Ponga el numero que identifique a la pelicula");
		int b=e.nextInt();
		System.out.println(listaPelicula.get(b).toString());
	}
	public void eliminarPelicula() {
		listarPelicula();
		System.out.println("Ponga el numero que identifique a la pelicula");
		int c=e.nextInt();
		System.out.println("Se ha eliminado la pelicula: \n"+listaPelicula.get(c).toString());
		listaPelicula.remove(c);
	}
}
