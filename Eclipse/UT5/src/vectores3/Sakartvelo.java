package vectores3;

import java.util.*;

public class Sakartvelo {
	static Scanner sus = new Scanner(System.in);
	int MAX = 5;
	
	public int[]cargar() {
		int[]vec = new int[MAX];
		int adgili;
		for (int steps = 0; steps < vec.length; steps++) {
			System.out.println("Introduce la posicion " + (steps + 1));
			adgili = sus.nextInt();
			vec[steps] = adgili;
		} return(vec);
		
	} 
	
	public int[]multiplicar(int[]vec1, int[]vec2) {
		int[]vec3 = new int[MAX];
		int reversal = 0;
		for (int steps = 0; steps<vec1.length && steps<vec2.length; steps++) {
			reversal = vec2.length - 1;
			vec3[steps] = vec1[steps] * vec2[reversal];
		} return(vec3);
		
	} 
	
	public void resultado(int[]vec3) {
		System.out.println("El vector es: ");
		
		for(int step = 0; step<vec3.length; step++) {
			System.out.print(vec3[step] + " ");
		}
	}
}
