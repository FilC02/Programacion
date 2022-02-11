package ejercicioU3U4;

public class Persona {
	protected String nombre;
	private int edad;
	protected String caracteristicas;
	
	public Persona() {
		this(null,0,null);
	}
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
		System.out.println("Corro como cualquier persona");
	}
	public String toString() {
		return "Mi nombre real es "+nombre+" edad: "+edad + "caracteristicas: " +caracteristicas;
	}

}