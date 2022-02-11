package empleados_poli;

public class Mensajeros extends Empleado {
	private int edad;
	static final double DIETA=48;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Mensajeros(String codigo, String nombre, double sueldobase, int edad) {
		super(codigo,nombre,sueldobase);
		this.edad = edad;
	}
	
	@Override
	public double dinero() {
		return super.dinero()+DIETA;
	}

	@Override
	public String toString() {
		return super.toString() + " edad " + edad;
	}
	
}
