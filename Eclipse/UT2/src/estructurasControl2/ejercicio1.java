package estructurasControl2;

import java.util.*;

public class ejercicio1 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int piezas = 0;
		float longitud = 0.0F;
		int tavien = 0;
		int contador = 1;
		System.out.print("Dame el numero de piesas");
		piezas = teclado.nextInt();
		
		
		while (piezas > 0) {
			System.out.print("Dame la longuitud de la pieza " + contador);
			longitud = teclado.nextFloat();
			if ((1.30F > longitud) && (longitud > 1.20F)) {
				System.out.println("Ta vien");
				
				tavien++;
				}
				else 
					System.out.println("Ta mal");
			
			piezas--;
			contador++;
		}
		System.out.println("NUMERO DE PIEZAS VÁLIDAS " + tavien);

	}

}
