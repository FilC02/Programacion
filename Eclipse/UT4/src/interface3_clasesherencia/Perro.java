package interface3_clasesherencia;

public class Perro extends Animal implements Cazador {
	
	public void perseguir(Animal animal) {
		System.out.println( tipo + " Perseguir " + animal.tipo);
	}

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String tipo, String comportamiento) {
		super(tipo, comportamiento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Perro [tipo=" + tipo + ", comportamiento=" + comportamiento + "]";
	}
	
	public void visualizar_costumbres(Animal animal) { //Inefficient:Override,
		System.out.println( toString());
		perseguir(animal);
		
		
	}
	
	
	// convert void to string and print 

}
