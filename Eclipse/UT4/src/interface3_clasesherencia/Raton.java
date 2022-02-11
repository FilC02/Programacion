package interface3_clasesherencia;

public class Raton extends Animal implements Presa {

	public Raton() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Raton(String tipo, String comportamiento) {
		super(tipo, comportamiento);
		// TODO Auto-generated constructor stub
	}
	
	public void huir(Animal a) {
		System.out.println("El raton huye de " + a.tipo);
	}
	
	public void visualizar_costumbres(Animal animal) {
		System.out.println( toString());
		huir(animal);
		
		
	}

	@Override
	public String toString() {
		return "Raton [tipo=" + tipo + ", comportamiento=" + comportamiento + "]";
	}

	
}
