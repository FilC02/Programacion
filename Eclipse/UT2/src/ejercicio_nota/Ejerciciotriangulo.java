package ejercicio_nota;
import java.util.*;

public class Ejerciciotriangulo {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int lado = introducirLongitud();
		int lado2 = introducirLongitud();
		int lado3 = introducirLongitud();
		String valor = calcularTipo(lado,lado2,lado3);
		imprimir(valor,lado,lado2,lado3);

	}
	public static int introducirLongitud() {
		System.out.print("Por favor introduce la longitud del lado correspondiente ");
		return teclado.nextInt(); 
		}
	
	public static String calcularTipo(int lado1, int lado2, int lado3) {
		String valor;
		if ((lado1 == lado2) && (lado2 == lado3)) {
			valor = "rectángulo"; }
			else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3))
				valor = "isosceles";
			else
				valor = "escaleno";
		return valor;
	}
	public static void imprimir(String valor, int lado1, int lado2, int lado3) {
		System.out.println("La longitud del lado 1 es " + lado1 + " la del lado 2 es " + lado2 + " la del lado 3 es " + lado3 + " asi que se trata de un triangulo " + valor);
	}
	
}