package metodos1;
import java.util.*;
import java.lang.Math;

public class Ejercicio3 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {

		empezar();
	}
	public static void empezar() {	
	
		double cateto1,cateto2;
		cateto1=meterCateto();
		cateto2=meterCateto();
		double hipotenusa = calcularHipotenusa(cateto1,cateto2);
		
		System.out.println("La hipotenusa de " + cateto1 +  " " + cateto2 + " es: " + hipotenusa);
		
	}
		
	public static double meterCateto() {
		System.out.println("Valor del cateto ");
		return teclado.nextDouble();
		
	}
		
		


	public static double calcularHipotenusa(double cateto1, double cateto2) {
		double hipo= Math.sqrt((Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2)));
		
		return hipo;
		
	}
	public static void empezar(double valor) {
		
	}
	
}
