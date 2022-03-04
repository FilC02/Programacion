package vectores1;
import java.util.*;
public class Ejercicio1 {
	static Scanner sus = new Scanner(System.in);
	public static void main(String[] args) {

		warehouse items = new warehouse();
		
		int[] vec1;
		int[] vec2;
		int[] vec3;
		
		System.out.println("Cargas!");
		
		vec1 = items.cargarVector();
		vec2 = items.cargarVector();
		
		System.out.println("Suma de 1º y 2º: REALIZADA!");
		
		vec3 = items.sumarVectores(vec1, vec2);
		
		System.out.println("Visualización :D");
		
		items.visualizarVector(vec1);
		items.visualizarVector(vec2);
		items.visualizarVector(vec3);
		
		
	}

}
