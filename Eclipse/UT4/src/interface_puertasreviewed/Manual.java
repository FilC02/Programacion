package interface_puertasreviewed;


public class Manual extends Entrances {
	
	
		
	public Manual() {
		super.apertura = apertura;
		// TODO Auto-generated constructor stub
	}
		
		
	public void open() {
		super.apertura =! super.apertura; 
		}
		
		@Override
	public void estado() {
		if (apertura == false) 
			System.out.println("La puerta est? abierta"); 
		else 
			System.out.println("La puerta est? cerrada");
		}
		
	}




