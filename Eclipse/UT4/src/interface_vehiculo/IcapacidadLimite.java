package interface_vehiculo;

public interface IcapacidadLimite {
	int VAN_LIMIT = 7;
	int AVG_LIMIT = 5;
	int TRUCK_LIMIT = 2;
	
	
	void comprobar();
	
	default void stringable() {
		System.out.println(toString());
		comprobar();
		}
	}

