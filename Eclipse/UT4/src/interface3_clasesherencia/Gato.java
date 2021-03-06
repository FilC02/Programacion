package interface3_clasesherencia;

public class Gato extends Animal implements Cazador, Presa {

	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gato(String tipo, String comportamiento) {
		super(tipo, comportamiento);
		// TODO Auto-generated constructor stub
	}
	
	public void perseguir(Animal a) {
		System.out.println("El gato persigue a " + a.tipo);
	}
	
	public void huir(Animal a) {
		System.out.println("El gato huye de " + a.tipo);
	}
	
	public void visualizar_costumbres(Animal animal_upper, Animal animal_lower) {
		System.out.println( toString());
		perseguir(animal_upper);
		huir(animal_lower);
		
		
	}

	@Override
	public String toString() {
		return "Gato [tipo=" + tipo + ", comportamiento=" + comportamiento + "]";
	}
	
	

	
	
	
	
}
