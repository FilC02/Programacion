package teoria;

public class Principal {
	public Principal(){
		Superheroe superpersona = new Superheroe("Carl Kent", 50, "SuperMan", "Altura 150 cm");
		System.out.println(superpersona.toString());
		superpersona.volar();
		superpersona.correr();
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal prin = new Principal();
	}

}
