package ejercicio_nota;
import java.util.*;
public class binarios {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int entero = introducirNumero();
		String binary = convertirBinario(entero);
		imprimir(binary);

	}
	public static int introducirNumero() {
		return teclado.nextInt();
	}
	public static String convertirBinario( int numero ) {
		String binary = "";
		while (numero > 0) {
			if (numero % 2 == 0)
				binary = binary + "0";
			else 
				binary = binary + "1";
			numero = numero / 2;
			
		}
		 return binary;
	}
	public static void imprimir( String binary) {
		String invert = "";
		System.out.println(binary);
		int length = binary.length();
		for (int a=0; a < length; a++) {
			a = a + 1;
			char valuee = binary.charAt(binary.length() - a);
			invert = invert + valuee;
			a = a - 1;
		
		}
		System.out.println(invert);
	}
}
