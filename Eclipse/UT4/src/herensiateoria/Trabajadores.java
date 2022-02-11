package herensiateoria;

public class Trabajadores{
	protected String Nombre;
	protected int Salario;
	protected int edad;
	
	public Trabajadores(String Nombre, int edad, int Salario) {
		this.Nombre = Nombre;
		this.edad = edad;
		this.Salario = Salario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getSalario() {
		return Salario;
	}

	public void setSalario(int salario) {
		Salario = salario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre del trabajador " + Nombre + " Salario base " + Salario + " edad " + edad;
	}
	
	
}
