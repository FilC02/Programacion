package interface_vehiculo;

public class VehiculoMotorizado {
	protected String fabricante;
	protected String modelo;
	protected int año;
	protected double kilometraje;
	
	
	public VehiculoMotorizado(String fabricante, String modelo, int año, double kilometraje) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.año = año;
		this.kilometraje = kilometraje;
	}


	public VehiculoMotorizado() {
		super();
	}


	@Override
	public String toString() {
		return "VehiculoMotorizado [fabricante=" + fabricante + ", modelo=" + modelo + ", año=" + año + ", kilometraje="
				+ kilometraje + "]";
	}
	
	
	
	
	
}
