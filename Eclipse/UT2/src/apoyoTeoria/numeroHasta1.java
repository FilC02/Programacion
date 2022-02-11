package apoyoTeoria;

import java.util.*;

public class numeroHasta1 {
	static Scanner numero=new Scanner(System.in);
	public static void main(String[] args) {
		// hacer 	programa que me permita meter 1 numero por teclado y que saque por pantalla todos los numeros desde el hasta 1
		int number = 0;
		System.out.println("Dame un numero");
		number=numero.nextInt();
		while (number >= 1) {
			System.out.println(number);
			number--;
			
		}

	}

}
                                                                                                       