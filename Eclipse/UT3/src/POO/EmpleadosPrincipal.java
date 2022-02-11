package POO;
import java.util.*;
public class EmpleadosPrincipal {
	static Scanner teclado = new Scanner(System.in);
	static Empleados emp1 = null;
	static Empleados emp2 = null;
	 
	public EmpleadosPrincipal() {
		emp1 = crearEmpleado();
		System.out.println(emp1.toString());
		String nombre2 = "Agustin ";
		String apellido2 = "Alvarado ";
		int edad2 = 60;
		double salario2 = 1500;
		emp2 = new Empleados(nombre2,apellido2,edad2,salario2);
		System.out.println(emp2.toString());
	
	}
	public static void main(String[] args) {
	
		EmpleadosPrincipal p1 = new EmpleadosPrincipal();
		
		
	}
	

	public Empleados crearEmpleado() {
		System.out.println("Nombre " + " Apellidos " + "edad " + "salario ");
		String nombre = teclado.nextLine();
		String apellido = teclado.nextLine();
		int edad = teclado.nextInt();
		double salario = teclado.nextDouble();
		emp1 = new Empleados(nombre,apellido,edad,salario);
		return emp1;
	}
}

