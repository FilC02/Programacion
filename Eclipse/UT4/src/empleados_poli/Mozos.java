package empleados_poli;

public class Mozos extends Empleado {
	private int antiguedad;
	static final int A�OS=3;

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public Mozos(String codigo, String nombre, double sueldobase, int antiguedad) {
		super(codigo,nombre,sueldobase);
		this.antiguedad = antiguedad;
	}
	
	@Override
	public double dinero() {
		int plus = 0;
		int aempresa=antiguedad;
		while(aempresa >= A�OS) {
			aempresa= aempresa - A�OS;
			plus++;
		}
			
		
		return super.dinero()+plus*60;
	}
	
	@Override
	public String toString() {
		return super.toString() + " antiguedad de " + antiguedad + " A�OS ";
	}
	public int trabajados() {
		return A�OS;
	}

}
