package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FuncionCliente {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	ArrayList<Cliente> listaCliente = new ArrayList<>();
	
	FuncionCliente(){
		
	}
	
	public void addCliente() throws IOException {
		System.out.println("-AÑADIR CLIENTE- \nNombre Cliente:");
		String nombre = teclado.readLine(); 
		System.out.println("Direccion  Cliente:");
		String direccion=teclado.readLine();
		System.out.println("Telefono Cliente:");
		String telefono=teclado.readLine();
		listaCliente.add(new Cliente(nombre, direccion, telefono));
		System.out.println("");
	}
	
	public void buscarCliente() throws NumberFormatException, IOException {
		System.out.println("Código del cliente a buscar");
		int num = Integer.parseInt(teclado.readLine());
		if (num>listaCliente.size() || num<0) {
			System.out.println("El código introducido no pertenece a ningun cliente.");
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
}
