package interface_puertasreviewed;

public class Window implements Iwiring {
	
	
	private boolean apertura = false;
	
	public Window() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void auto_open() {
		System.out.println("Performing action 4"); //Placeholder
		apertura =! apertura;
	}
	
	public void estado() {
		if (apertura == true)
			System.out.println("La ventana est? abierta");
		else
			System.out.println("La ventana est? cerrada");
	}

}
