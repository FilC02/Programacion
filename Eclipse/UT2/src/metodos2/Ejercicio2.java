package metodos2;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner teclado = new Scanner(System.in);
	static int numero=leerEntero();
	public static void main(String[] args) {
		
	
		
		while (numero != 0)  {
		int par=comprobarNumero(numero);
		String valor = determinar(par);
		System.out.println(valor);
		
		numero=teclado.nextInt();
		}
			
	}
	
	public static int leerEntero() {
		return teclado.nextInt();
		}
	public static int comprobarNumero(int numer) {
		int par = 0;
		int compr = 0;
		while ((numer < 999) || (numer > 9999))  {
			System.out.println("Valor invalido: introducir un numero de 4 digitos");
			numero=leerEntero();
			numer=numero; }
		
		while (numer > 0) {
			int comprob = numer;
			if (comprob % 2 == 0) {
				par = par + 1; }
			else {
				compr = (numer % 10);  
				}
			numer = numer / 10;
		}
		
		return par;
	}
		
	
	public static String determinar(int par) {
		String valor = "";
		switch (par) {

		case 4:
			valor = "Todos son pares";
			break;
		default:
			valor = "Hay digitos que son inpares";
			
		}
		return valor;

	}

}
