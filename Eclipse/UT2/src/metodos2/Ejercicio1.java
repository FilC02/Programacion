package metodos2;
import java.util.*;

public class Ejercicio1 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int posicion;
		posicion = meterPosicion();
		System.out.println("La suma es: " + calcularNumero(posicion));

	}
	public static int meterPosicion() {
		return teclado.nextInt();
	}
	public static int calcularNumero(int posicion) {
		
		int suma = 1;
		int sumavieja = 0;

		for (int cont = posicion; cont > 2; cont--) {
			suma = suma + sumavieja;
			sumavieja = suma - sumavieja;
			}
		return suma;
}
}