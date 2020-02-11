package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;


public class FuncionPelicula {
	BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
	Scanner e = new Scanner(System.in);
	ArrayList<Pelicula> listaPelicula = new ArrayList<>();
	Excepciones ex = new Excepciones();
	
	FuncionPelicula(){}
	
	public void addPelicula() throws NumberFormatException,IOException {
		System.out.println("-ANIADIR PELICULA- \nTitulo de la pelicula");
		String titulo =e.nextLine();
		System.out.println("Anio:");
		int cont;
		String anio="";
		do {
			anio=t.readLine();
			int date= LocalDate.now().getYear();
			int num=Integer.parseInt(ex.soloNumeros(anio));
			if(num<1980 || num>(int)date) {
				cont=1;
				System.out.println("Anio no valido");
			}else {
				cont=0;
			}
		} while (cont==1);
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
		System.out.println("Precio (Si pone decimales, use un punto en vez de una coma):");
		String precio="";
		Double precioD;
		do {
			precio=e.nextLine();
			precioD=Double.parseDouble(ex.validarDouble(precio)); 
			try {
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		} while (precioD==0);
		listaPelicula.add(new Pelicula(titulo, precioD, plazoAlquiler, alquilado, genero, anio, director, interpretes));
	}
	public void listarPelicula(){
		Iterator<Pelicula> ite = listaPelicula.iterator();
		while (ite.hasNext()) {
			Pelicula p = ite.next();
			System.out.print(listaPelicula.indexOf(p));
			System.out.println(p.toString());
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
