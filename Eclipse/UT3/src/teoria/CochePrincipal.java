package teoria;
import java.util.*;
public class CochePrincipal {
	static Scanner teclado = new Scanner(System.in);
	Coche c2=null;
	public CochePrincipal() {
		String marca; double precio;
		System.out.println("Introducir marca: ");
		marca =teclado.nextLine();
		System.out.println("Meter precio: ");
		precio=teclado.nextDouble();
		c2=new Coche(marca,precio);
		System.out.println(c2.getMarca() + " " + c2.getPrecio());
		System.out.println("pasos para conducir");
		Coche.empezar_conducir();
		System.out.println("Precio total del coche" + c2.calcularPrecioIva());
	}
	public static void main(String[] args) {
		
		CochePrincipal p1 = new CochePrincipal();
	}

}
