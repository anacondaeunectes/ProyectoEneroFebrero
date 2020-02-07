package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Esta clase contiene las funciones relacionadas con los objetos cliente
 */
public class FuncionCliente {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	static int cod=0;
	Cliente c ;
	Excepcion ex = new Excepcion();
	HashMap<Integer, Cliente> listaCliente;

	FuncionCliente(){
		listaCliente = new HashMap<>();
	}
	
	/**
	 * Metodo que crea y anade un cliente a la coleccion del obejto FuncionCliente
	 */
	public void addCliente() throws IOException {	//Anade cliente a la lista
		
		System.out.println("-ANADIR CLIENTE- \nNombre Cliente:");
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
	
	/**
	 * Metodo que ficha un cliente, es decir, lo describe
	 */
//	public void fichaUnCliente() throws NumberFormatException, IOException {	//Para ver la ficha de un cliente
//		System.out.println(listaCliente.size());
//		System.out.println("Codigo del cliente a buscar");
//		int num;
//		try {
//			num = Integer.parseInt(ex.soloNumeros(teclado.readLine()));
//			if (num>listaCliente.size() || num<=0) {
//				System.out.println("Numero="+num);
//				System.out.println("El codigo introducido no pertenece a ningun cliente.");
//				fichaUnCliente();
//			}else {
//				System.out.println("Dentro del else");
//				for (int i = 0; i < listaCliente.size(); i++) {
//					if (num==i) {
//						listaCliente.get(num).toString();
//					}
//				}
//			}
//		} catch (NullPointerException e) {
//			System.out.println("Ese codigo esta fuera del registro");
//			fichaUnCliente();
//		}
//	}
	
	/**
	 * Metodo que ficha un cliente, es decir, lo describe. El cliente que va a ser descrito es elegido primero.
	 */
	public void ficharSoloCliente() throws NumberFormatException, IOException {
		Iterator g = listaCliente.entrySet().iterator();
		System.out.println("Selecciona el codigo de cliente deseado");
		int num=Integer.parseInt(ex.soloNumeros(teclado.readLine()));
		if (num<=listaCliente.size()&&num>0) {
			while (g.hasNext()) {
				Map.Entry e = (Map.Entry)g.next();
				if ((int) e.getKey()==num) {
					listaCliente.get(num).fichaCliente();
				}		
			}
		}else {
			System.out.println("Introduzca un codigo valido");
			ficharSoloCliente();
		}
	}
	
	/**
	 * Metodo que permite elegir un cliente para luego eliminarlo de la coleccion de Clientes
	 */
	public void eliminarCliente() throws NumberFormatException, IOException  {	//Elimina cliente de la lista
		System.out.println("Selecciona el codigo del cliente a eliminar: ");
		int num=Integer.parseInt(ex.soloNumeros(teclado.readLine()));
			
			if(listaCliente.containsKey(num)){
	            listaCliente.remove(num);
	            System.out.println("Usuario eliminado correctamente");
	        }else {
	        	System.out.println("Usuario no encontrado");
	        }
		
		
	}
	
	/**
	 * Metodo que lista todos los cliente de la coleccion Clientes junto con su "Key"
	 */
	public void listarCliente() {
		Iterator g = listaCliente.entrySet().iterator();
		while (g.hasNext()) {
			Map.Entry e = (Map.Entry)g.next();
			System.out.println("Cod:" + (int) e.getKey() + e.getValue().toString());	
		}

	}
	
	

	
	
	
}
