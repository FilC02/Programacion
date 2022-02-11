package empleadoAbst;

public  class Empresa {
	private String denominacion;
	private int totalemp;
	private double pagado;
	private String cif;
	
	public Empresa(String den, String cif) {
		denominacion=den;
		this.cif = cif;
		
		denominacion = "aaa";
		
		this.pagado =
		
	}
	
	public Empresa(String denominacion) {
		this.denominacion = denominacion;
		totalemp++;
	}
	

	@Override
	public String toString() {
		return "Empresa [denominacion=" + denominacion + ", totalemp=" + totalemp + ", pagado=" + pagado + ", cif="
				+ cif + "]";
	}
	
	

	//public abstract void sueldofi();
	
	//public abstract double sueldotot();
	
	
}
