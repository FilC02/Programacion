package operadoresAritmeticos;

public class Ejercicio1 {

	public static void main(String[] args) {
		double impuesto = 2.2 * 1.0 + 5.0;
		float impuesto2 = 12/2 + (-8);
		int cociente = 16 / 3;
		int resto = 16 % 3;
		double cociente_decimal = 16.0 / 3;
		System.out.println(impuesto + " " + impuesto2 + " " + cociente + " " + resto + " " + " " + cociente_decimal);
		int nueve = 9;
		int postIncremento = ++nueve;
		System.out.println(postIncremento + " " + nueve);
		int postDecremento = nueve--;
		System.out.println(postDecremento + " " + nueve);
		int postpostDecremento = --nueve;
		System.out.println(postpostDecremento + " " + nueve);
		
	}

}
