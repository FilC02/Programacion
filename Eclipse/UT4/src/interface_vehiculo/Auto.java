package interface_vehiculo;

public class Auto extends VehiculoMotorizado implements IcapacidadLimite {
	private String estilo;
	private int pasajeros;

	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auto(String fabricante, String modelo, int a?o, double kilometraje, String estilo, int pasajeros) {
		super(fabricante, modelo, a?o, kilometraje);
		this.estilo = estilo;
		this.pasajeros = pasajeros;
		// TODO Auto-generated constructor stub
	}
	
	public void comprobar() {
		if ((estilo.equals("VAN") && pasajeros <= IcapacidadLimite.VAN_LIMIT) || (!(estilo.equals("VAN")) && pasajeros <= IcapacidadLimite.AVG_LIMIT)) {
			System.out.println("El vehiculo SI cumple con las normativas de seguridad");
		}
		else
			System.out.println("El vehiculo NO cumple con las normativas de seguridad");
	}

	@Override
	public String toString() {
		return super.toString() + " Auto [estilo=" + estilo + ", pasajeros=" + pasajeros + "]";
	}
	
	
	
	// default classes are pre-built in extended classes, so their writing is unnecessary.
	
	
	
	
}
