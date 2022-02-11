package empleadoAbst;

public abstract class Empleados{
	protected String codigo;
	protected String nombre;
	protected double sfijo;
	protected Empresa enlace;
	
	
	
	//public abstract String empresa();//
	
	
	public Empleados(String codigo, String nombre,int sueldo, Empresa enlace) {
		this.codigo = codigo;
		this.nombre = nombre;
		sfijo = sueldo;
		this.enlace = enlace;
		

		
	}
	
	
	
	



	public abstract void sueldofi();
	
	
	public abstract double sueldotot();





	@Override
	public String toString() {
		return "Empleados [codigo=" + codigo + ", nombre=" + nombre ;
	}
	
	
	
}
