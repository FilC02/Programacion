package estructurasControl;

import java.util.*;
public class Ejercicio3v2 {
	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		int a�o;
		int mes;
		do {
		System.out.println("Dame a�o y dame mes en formato n�mero (1/12)");
		a�o=teclado.nextInt();
		mes=teclado.nextInt();
		} while (mes > 12 && mes < 1);
		
		

		switch (mes) {
		case 2:
			 if ( (a�o % 4 ==0 && a�o % 100 != 0) || (a�o % 400 == 0) )
				 System.out.print("29");
			 	else
			 		System.out.println("28");
			 	break;		
		case 8 :
			System.out.println("31");
			break;
		
		default:
			switch (mes % 2) {
			case 0 :
				System.out.println("31");
				break;
			
			case 1 :
				
				System.out.println("30");
				break;
				
				//mejor hecho con if debido a agosto ser irregular
			}
		}
		
	}
}

					
