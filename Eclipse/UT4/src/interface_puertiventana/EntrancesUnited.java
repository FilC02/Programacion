package interface_puertiventana;

public class EntrancesUnited {
	public void change(Entrances entrance) {
		
		if (entrance instanceof P1) {
			((P1) entrance).auto_close();
			
		}
		if (entrance instanceof P2) {
			((P2) entrance).abrir();
		}
		if (entrance instanceof P3) {
			((P3) entrance).auto_close();
		}
		if (entrance instanceof J4) {
			((J4) entrance).auto_close();
		}
		
		
	}
}
