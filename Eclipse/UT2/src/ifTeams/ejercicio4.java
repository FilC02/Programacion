package ifTeams;

import java.util.*;

public class ejercicio4 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		int calorhoy;
		int calorayer;
		boolean lluvia;
		System.out.println("Dame temperatura de hoy, temperatura de ayer y si llueve o hace sol (true/false)");
		calorhoy=teclado.nextInt();
		calorayer=teclado.nextInt();
		lluvia=teclado.nextBoolean();
		
		if (calorhoy > 20 && lluvia == false) {
			System.out.println("Ta calor pero llueve ");
			System.out.println("Entre ayer y hoy la temperatura fue de: " + (calorhoy + calorayer)/2);
			System.out.println("Mañana habrá " + (calorhoy + 5));
		}
			else if (calorhoy <= 20 && lluvia == true)
				System.out.println("Parece que llega el otoño y llueve");
				else if (calorhoy <= 20 && lluvia == false)
					System.out.println("Parece que llega el otoño pero hace sol");

	}
	
}

//if (tiempo.equals{cadena})