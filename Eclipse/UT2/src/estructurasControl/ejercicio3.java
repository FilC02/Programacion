package estructurasControl;

import java.util.*;
public class ejercicio3 {
	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		int año;
		int mes;
		do {
		System.out.println("Dame año y dame mes en formato número (1/12)");
		año=teclado.nextInt();
		mes=teclado.nextInt();
		} while (mes > 12 && mes < 1);
		
		

		
		
		if (mes == 2 && (año % 4 == 0)) {
			if(año % 100 == 0 && año % 400 == 0)
			System.out.print("29");
			else if (año % 100 == 0 && año % 400 != 0)
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
