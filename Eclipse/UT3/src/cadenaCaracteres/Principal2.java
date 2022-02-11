package cadenaCaracteres;
import java.util.*;
public class Principal2 {
	static Scanner sus = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor= new String("");
		for (int contador = 1; contador <= 4; contador++) {
			System.out.println("Meter palabra " + contador);
			valor = meterPalabra();
			construirTriangulo(valor);
		}
	}
	static String meterPalabra() {
		String palabra;
		palabra = sus.nextLine();
		return palabra;
		
	}
	static String obtenerPrimera(String palabra) {
		String P = "" + palabra.charAt(0);
		return P;
	}
	static String obtenerUltima(String palabra) {
		String a = "" + palabra.charAt(palabra.length() - 1);
		return a;
	}
	static void construirTriangulo(String palabra) {
		String triangle= "";
		char character;
		for (int contador = 0; contador < palabra.length(); contador++) { // for (int i = 1; i <= palabra.length(); i++) {
			character = palabra.charAt(contador); // System.out.println(cadena.substring(0,i);
			triangle = triangle + character;
			System.out.println(triangle);
		}
	}

}
