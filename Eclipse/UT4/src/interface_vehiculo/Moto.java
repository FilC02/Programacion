package interface_vehiculo;

public class Moto extends VehiculoMotorizado {
	private String uso;

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(String fabricante, String modelo, int a?o, double kilometraje, String uso) {
		super(fabricante, modelo, a?o, kilometraje);
		this.uso = uso;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() +  "Moto [uso=" + uso + "]";
	}
	
	
	
	
	
	
}
