package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class FuncionCliente {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	static int cod=0;
	Cliente c;
	Excepcion ex = new Excepcion();
	HashMap<Integer, Object> listaCliente= new HashMap<>();
	
	FuncionCliente(){
		
	}
	
	public void addCliente() throws IOException {	//Probar
		
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
	
	public void buscarCliente() throws NumberFormatException, IOException {	//Para ver la ficha de un cliente
		System.out.println("Código del cliente a buscar");
		int num = Integer.parseInt(ex.soloNumeros(teclado.readLine()));
		if (num>listaCliente.size() || num<0) {
			System.out.println("El código introducido no pertenece a ningun cliente.");
		}else {
			for (int i = 0; i < listaCliente.size(); i++) {
				if (num==i) {
					listaCliente.get(i).toString();
				}
			}
		}
	}
	
	public void eliminarCliente() throws NumberFormatException, IOException  {
		System.out.println("Código del cliente a eliminar");
		int num = Integer.parseInt(ex.soloNumeros(teclado.readLine()));
		if (num>listaCliente.size() || num<0) {
			System.out.println("El código introducido no pertenece a ningun cliente.");
		}else {
			for (int i = 0; i < listaCliente.size(); i++) {
				if (num==i) {
					listaCliente.remove(i);
				}
			}
		}
	}
}
