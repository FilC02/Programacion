package vectores1;
import java.util.*;

public class warehouse {
	Scanner sus = new Scanner (System.in);
	final int MAX = 5;
	
	public int[]cargarVector() {
		int[]vector = new int[5];
		for(int indice=0; indice<vector.length;indice++){
			System.out.println("Meter número en posición [ "+indice+" ]");
			vector[indice]=sus.nextInt();
		  }
		 return(vector);
	}
	
	public int[]sumarVectores(int[]vec1,int[]vec2) {
		int[]vec3 = new int[MAX];
		
		for (int steppin = 0; steppin < vec1.length; steppin++) {
			
			vec3[steppin] = vec1[steppin] + vec2[steppin];
			
		}
		return(vec3);
	}
	
	public void visualizarVector(int[]vec1) {
		
		System.out.println("La suma del vector es: " );
		for (int variable:vec1) {
			System.out.print(variable + " ");
		}
		
	}

}
