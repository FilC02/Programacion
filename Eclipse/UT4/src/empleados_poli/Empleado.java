package empleados_poli;

import empleadosAbst.

public class Empleado {
	protected String codigo;
	protected String nombre;
	protected double sueldobase;
	protected Empresa enlace;
	
	public Empleado(String codigo, String nombre, double sueldobase) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.sueldobase = sueldobase;
	}
	
	public Empleado() {
		this(null,null,0);
	}
	
	public double dinero() {
		return sueldobase;
	}

	@Override
	public String toString() {
		return "Codigo empleado " + codigo + ", nombre " + nombre + ", sueldo BASE " + sueldobase ;
	}
	
	

}
