package apoyoTeoria;

import java.util.*;

public class ifAnidado {
	static Scanner numero=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("NÚMERO");
		int mes=numero.nextInt();
		
		switch (mes) {
			case 1 :
				System.out.println("Enero");
				break;
			case 2 :
				System.out.println("Febrero");
				break;
			case 3 :
				System.out.println("Marzo");
				break;
			case 4 :
				System.out.println("Abril");
				break;
		
			default :
			System.out.println("NO");
			
		}

		System.out.println("xqzaqx");
		// Preferible usar else antes que if porque a la hora de compilar es más rápido.
		
		//if xxxx {
			//print xxxx
		//else
			//if xxxx {
			//else
					
        		
	}
}

// hacer un programa que me saque la suma de los 3 primeros números naturales
//Crear un programa que compruebe cuantas veces se introduze el numero 5, para finalizar el programa introducir 0 e imprimir las veces que 5 fue introducido