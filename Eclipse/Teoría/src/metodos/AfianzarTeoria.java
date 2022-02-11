package metodos;

import java.util.*;

public class AfianzarTeoria {

	public static void main(String[] args) {

		leerNumero();
	}

	public static int leerNumero() {

		int num;
		do {
			System.out.println("Introduce número distinto a 0");
			Scanner teclado = new Scanner(System.in);
			num = teclado.nextInt();
			comprobarNumero(num);

		} while (num != 0);
		System.out.println("Fin");
		return num;
	}

	public static void comprobarNumero(int num) {
		if (num > 8)
			visualizarDoble(num);
		else
			visualizarTriple(num);
	}

	public static void visualizarDoble(int num) {
		num = num * 2;
		System.out.println(num);
	}

	public static void visualizarTriple(int num) {
		num = num * 3;
		System.out.println(num);
	}
}
