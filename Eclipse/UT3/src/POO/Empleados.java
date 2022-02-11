package POO;

public class Empleados {
	private String nombre;
	private String apellido;
	private static int edad;
	private static double salario;
	private double more_salary;
	
	public Empleados() {
		nombre = null;
		apellido = null;
		edad = 0;
		salario = 0;
		
		
		
	}
	
	public Empleados(String nombre, String apellido, int edad, double salario) {
		SetNombre(nombre);
		SetApellido(apellido);
		SetEdad(edad);
		SetSalario(salario);
	
	}
	
	public void SetNombre(String nombre) {
		this.nombre = nombre;
	}
	public void SetApellido(String apellido) {
		this.apellido = apellido;
	}
	public void SetEdad(int edad) {
		this.edad = edad;
	}
	public void SetSalario(double salario) {

		this.salario = salario;
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public double getSalario() {
		
		return salario;
	}
	
	public static double subidaSalario(double salary) {
		if (edad<31)
			salary = 100;
		else if (edad < 51)
			salary = 150;
		else
			salary = 200;
		return salary;
	}

	
	public String toString() {
		salario = salario + subidaSalario(salario);
		return "nombre: " + nombre + " apellidos: " + apellido + " edad: " + edad + " salario: " + salario;
	}
	
	
	
}
