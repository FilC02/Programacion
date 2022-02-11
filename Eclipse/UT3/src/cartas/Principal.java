package cartas;

import java.util.*;

public class Principal {
	static Scanner sus = new Scanner(System.in);
	public Principal() {
		carta jugador1 = new carta();
		carta jugador2 = new carta();
		empezarJugar(jugador1,jugador2);
		imprimirResultadoPartidas(jugador1,jugador2);
		
		
	}

	public static void main(String[] args) {
		
		carta.empezarJugar();
		System.out.println(carta.imprimirResultadoPartidas());
		
		
		

	}
	public void empezarJugar(carta jugador1,carta jugador2) {
		int carta1 = jugador1.sacarCarta();
		int carta2 = jugador2.sacarCarta();
		jugador1.setCarta(carta1);
		jugador2.setCarta(carta2);
		jugador1.comprobar(jugador2);
	}
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

