package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {

	Excepcion ex = new Excepcion();
	
	String nombre;
	String direccion;
	String telefono;
	HashMap clientePeliculas;
	HashMap clienteVideojuegos;
	
	
	Cliente() {
		clientePeliculas=new HashMap();
		clienteVideojuegos=new HashMap();
	}
	
	
	Cliente(String nombre, String direccion, String telefono){
		this.nombre=nombre;
		this.direccion=direccion;
		this.telefono=telefono;
		clientePeliculas=new HashMap();
		clienteVideojuegos=new HashMap();
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
	
	public void añadirCliente() throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		try {
			do {
				System.out.println("Nombre Cliente:");			
				nombre = teclado.readLine();
				ex.soloTexto(nombre);
			}while (ex.soloTexto(nombre)==true);
			do {
				System.out.println("Direccion Cliente:");			
				direccion = teclado.readLine();
				ex.soloTexto(direccion);
			}while (ex.soloTexto(direccion)==true);
			do {
				System.out.println("Telefono Cliente:");			
				telefono = teclado.readLine();
				ex.soloNumero(telefono);
			}while (ex.soloNumero(telefono)==true);
		} catch (NumberFormatException e) {
			System.out.println("Ha introducido algun dato erroneo");
		} catch (NullPointerException e) {
			System.out.println("Ha ocurrido algo");
		}
		System.out.println("Creado " + getNombre());
		
	}
}
