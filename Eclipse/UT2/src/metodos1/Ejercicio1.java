package metodos1;
import java.util.*;

public class Ejercicio1 {
	static Scanner teclado=new Scanner(System.in); 
	static final  double LIBRA = 0.87 ,DOLAR = 1.11,YEN = 120.63;
	public static void main(String[] args) { 
		
		
	introducirEuros();

	}
	public static void introducirEuros() {
		
		System.out.println("Introduce valor en euros");
		double num=teclado.nextDouble();
		introducirMoneda(num);
	}
	
	public static void introducirMoneda(double num) {
		System.out.println("A que tipo de moneda quieres cambiar libra/yen/dolar");
		teclado.nextLine();
		String valor=teclado.nextLine();
		if (valor.equals("libra")) {
			num= num * LIBRA;
			
			}
		else if (valor.equals("dolar")) {
			num= num * DOLAR;
			
			}
		else if (valor.equals("yen")) {
			num= num * YEN;
			
			}
		imprimir(num);
		} 
	public static double imprimir(double num) {
		
		return num;
		
	}
	}

// cad.equalsIgnorecase("STRING");
// crear un metodo que pida la cantidad de euros
// crear un metodo que me pida el tipo de moneda
// crear un metodo que dados los anteriores valores convierta la moneda
// crear un metodo que imprima el valor