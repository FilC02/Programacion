package geofiguras;

public class Circulo extends Figura {
	private double ratio;
	
	
	

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Circulo(double posicionX, double posicionY, double ratio) {
		super(posicionX, posicionY);
		this.ratio = ratio;
		// TODO Auto-generated constructor stub
	}
	
	public String calcularPerimetro() {
		return "El perimetro es: "  + 2*ratio*3.14;
	}

	@Override
	public String toString() {
		return super.toString() + "Circulo [ratio=" + ratio + "]";
	}
	
	
	
	
	
	

}
