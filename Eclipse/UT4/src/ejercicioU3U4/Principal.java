package ejercicioU3U4;

import java.util.*;
public class Principal {
	Scanner teclado=new Scanner(System.in);
	public Principal() {
		Superheroe superPersona=new Superheroe();
		Persona cara=new Persona();
		System.out.println("Meter edad super héroe");
		int edad=teclado.nextInt();
		superPersona.setEdad(edad);
		teclado.nextLine();
		System.out.println("Meter nombre real super héroe");
		superPersona.nombre=teclado.nextLine();
		System.out.println("Meter nombre ficción super héroe");
		String nficcion=teclado.nextLine();
		superPersona.setNombreFiccion(nficcion);
		System.out.println(superPersona.toString());
		superPersona.correr();
		superPersona.volar();
		
	}

	public static void main(String[] args) {
		Principal p=new Principal();
	}
}
