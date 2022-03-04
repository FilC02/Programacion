package geofiguras;

public abstract class Figura {
	protected double posicionX;
	protected double posicionY;
	
	public Figura(double posicionX, double posicionY) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	public Figura() {
		super();
		
	}
	
	public abstract String calcularPerimetro();
	
	
	@Override
	public String toString() {
		return "posicionX=" + posicionX + " posicionY=" + posicionY;
	}
	
	
	
	

}
