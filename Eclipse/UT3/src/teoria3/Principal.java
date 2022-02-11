package teoria3;

public class Principal {

	public Principal() {
		
		Libro primero= new Libro("Oracle");
		Libro segundo = new Libro("Java");
		
		segundo.comparaLibro(primero);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal interfaz = new Principal();
	}

}
