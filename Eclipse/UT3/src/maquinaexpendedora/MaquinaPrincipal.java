package maquinaexpendedora;
import java.util.*;
	
public class MaquinaPrincipal {
	static Maquina admin = null;
	static Maquina client =  null;
	
	static Scanner teclado = new Scanner(System.in);
	
	public MaquinaPrincipal() {
		
		System.out.println("Cuantas existencias tengo? ");
		int capacidad = teclado.nextInt();
		Maquina client = new Maquina(capacidad);
		
		

		
		while (client.GetExistencias() > 0) {
		client.tragarMoneda();
		
		client.Vender();
		if (client.GetMonedero() > client.PRECIO) {
			client.devolverMonedas();
		}
		System.out.println(client.toString());
		
		
		} 
		System.out.println("Ya no hay mas existencias :("); 
	}
	
	
	public static void main(String[] args) {
		MaquinaPrincipal coc = new MaquinaPrincipal();
	}

}
