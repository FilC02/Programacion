package interface_vehiculo;

public class VehiculoMotorizado {
	protected String fabricante;
	protected String modelo;
	protected int a�o;
	protected double kilometraje;
	
	
	public VehiculoMotorizado(String fabricante, String modelo, int a�o, double kilometraje) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.a�o = a�o;
		this.kilometraje = kilometraje;
	}


	public VehiculoMotorizado() {
		super();
	}


	@Override
	public String toString() {
		return "VehiculoMotorizado [fabricante=" + fabricante + ", modelo=" + modelo + ", a�o=" + a�o + ", kilometraje="
				+ kilometraje + "]";
	}
	
	
	
	
	
}
