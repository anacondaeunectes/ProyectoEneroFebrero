package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Cliente {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	Scanner e = new Scanner(System.in);
	
	Excepcion ex = new Excepcion();
	String nombre;
	String direccion;
	String telefono;
	ArrayList<Videojuego> clienteVideojuegos;
	ArrayList<Pelicula> clientePeliculas;
	
	
	Cliente() {
		clientePeliculas=new ArrayList();
		clienteVideojuegos=new ArrayList();
	}
	
	
	Cliente(String nombre, String direccion, String telefono){
		this.nombre=nombre;
		this.direccion=direccion;
		this.telefono=telefono;
		clientePeliculas=new ArrayList();
		clienteVideojuegos=new ArrayList();
	}
	
	
	public ArrayList getClientePeliculas() {
		return clientePeliculas;
	}


	public void setClientePeliculas(ArrayList clientePeliculas) {
		this.clientePeliculas = clientePeliculas;
	}


	public ArrayList getClienteVideojuegos() {
		return clienteVideojuegos;
	}


	public void setClienteVideojuegos(ArrayList clienteVideojuegos) {
		this.clienteVideojuegos = clienteVideojuegos;
	}
	
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getDireccion() {
		return direccion;
	}

	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	public String getTelefono() {
		return telefono;
	}

	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return	"\nNombre: " + getNombre() + 
				"\nDireccion: " + getDireccion() + 
				"\nTelefono: " + getTelefono() + ".";
	}
	
	public void fichaCliente() {		
		System.out.println(toString() + "\nPeliculas Alquiladas:");
		listarPeliculas();
		System.out.println("Videojuegos Alquilados:");
		listarVideojuegos();
		System.out.println();
	}
	
	public void addPelicula(Pelicula a) throws IOException {
		
		clientePeliculas.add(a);
	}
	
	public void addVideojuego(Videojuego a) throws IOException {	
		
		clienteVideojuegos.add(a);
	}
	
	public void listarPeliculas(){
		Iterator<Pelicula> ite = clientePeliculas.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next().toString());
		}
		if (clientePeliculas.isEmpty()) {
			System.out.println("No se han encontrado peliculas");
		}
	}
	
	public void listarVideojuegos(){
		Iterator<Videojuego> ite = clienteVideojuegos.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next().toString());
		}
		if (clienteVideojuegos.isEmpty()) {
			System.out.println("No se han encontrado videojuegos");
		}
	}	
}
