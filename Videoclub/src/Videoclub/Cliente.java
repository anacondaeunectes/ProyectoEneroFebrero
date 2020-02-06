package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {

	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	Excepcion ex = new Excepcion();
	static int codPelicula=0;
	static int codVideojuego=0;
	String nombre;
	String direccion;
	String telefono;
	HashMap<Integer, Object> clientePeliculas;
	HashMap<Integer, Object> clienteVideojuegos;
	
	
	Cliente() {
		clientePeliculas=new HashMap<>();
		clienteVideojuegos=new HashMap<>();
	}
	
	
	Cliente(String nombre, String direccion, String telefono){
		this.nombre=nombre;
		this.direccion=direccion;
		this.telefono=telefono;
		clientePeliculas=new HashMap<>();
		clienteVideojuegos=new HashMap<>();
	}
	
	
	public HashMap getClientePeliculas() {
		return clientePeliculas;
	}


	public void setClientePeliculas(HashMap clientePeliculas) {
		this.clientePeliculas = clientePeliculas;
	}


	public HashMap getClienteVideojuegos() {
		return clienteVideojuegos;
	}


	public void setClienteVideojuegos(HashMap clienteVideojuegos) {
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
				"\nTelefono: " + getTelefono();
		
	}
	
	public void addPelicula() throws IOException {	//Para Pelicula
		
		System.out.println("Nombre Cliente:");
		nombre=ex.soloTexto(teclado.readLine());
		System.out.println("Direccion Cliente:");
		direccion=ex.soloTexto(teclado.readLine());
		System.out.println("Telefono Cliente");
		telefono=ex.soloTelefono(teclado.readLine());
		Cliente c = new Cliente(nombre, direccion, telefono);
		
		Pelicula p = new Pelicula();			//terminar
		codPelicula++;
		clientePeliculas.put(codPelicula, p);
	}
	
	public void addVideojuego() throws IOException {	//Para Videojuegos
		
		System.out.println("Nombre Cliente:");
		nombre=ex.soloTexto(teclado.readLine());
		System.out.println("Direccion Cliente:");
		direccion=ex.soloTexto(teclado.readLine());
		System.out.println("Telefono Cliente");
		telefono=ex.soloTelefono(teclado.readLine());
		Cliente c = new Cliente(nombre, direccion, telefono);
		
		Videojuego v = new Videojuego();			//terminar
		codVideojuego++;
		clienteVideojuegos.put(codVideojuego, v);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
