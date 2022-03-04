package geofiguras;

import java.util.*;

public class Principal {
	static Scanner sus = new Scanner(System.in);
	Figura Circulo;
	Geometry ka;
	Figura Rectangulo;
	
	
	Principal() {
		Circulo = new Circulo(2.24, 5.53, 4);
		Rectangulo = new Rectangulo(3.43, 2.12, 3, 5);
		ka = new Geometry();
		String charac = "";
		charac = devolverCaracter();
		System.out.println(charac);
		tratarCaracter(charac);
		
		
		
		
	}

	public static void main(String[] args) {
		new Principal();

	}
	
	public String devolverCaracter() {
		boolean truthis = true;
		String among = "";
		do {
			System.out.println("Introduce si quieres un circulo o un rectangulo!");
			among = sus.nextLine();
			among = among.charAt(0) + "";
			
			
			if ((among.contentEquals("c")) || among.contentEquals("r")) 
				truthis =! truthis;
					
			else
				System.out.println("Por favor, introduce datos correctos.");
		} while (truthis == true);
		return among;
		
	} 
	
	public void tratarCaracter(String us) {
		
		
		if (us.contentEquals("c")) {
			ka.geo(Circulo);
		}
			
		else if (us.contentEquals("r")) {
			ka.geo(Rectangulo);
		}
		
	}
	
	

}
