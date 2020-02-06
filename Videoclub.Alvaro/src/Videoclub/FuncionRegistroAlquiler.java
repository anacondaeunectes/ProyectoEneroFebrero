package Videoclub;

import java.util.ArrayList;
import java.util.Iterator;

public class FuncionRegistroAlquiler {

	static ArrayList<RegistroAlquiler> listaRegistroAlquiler = new ArrayList<>();
	
	public void addRegistro() {
		
	}
	
	public void listarRegistroAlquiler() {
		Iterator<RegistroAlquiler> ite = listaRegistroAlquiler.iterator();
		
		while (ite.hasNext()) {
			
			System.out.println(ite.next().toString());
		}
	}
	
	
	
	
}