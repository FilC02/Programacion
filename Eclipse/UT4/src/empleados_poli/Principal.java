package empleados_poli;

public class Principal {
	
	public Principal() {
		
		Empleado e1 = new Mozos("movtyan", "Giorgi", 1100, 7);
		Empleado e2 = new Mensajeros("bozi", "Nika", 1100, 18);
		Dinero cash = new Dinero();
		cash.dinero(e1);
		cash.dinero(e2);
	}
	public static void main(String[] args) {
		Principal sus = new Principal();

	}

}
