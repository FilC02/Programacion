package ifTeams;
import java.util.*;
public class ejercicio3 {
	
	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		float presion;
		String rara= "AAAA";
		
		presion=teclado.nextFloat();
		if (presion > 2) {
			System.out.println("Abrir válvula de seguridad");
			presion--;
			System.out.println(presion);
		}
		else {
			System.out.println("Dame teu nombre");
			rara=teclado.next();
			System.out.println("todo bien " + rara);
			
		}

	}

}
