package polimorfismo;

public class Mamifero {
	protected Tipo especie;
	
	public Mamifero(Tipo especie) {
		//super();
		this.especie = especie;
	}
	
	public Mamifero() {
		this(null);
	}
	
	public void moverse() {
		System.out.print("El "+especie.name().toLowerCase()+" se mueve");
	}
	
}
	
