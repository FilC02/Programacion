package estructurasControl;

import java.util.*;
public class Ejercicio3v2 {
	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		int año;
		int mes;
		do {
		System.out.println("Dame año y dame mes en formato número (1/12)");
		año=teclado.nextInt();
		mes=teclado.nextInt();
		} while (mes > 12 && mes < 1);
		
		

		switch (mes) {
		case 2:
			 if ( (año % 4 ==0 && año % 100 != 0) || (año % 400 == 0) )
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

					
