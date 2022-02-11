package herenciaAnimales;

public class Perro extends Animal{
	
	private String raza;
	
	
	
	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public void emitir_sonido() {
		System.out.println("GUAU GUAU");
	}
	
	public Perro(String animal, float peso, String raza) {
		super(animal,peso);
	
		this.raza = raza;
	}

	@Override
	public String toString() {
		return super.toString() + "Perro [raza=" + raza + "]";
	}

	
	
	

}
