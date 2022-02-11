package teoria2;

public class alumno {
	
	private String nombre;
	private Matricula datos;
	public alumno() {
		nombre = null;
		datos = null;
	}
	public alumno(String nombre, Matricula dato) {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Matricula getExpediente() {
		return datos;
	}
	public void setDatos(Matricula datos) {
		this.datos = datos;
	}
	public String toString() {
		return "El alumno" + nombre + "está matriculado " + datos.getCurso() + "con el expediente " + datos.getExpediente(); 
	}

}
