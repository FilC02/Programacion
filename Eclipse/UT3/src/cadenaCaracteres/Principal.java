package cadenaCaracteres;
import java.util.*;
public class Principal {
	
	static Scanner sus = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		String cadena= new String("");
		while (!cadena.equalsIgnoreCase("Fin")) {
		
			System.out.println("Introducir string: ");
			cadena = sus.nextLine();
			if (!cadena.equalsIgnoreCase("Fin")) {
				convertirMayusculas(cadena);
				convertirMinusculas(cadena);
				String hola = sacarSubcadena(cadena);
				System.out.println("Los 3 primeros caracteres del string son: " + hola);
				int repeticiones = contarCaracteres(cadena);
				System.out.println(repeticiones);
			}
		}
		
		
		
		
	}
	
	public int calcularLongitud(String cadena) {
		int longs;
		longs = cadena.length();
		return longs;
		
	}
	static public void convertirMayusculas(String cadena) {
		System.out.println("Cadena en mayuscula " + cadena.toUpperCase());
	}
	static public void convertirMinusculas(String cadena) {
		System.out.println("Cadena en minuscula " + cadena.toLowerCase());
	}
	static public String sacarSubcadena(String cadena) {
		int range= 2;
		String valor = ""; // return cadena.substring(1,4);
		for (int ct = 0; ct <= range; ct++) {
		
			valor = valor + cadena.charAt(ct);
		}
		return valor;
	
	}
	static public int contarCaracteres(String cadena) {
		char caracter;
		int contador = 0;
		System.out.println("Introduce una letra para contar cuantas veces se repite (en caso de introducir varios caracteres solo se contara el primero)");
		caracter = sus.nextLine().charAt(0);
		
		
		for (int cont = 0; cont < cadena.length(); cont++) {
			if (caracter == cadena.charAt(cont)) {
				contador++;
				
			}
		}
		return  contador;
	}
}
