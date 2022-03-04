package teoria;

import java.util.*;

public class Vectored {
	static Scanner teclado = new Scanner(System.in);


	public static void main(String[] args) {
		
		
		final int MAX=4;
		int[] vector = cargarVector();
		
		
		int suma= 0;
		int okupantia = 0;
		public int[] cargarVector() {
			int[] v1 = new int[MAX];
			for (int indice=0;indice<v1.length; indice++) {
				System.out.println("Meter valor en la posicion: " + indice);
				v1[indice] = teclado.nextInt();
			}
			return v1;
		}
		
		public void listar(int[]v1) {
			System.out.println("Elementos del vector: ");
			for(int variable:v1)
				System.out.print(variable + " ");
		}
		
		
		System.out.println("Elementos del vector");
		
		for(int i = 0; i < v1.length; i++ ) { // visualizar valores
			System.out.print(" " + v1[i] + " ");
			
		}
		System.out.println("");
		System.out.println("La suma es: " + okupantia);
		int[] n = cargarvector(v1);


	}

}


