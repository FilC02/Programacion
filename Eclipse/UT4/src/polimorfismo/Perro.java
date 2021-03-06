package polimorfismo;

public class Perro extends Mamifero{
	private String raza;
	
	public Perro(Tipo especie, String raza) {
		super(especie);
		this.raza= raza;
	}
	
	public Perro() {
		this(null,null);
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	@Override
	public void moverse() {
		super.moverse();
		System.out.println(" caminando ");
	}
	
	public String toString() {
		return "Su raza es: " + raza;
	}
	
	public void verCualidadesPerro() {
		System.out.println("Sociables\nFieles\nBuen olfato");
	}
	
}
