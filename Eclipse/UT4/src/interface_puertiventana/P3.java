package interface_puertiventana;

public class P3 extends Entrances implements Iwiring{
	
	public P3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void auto_open() {
		super.apertura =! super.apertura; }
	
	@Override
	public void estado() {
		if (apertura == false) 
			System.out.println("La puerta 3 est? abierta"); 
		else 
			System.out.println("La puerta 3 est? cerrada");
	}
	

}
