package interface_vehiculo;

public class Principal {
	public Principal() {
		VehiculoMotorizado auto = new  Auto("Nations inc", "A231E", 2006, 3423, "OTHER", 6);
		VehiculoMotorizado moto = new Moto("Sheni deda inc", "AASD123", 2004, 342, "cotidiano");
		VehiculoMotorizado camion = new Camion("Tqveni", "ABCD123", 2001, 3051, 2, 3);
		Warehouse war = new Warehouse();
		
		((Auto) auto).stringable();
		((Camion) camion).stringable();
		
		System.out.println(moto.toString());
		
		
		
	}

	public static void main(String[] args) {
		new Principal();
		
	}

}
