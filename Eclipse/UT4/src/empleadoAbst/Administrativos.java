package empleadoAbst;

public class Administrativos extends Empleados {
	private int horas;
	
	
	
	

	public Administrativos(String codigo, String nombre,int sueldo, Empresa empresa, int horas) {
		super(codigo,nombre,empresa,sueldo,enlace);
		this.horas = horas;
		enlace
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public Administrativos() {
		this(0,null,0,null,0);
	}
	
	public double sueldotot() {
		double payslip;
		payslip = super.sfijo + (horas*30);
		return payslip;
		
	}
	
	@Override
	public void sueldofi() {
		super.sfijo = 1200;
		System.out.println("Sueldo base de: " + super.sfijo);
	}
	
	@Override
	public String toString() {
		return super.toString() + " horas extra " + horas;
	}
}
