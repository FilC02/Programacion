package estructurasControl;
import java.util.*;

public class ejercicio5 {
	static Scanner teclado= new Scanner(System.in);
	public static void main(String[] args) {
		int puesto = 0;
		System.out.println("POSISION PORFABOR");
		puesto=teclado.nextInt();
		switch (puesto) {
			  case 1 :
				System.out.println("ORO");
				break;
			case 2 :
				System.out.println("PLATA");
				break;
			case 3 :
				System.out.println("BRONCE");
				break;
			default :
				System.out.println("GRASIAS POR PARTISIPAR");
		}
		teclado.close();
	}

}
// Math