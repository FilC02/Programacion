package estructurasControl2;
import java.util.*;
import java.lang.Math;
public class ejercicio3 {
	static Scanner teclado = new Scanner(System.in);
		
	static void main(String[] args) {
	float a, b ,c = 0.0F;
	System.out.println("Dame los valores en orden a, b y c para calcular una ra�z cuadrada ");
	a = teclado.nextInt();
	b = teclado.nextInt();
	c = teclado.nextInt();
	double calculo1 = 0.0;
	calculo1 = Math.pow(b, 2) - 4*a*c;
	System.out.println("El discriminante es " + calculo1);
	if (calculo1 > 0) {
		System.out.println(("Soluci�n 1 ") + (-b + Math.sqrt(calculo1))/(2*a) + ("Soluci�n 2 ") + (-b - Math.sqrt(calculo1))/(2*a));
	}
		else if (calculo1 == 0)
			System.out.println("Solo hay una soluci�n " + -b/(2*a));
				else
					System.out.println("Esta ra�z no tiene soluci�n");

	}
}


// (- b +- sqr(pow(b,2) -4ac)) / 2a