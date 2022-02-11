package estructurasControl;

import java.util.*;

public class ejercicio4 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		int contador;
		int primm = 0;
		numero=teclado.nextInt();
		for (contador = numero; contador > 0; contador--)
			 if (numero % contador == 0 && contador != 1 && contador != numero) {
				 
				System.out.println(contador);
				primm = primm + 1;
		
			 }
		
		if (primm == 0)
			System.out.println("ES  P R I M O");

	}

}
