package empleadoAbst;

public class Vendedores extends Empleados {
	private double dinventas;
	
	
	
	
	public double getDinventas() {
		return dinventas;
	}



	public void setDinventas(double dinventas) {
		this.dinventas = dinventas;
	}

	
	
	public Vendedores(String codigo, String nombre, String empresa, double dinventas) {
		super(codigo, nombre, empresa);
		this.dinventas = dinventas;
		super.totalemp++;
	}
	
	



	@Override
	public double sueldotot() {
		double payslip;
		payslip = super.sfijo + (10*dinventas)/100;
		super.pagado = super.pagado + payslip;
		return payslip;
		
	}
	
	@Override
	public void sueldofi() {
		super.sfijo = 1200;
		System.out.println("Sueldo base de: " + super.sfijo);
	}



	@Override
	public String toString() {
		return super.toString() +  " Vendedores [dinventas= " + dinventas + "]";
	}
	
	
	
	
	
}
