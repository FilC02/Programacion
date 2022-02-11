package apoyoTeoria;

public class tablaMultip {

	public static void main(String[] args) {
		//SACAR TABLA MULTIPLICAR 7 ( 7 * 1 = 7 / 7 * 2 = 14 )
		for (int i = 1; i <= 10; i++) {
			int multip = 7 * i;
			System.out.println("7 " + "* " + i + " = " + multip);
		}
		int x = 1;
		int valor = 7;
		while (x <= 10) {
			int multipp = x * valor; 
			System.out.println(valor + " * " + x + " = " + multipp);
			x++;
		}
	}

}
