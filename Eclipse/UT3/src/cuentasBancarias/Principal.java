package cuentasBancarias;
import java.util.*;
public class Principal {
	static Scanner sus = new Scanner(System.in);
	banco julio = null;
	banco marta = null;
	
	public Principal() {
		
		int opcion = 0;
		banco clave;
		julio = new banco("Julio","ESakv","5678");
		marta = new banco("Marta","ESakvs","1234");
		System.out.println("Nombre y contraseña, por favor: ");
		String nombre = sus.nextLine(),clave = sus.nextLine();
		identificarCliente(nombre,clave);
		String hola;
		
		int menu = 0;
		do {
			System.out.println("1. Ingresar dinero. \r\n" + "2. Realizar transferencia. \r\n" + "3. Reintegrar o retirar dinero. \r\n" + "4. Cambiar clave. \r\n" + "5. Conocer saldo. \r\n" + "6. Salir. ");
			menu = sus.nextInt();
			switch  (menu) {
			
				case 1:
					
					marta.ingresar();
					break;
				case 2:
					marta.transferir(julio);
					break;
				case 3:
					String verificar1,verificar2;
					System.out.println("Para hacer una retirada identifiquese de nuevo (introducir usuario y luego contraseña)");
					verificar1=sus.nextLine(); verificar2=sus.nextLine();
					identificarCliente(verificar1,verificar2);
					marta.reintegrar();
					break;
				case 4:
					marta.cambiarClave();
					break;
				case 5:
					marta.validarCantidad();
					break;
				case 6:
					System.out.println("Esperamos verle de nuevo");
					break;
				default:
					System.out.println("Valor invalido, introducir de nuevo: ");
			}
			
		} while (menu != 6);
		
		
		
		
	}

	public static void main(String[] args) {
		Principal sus = new Principal();

	}
	
	public banco identificarCliente(String nombre,String clave) {
		String clave;
		System.out.println("Identificación");
		clave = sus.nextLine();
		while (!clave.equals(marta.getClave()) && (!clave.equals(julio.getClave()))) {
			System.out.println("Clave incorrecta!");
			if (clave.equals(marta.getClave()))
				return marta;
			else if (clave.equals(julio.getClave()))
				return julio;
		}

		
	}

}
