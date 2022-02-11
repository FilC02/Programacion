package polimorfismo;

public class Caracteristicas {
	public void imprimir(Mamifero animal) {
		animal.moverse();
		System.out.println(animal.toString());
		if(animal instanceof Perro) {
			System.out.println("Cualidades del perro");
			((Perro) animal).verCualidadesPerro();
		}
		else
			if(animal instanceof Delfin) {
				System.out.println(((Delfin) animal).verCualidadesDelfin());
			}
	}
}
