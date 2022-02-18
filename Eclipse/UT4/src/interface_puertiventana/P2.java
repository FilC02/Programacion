package interface_puertiventana;

public class P2 extends Entrances {
	
	public P2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void abrir() {
		System.out.println("Estas abriendo/cerrando la puerta 2"); //Placeholder
		super.apertura =! super.apertura;
	}
	
	public void estado() {
		if (super.apertura == true)
			System.out.println("Puerta 2 abierta");
		else
			System.out.println("Puerta 2 cerrada");
	}

}
