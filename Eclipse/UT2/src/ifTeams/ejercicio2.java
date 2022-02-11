package ifTeams;

import java.util.*;

public class ejercicio2 {
	static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		int miedad;
		int compiedad;
		System.out.println("Dame mi edad y la de mi compi");
		miedad=teclado.nextInt();
		compiedad=teclado.nextInt();
		if (miedad > compiedad)
			System.out.println("Soy mayor");
		else 
			if (miedad < compiedad)
				System.out.println("Soy menor");
			else
				System.out.print("Tenemos la misma edad");
		
		

	}

}
