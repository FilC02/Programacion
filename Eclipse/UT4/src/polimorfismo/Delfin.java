package polimorfismo;

public class Delfin extends Mamifero {
	private double tamaño;

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	
	public Delfin(Tipo especie, double tamaño) {
		super(especie);
		this.tamaño = tamaño;
	}

	public Delfin(Tipo especie) {
		this(null,0.0);
	}

	@Override
	public void moverse() {
		super.moverse();
		System.out.println(" nadando");
	}

	@Override
	public String toString() {
		return "Tamaño es de: " + tamaño + "metros";
	}
	
	public String verCualidadesDelfin() {
		return "inteligentes\ncuriosos\namigables";
	}
	
	
	

}
