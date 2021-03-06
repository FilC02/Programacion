package interface_vehiculo;

public class Camion extends VehiculoMotorizado implements IcapacidadLimite {
	private int remolques;
	private int pasajeros;

	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camion(String fabricante, String modelo, int a?o, double kilometraje, int remolques, int pasajeros) {
		super(fabricante, modelo, a?o, kilometraje);
		this.remolques = remolques;
		this.pasajeros = pasajeros;
		// TODO Auto-generated constructor stub
	}
	
	public void comprobar() {
		if (this.pasajeros > IcapacidadLimite.TRUCK_LIMIT)
			System.out.println("Este vehiculo NO cumple con las normativas de seguridad");
		else 
			System.out.println("Este vehiculo SI cumple con las normativas de seguridad");
	}

	@Override
	public String toString() {
		return super.toString() +  " Camion [remolques=" + remolques + ", pasajeros=" + pasajeros + "]";
	}
	
	
	// default classes are pre-built in extended classes, so their writing is unnecessary.
	
	
}
