package cartas;

import java.util.Random;
import java.util.Scanner;

public class carta {
	static Random rand = new Random();
	static Scanner sus = new Scanner(System.in);
	private int carta;
	
	private int playerwins;
	
	
	public int getPlayerwins() {
		return playerwins;
	}
	public void setPlayerwins(int playerwins) {
		this.playerwins = playerwins;
	}
	public int getCarta() {
		return carta;
	}
	public void setCarta(int carta) {
		this.carta = carta;
	}
	
	public int sacarCarta() {
		int playcard = rand.nextInt((12) + 1);
		System.out.println("Card number: " + playcard);
		return playcard;
	}
	
	public void comprobar(carta Jugador) { 
		if (carta > Jugador.getCarta()) {
			
			playerwins++;		
		}
		else if (carta < Jugador.getCarta()) {
			Jugador.setPlayerwins(Jugador.getPlayerwins()+1);
		}
	}


		
	
	

	
	
	
}
