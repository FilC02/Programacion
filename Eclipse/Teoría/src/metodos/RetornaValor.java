package metodos;
import java.util.*;
public class RetornaValor {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {

		int result=0,operador1=0,operador2=0;
		System.out.println("INTRODUCE 2 NÚMEROS");
		operador1=teclado.nextInt();
		operador2=teclado.nextInt();
		
		result=sumarNumeros(operador1,operador2);
		System.out.println("Resultado: " + result);
		sacarResultado(operador1,operador2,(operador1+operador2));
	}
	public static int sumarNumeros(int num1, int num2) {
		return num1+num2;
	}
	public static void sacarResultado(int sumando1,int sumando2,int suma) {
		System.out.println("La suma de " + sumando1 + " y " + sumando2 + " es: " + suma);
		
		
	}
}





