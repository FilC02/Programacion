package apoyoTeoria;
import java.util.*;
public class visualizar1Y6 {
	static Scanner martla=new Scanner(System.in);
	public static void main(String[] args) {
		//hacer programa de tal manera que yo meta un numero por teclado y que obligatoriamente el numero este entre 1 y 6 para poder visualizarlo por pantalla
		int tecladeado= 0;
		do {
			tecladeado=martla.nextInt();
			
		} while (tecladeado > 6 || tecladeado < 0);
		System.out.println(tecladeado);
	}
	

}
//utilizando estructura do while nos permita sacar por pantalla el resultado de multiplicar los 4 primeros numeros naturales