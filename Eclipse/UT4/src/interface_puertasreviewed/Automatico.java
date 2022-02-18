package interface_puertasreviewed;

public class Automatico extends Entrances implements Iwiring {
	
public boolean apertura = false;
	
	public Automatico() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void auto_open() {
		super.apertura =! super.apertura; }
	
	@Override
	public void estado() {
		if (apertura == false) 
			System.out.println("La puerta está abierta"); 
		else 
			System.out.println("La puerta está cerrada");
	}
	
	
	
}
