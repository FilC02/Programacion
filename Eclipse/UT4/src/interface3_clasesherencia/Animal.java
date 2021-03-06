package interface3_clasesherencia;

public abstract class Animal {
	protected String tipo;
	protected String comportamiento;
	
	public Animal(String tipo, String comportamiento) {
		super();
		this.tipo = tipo;
		this.comportamiento = comportamiento;
	}

	public Animal() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Animal [tipo=" + tipo + ", comportamiento=" + comportamiento + "]";
	}
	
	public  abstract void visualizar_costumbres(Animal animal);
	
	
	
	
}
