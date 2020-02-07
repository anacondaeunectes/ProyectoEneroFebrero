package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FuncionCliente {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	static HashMap<Integer, Cliente> listaCliente = new HashMap<>();
	
	FuncionCliente(){
		
	}
	
	public void addCliente() throws IOException {
		System.out.println("-A�ADIR CLIENTE- \nNombre Cliente:");
		String nombre = teclado.readLine(); 
		System.out.println("Direccion  Cliente:");
		String direccion=teclado.readLine();
		System.out.println("Telefono Cliente:");
		String telefono=teclado.readLine();
		listaCliente.add(new Cliente(nombre, direccion, telefono));
		System.out.println("");
	}
	
	public void buscarCliente() throws NumberFormatException, IOException {
		System.out.println("Codigo del cliente a buscar");
		int num = Integer.parseInt(teclado.readLine());
		if (num>listaCliente.size() || num<0) {
			System.out.println("El codigo introducido no pertenece a ningun cliente.");
		}else {
			for (int i = 0; i < listaCliente.size(); i++) {
				if (num==i) {
					Cliente c = listaCliente.get(i);
					c.toString();
				}
			}
		}
	}
	
	public void eliminarCliente() {
		
	}
	
	public void listaCLientes() {

		for (int i = 0; i < listaCliente.size(); i++) {
			listaCliente.get(i).cc();
		}
	}
	
}
