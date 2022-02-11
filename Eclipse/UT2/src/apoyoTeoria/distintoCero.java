package apoyoTeoria;
import java.util.*;
public class distintoCero {
	static Scanner martla=new Scanner(System.in);
	//hacer un programa que nos permita meter una serie de numeros por teclado hasta meter el cero por cada numero metido distinto de 0 debemos visualizarlo por pantalla y al final indicar cuantos numeros distintos de 0 se han metido
	public static void main(String[] args) {
		int numeros= 0;
		int kontador = 0;
		System.out.println("Dame los numeros y introduce 0 para parar");
		numeros=martla.nextInt();
		while (numeros != 0) {
			System.out.println(numeros);
			kontador++;
		
			numeros=martla.nextInt();
		}
		if (kontador != 0);	
			System.out.println(kontador);

	}

}
//hacer programa de tal manera que yo meta un numero por teclado y que obligatoriamente el numero este entre 1 y 6 para poder visualizarlo por pantalla