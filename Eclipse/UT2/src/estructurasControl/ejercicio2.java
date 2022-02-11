package estructurasControl;

import java.util.*;

public class ejercicio2 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		
		int factorial;
		int factorializado = 1;
		do {
		System.out.println("DAME NÚeMERO");
		factorial=teclado.nextInt();
		} while (0 > factorial || factorial > 7);
		
		
		while (factorial > 0) {
			factorializado = factorializado * factorial;
			factorial--;
		}
		
		System.out.println(factorializado);
	}

}
