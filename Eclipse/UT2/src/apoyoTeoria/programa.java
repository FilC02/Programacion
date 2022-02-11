package apoyoTeoria;

import java.util.*;

public class programa {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Dame el primer número: ");
		int numero1=teclado.nextInt();
		System.out.println("Dame el segundo número: ");
		int numero2=teclado.nextInt();
		if ((numero1+numero2) > 5) {
			System.out.println("La suma es mayor de 5 " + "el resultado es: " + (numero1+numero2));
		}
		else {
			System.out.println("La suma es menor a 5"+ "Suma: " + (numero1+numero2));
		}
		System.out.println("Fin de programa");
		
	}
	

} 

