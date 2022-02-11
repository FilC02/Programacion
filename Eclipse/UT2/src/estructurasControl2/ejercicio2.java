package estructurasControl2;

import java.util.*;

public class ejercicio2 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int numeros;
		int mayor_de = 8;
		System.out.println("Dame numeros, introduce 0 para dejar de introducir");
		do {
		numeros = teclado.nextInt();
		if (numeros > mayor_de)
			System.out.println(numeros*2);
		else if ((numeros <= 8) && (numeros != 0))
			System.out.println(numeros*3);
		
	} while (numeros != 0);

}
}
