package interface_puertiventana;

import java.util.Random;

public class Main {
	Random sus = new Random();
	P1 e1 = new P1();
	P2 e2 = new P2();
	P3 e3 = new P3();
	J4 e4 = new J4();
	EntrancesUnited action = new EntrancesUnited();
	
	public Main() {
		int n = 0;
		for (int t = 0; t < 6; t++) {
			
			n = sus.nextInt(3) + 1;
				switch (n) {
					case 1:
						e1.auto_open();
						break;
					case 2:
						e2.abrir();
						break;
					case 3:
						e3.auto_open();
						break;
					case 4:
						e4.auto_open();
						break;
				}
		}
		
		
		e1.estado();
		e2.estado();
		e3.estado();
		e4.estado();
		
		
		
		
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
