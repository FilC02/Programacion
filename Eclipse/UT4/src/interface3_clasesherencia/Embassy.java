package interface3_clasesherencia;

public class Embassy { //unefficient
	
	public void animal(Animal animal) {
		System.out.println(animal.toString());
		if(animal instanceof Perro) {
			((Cazador) animal).perseguir(animal);
		}
		else if (animal instanceof Gato) {
			((Cazador) animal).perseguir(animal);
			((Presa) animal).huir(animal);
			
		}
		else if (animal instanceof Raton) {
			((Presa) animal).huir(animal);
		}
	}
	
	public void sus(String sus) {
		System.out.println("AAA");
	}
}

