import java.util.*;

public class Principal {
	
	
	Automatico P1 = new Automatico();
	Manual P2 = new Manual();
	Automatico P3 = new Automatico();
	Window w4 = new Window();
	static Scanner sus = new Scanner(System.in);
	
	public Principal() {
		int n = 0;
		for (int t = 0; t < 6; t++) {
			
			n = sus.nextInt(3) + 1;
				switch (n) {
					case 1:
						
						break;
					case 2:
						P2.open();
						break;
					case 3:
						P3.auto_open();
						break;
					case 4:
						w4.auto_open();
						break;
				}
		}
		
		
		P1.estado();
		P2.estado();
		P3.estado();
		w4.estado();
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Principal();

	}

}
