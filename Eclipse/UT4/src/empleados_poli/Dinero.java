package empleados_poli;

public class Dinero {
	public void dinero(Empleado empleado) {
			System.out.println(empleado.toString());
		if (empleado instanceof Mozos) {
			
			System.out.println(((Mozos) empleado).dinero());
			
		}
		else if (empleado instanceof Mensajeros) {
			
			System.out.println(((Mensajeros) empleado).dinero());
			
		}
			
	}
}

