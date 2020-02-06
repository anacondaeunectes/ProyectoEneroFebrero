package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FuncionCliente {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	static int cod=0;
	Cliente c ;
	Excepcion ex = new Excepcion();
	static HashMap<Integer, Object> listaCliente;

	FuncionCliente(){
		listaCliente = new HashMap<>();
	}
	
	public void addCliente() throws IOException {	//Añade cliente a la lista
		
		System.out.println("-AÑADIR CLIENTE- \nNombre Cliente:");
		String nombre = ex.soloTexto(teclado.readLine());
		System.out.println("Direccion  Cliente:");
		String direccion = ex.soloTexto(teclado.readLine());
		System.out.println("Telefono Cliente:");
		String telefono = ex.soloTelefono(teclado.readLine());
		c = new Cliente(nombre, direccion, telefono);
		cod++;
		listaCliente.put(cod, c);
		System.out.println("");
	}
	
	public void fichaUnCliente() throws NumberFormatException, IOException {	//Para ver la ficha de un cliente
		System.out.println("Codigo del cliente a buscar");
		int num;
		try {
			num = Integer.parseInt(ex.soloNumeros(teclado.readLine()));
			if (num>listaCliente.size() || num<0) {
				System.out.println("El codigo introducido no pertenece a ningun cliente.");
				fichaUnCliente();
			}else {
				for (int i = 0; i < listaCliente.size(); i++) {
					if (num==i) {
						listaCliente.get(i).toString();
					}
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Ese codigo esta fuera del registro");
			fichaUnCliente();
		}
	}
	
	public void eliminarCliente() throws NumberFormatException, IOException  {	//Elimina cliente de la lista
		System.out.println(listaCliente.size());
		System.out.println("Codigo del cliente a eliminar");
		int num;
		try {		//corregir
			num = Integer.parseInt(ex.soloNumeros(teclado.readLine()));
			if (num>listaCliente.size() || num<0) {
				System.out.println("El codigo introducido no pertenece a ningun cliente.");
				eliminarCliente();
			}else {
				for (int i = 0; i < listaCliente.size(); i++) {
					if (num==i) {
						listaCliente.remove(i);
						System.out.println("Cliente eliminado");
					}
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Ese codigo esta fuera del registro");
			eliminarCliente();
		}
	}
	
	public void listarCliente() {
		
		System.out.println(listaCliente.toString().replaceAll("  ", "\n"));
	}
	
	

	
	
	
}
