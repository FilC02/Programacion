package polimorfismo;

public class Delfin extends Mamifero {
	private double tama�o;

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
	
	public Delfin(Tipo especie, double tama�o) {
		super(especie);
		this.tama�o = tama�o;
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
		return "Tama�o es de: " + tama�o + "metros";
	}
	
	public String verCualidadesDelfin() {
		return "inteligentes\ncuriosos\namigables";
	}
	
	
	

}
