package interface_puertiventana;

public class P1 extends Entrances implements Iwiring{
	public boolean apertura = false;
	
	public P1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void auto_open() {
		super.apertura =! super.apertura; }
	
	@Override
	public void estado() {
		if (apertura == false) 
			System.out.println("La puerta 1 est� abierta"); 
		else 
			System.out.println("La puerta 1 est� cerrada");
	}
	
	
}
