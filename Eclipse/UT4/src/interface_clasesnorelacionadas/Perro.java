package interface_clasesnorelacionadas;

public class Perro implements IaccionesImprescindibles, IaccionesNecesarias {
	private String raza;
	
	
	
	public Perro(String raza) {
		super();
		this.raza = raza;
	}
	
	

	public Perro() {
		super();
	}



	public void comer() {
		System.out.println("Comerr carne");
	}
	
	public void hacerejercicio() {
		System.out.println("Correrr");
	}

}
