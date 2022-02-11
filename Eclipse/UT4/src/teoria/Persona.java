package teoria;

public class Persona {

	protected String nombre;
	private int edad;
	protected String caracteristicas;
	
	public Persona(String nombre, int edad, String caracteristicas) {
		this.nombre = nombre;
		this.edad = edad;
		this.caracteristicas = caracteristicas;
	}
	


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void correr() {
		
		System.out.print("Corro como cualquier persona,");
	}

	@Override
	public String toString() {
		return "nombre= " + nombre + ", edad= " + edad + " caracteristicas " + caracteristicas;
	}
	
}
