package Videoclub;

public class Excepcion {

	public boolean soloTexto(String a) {
		boolean aux=true;
		int cont=0;
		do {
			
			for (int i = 0; i < a.length(); i++){
				char caracter = a.toUpperCase().charAt(i);
				int valorASCII = (int)caracter;
				if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90)) {
					aux=false;
					if (aux==false&&cont==1) {
						System.out.println("El dato introducido no es correcto. Vuelva a introducirlo");
						cont=cont+1;
					}
				}
			}
			
		} while (aux==true);
		
		return true;
	}
	
	public boolean soloNumero(String a) {
		try {
			Integer.parseInt(a);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
