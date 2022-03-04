package vectores2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Warehouse admin = new Warehouse();
		
		
		int vec1[];
		int vec2[];
		
		vec1 = admin.cargarVector();
		if (vec1.length % 2 == 0) {
		vec2 = admin.crearVector(vec1);
		
		admin.visualizarVector(vec1);
		admin.visualizarVector(vec2);
		} 
			
	}

}
