package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Cliente {

	public static int nCliente=0;
	String nombre;
	String direccion;
	String telefono;
	ArrayList<Pelicula> clientePeliculas;
	ArrayList<Videojuego> clienteVideojuegos;
	
	
	Cliente() {
		nCliente++;
		clientePeliculas=new ArrayList<>();
		clienteVideojuegos=new ArrayList<>();
	}
	
	
	Cliente(String nombre, String direccion, String telefono){
		this.nombre=nombre;
		this.direccion=direccion;
		this.telefono=telefono;
		nCliente++;
		clientePeliculas=new ArrayList<>();
		clienteVideojuegos=new ArrayList<>();
	}
	
	
	public ArrayList<Pelicula> getClientePeliculas() {
		return clientePeliculas;
	}


	public void setClientePeliculas(ArrayList<Pelicula> clientePeliculas) {
		this.clientePeliculas = clientePeliculas;
	}


	public ArrayList<Videojuego> getClienteVideojuegos() {
		return clienteVideojuegos;
	}


	public void setClienteVideojuegos(ArrayList<Videojuego> clienteVideojuegos) {
		this.clienteVideojuegos = clienteVideojuegos;
	}


	public static int getnCliente() {
		return nCliente;
	}

	
	public static void setnCliente(int nCliente) {
		Cliente.nCliente = nCliente;
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
		return "Cliente Nº:" + getnCliente() + 
				"\nNombre: " + getNombre() + 
				"\nDireccion: " + getDireccion() + 
				"\nTelefono: " + getTelefono();
		
	}
	
	public void añadir() throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("String:");
			String a = teclado.readLine();
			System.out.println("Int:");
			int b = Integer.parseInt(teclado.readLine());
			System.out.println("Double:");
			double c = Double.parseDouble(teclado.readLine());
		} catch (NumberFormatException e) {
			System.out.println("Ha introducido algun dato erroneo");
		} 
		
	}
}
