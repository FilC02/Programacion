package estructurasControl;

import java.util.*;

public class ejercicio1 {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int suma = 0;
		int sumapar = 0;
		int sumainpar = 0;
		int sumacuadrados = 0;
		int numero;
		do {
			System.out.println("Dame númeroooo 1<x<20 ");
			numero=teclado.nextInt();
		}while (numero > 20 || numero < 1);
		
		for (int contador = numero ; contador > 0; contador-- ) {
			suma = suma + contador;
			if (contador % 2 == 0) 
				sumapar = sumapar + contador;
			else	
				sumainpar = sumainpar + contador;
			sumacuadrados = sumacuadrados + (contador*contador);
		}
		System.out.println(suma);
		System.out.println(sumapar);
		System.out.println(sumainpar);
		System.out.println(sumacuadrados);

	}

}
