package estructurasControl;

import java.util.*;
public class ejercicio3 {
	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		int a�o;
		int mes;
		do {
		System.out.println("Dame a�o y dame mes en formato n�mero (1/12)");
		a�o=teclado.nextInt();
		mes=teclado.nextInt();
		} while (mes > 12 && mes < 1);
		
		

		
		
		if (mes == 2 && (a�o % 4 == 0)) {
			if(a�o % 100 == 0 && a�o % 400 == 0)
			System.out.print("29");
			else if (a�o % 100 == 0 && a�o % 400 != 0)
				System.out.println("28");
			else
				System.out.println("28");
		}
		
		else {		
			switch (mes % 2) {
				case 0 :
					System.out.println("31");
					break;
				case 1 :
					System.out.println("30");
					break;
					
			}
		}
		
	}

}
