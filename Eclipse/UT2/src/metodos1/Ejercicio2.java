package metodos1;
import java.util.*;
public class Ejercicio2 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		leerNumero();
	}
	public static void leerNumero() {
		System.out.println("Precio: ");
		int valor = teclado.nextInt();
		calcularPrecio(valor);
	}
	public static void calcularPrecio(double num) {
		num = ((num*21)/100) + num;
		imprimir(num);
		
		
	}
	public static void imprimir(double num) {
		System.out.println(num);
	}
}

