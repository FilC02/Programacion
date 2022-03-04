package geofiguras;

public class Rectangulo extends Figura {
	private double base;
	private double altura;
	
	
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangulo(double posicionX, double posicionY, double base, double altura) {
		super(posicionX, posicionY);
		this.base = base;
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}
	
	public String calcularPerimetro() {
		return "El perimetro es: " + base*altura;
	}
	@Override
	public String toString() {
		return super.toString() + "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	
	
	
	

}
