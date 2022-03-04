package vectores2;
import java.util.*;
public class Warehouse {
	Scanner sus = new Scanner(System.in);
	int max;
	public int[]cargarVector() {
		System.out.println("Tamaño?");
		max = sus.nextInt();
		int[]vector = new int[max] ;
		if (max % 2 != 0) {
			System.out.println("Tiene que ser Par DDDDDDD:");
			
		} else {
			int dat1;
			for (int step=0;step<vector.length; step++) {
				
				System.out.println("Introducir valor de posicion " + (step +1));
				dat1 = sus.nextInt();
				vector[step] = dat1;
			}
			
		} return(vector);
		
	} 
	
	public int[]crearVector(int[]vec1) {
		int[]vector2 = new int[vec1.length];
		
		for (int copyin = 0; copyin< vec1.length; copyin++) {
			vector2[copyin] = vec1[copyin];
		} // copy pasting old array to new one
		
		for(int stepR = 0; stepR<vector2.length; stepR++) {
			if (stepR % 2 == 0) {
				vector2[stepR] = vector2[stepR] * 6;
			} else
				vector2[stepR] = vector2[stepR] + 2;
			
		}return(vector2); //setting specific values
		
	}
	
	public void visualizarVector(int[]vec) {
		System.out.println("El vector es:");
		
		for (int variable = 0; variable < vec.length; variable++) {
			System.out.print(vec[variable] + " ");
		}
	}
	
	
}
