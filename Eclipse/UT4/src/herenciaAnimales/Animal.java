package herenciaAnimales;

public class Animal {
	protected  float peso;
	protected String animal;
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	public Animal(String animal, float peso) {
		this.animal = animal;
		this.peso = peso;
	}
	
	public void emitir_sonido() {
		System.out.println("null");
	}
	
	@Override
	public String toString() {
		return "[peso=" + peso + ", animal=" + animal + "]";
	}
	
}
