package interface_puertiventana;

public class J4 implements Iwiring {
	
	private boolean apertura = false;
	
	public J4() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void auto_open() {
		System.out.println("Performing action 4"); //Placeholder
		apertura =! apertura;
	}
	
	public void estado() {
		if (apertura == true)
			System.out.println("La ventana 4 está abierta");
		else
			System.out.println("La ventana 4 está cerrada");
	}

}
