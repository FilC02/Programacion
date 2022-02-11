package apoyoTeoria;

import java.util.*;

public class EntradaSalida {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		int edad = 0; //variables locales (dentro del main)
		String nombre = null; //String es una clase
		System.out.println("Meter edad ");
		edad=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Meter nombre ");
		nombre=teclado.nextLine();
		System.out.println("Edad: " + edad + "Nombre: " + nombre);
	}
}
