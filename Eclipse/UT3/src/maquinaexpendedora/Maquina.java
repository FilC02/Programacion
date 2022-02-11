package maquinaexpendedora;

import java.util.*;

public class Maquina {
	final String PRODUCTOS = "Pañuelos";
	private int monedero;
	private int existencias;
	final int PRECIO = 90;
	private int ganancias;
	static Scanner teclado = new Scanner(System.in);
	
	public Maquina() {
		monedero = 0;
		existencias = 0;
		ganancias = 0;
	}
	
	public Maquina(int existencias) {

		this();
		SetExistencias(existencias);
		SetGanancias(ganancias);
		SetMonedero(monedero);
																																												
	}

	public void SetMonedero(int monedero) {
		this.monedero = monedero;
	}
	public void SetExistencias(int existencias) {
		this.existencias = existencias;
	}
	
	public void SetGanancias(int ganancias) {
		this.ganancias = ganancias;
	}
	
	public int GetMonedero() {
		return monedero;
	}
	
	public int GetExistencias() {
		return existencias;
	}
	
	public int GetGanancias() {
		return ganancias;
	}
	
	public void tragarMoneda() {
		if (monedero == 0) {
			System.out.println("Bienvenido/a, la maquina solo acepta monedas de 10, 20 y 50 ");
		}
		int valor;
		do {
			System.out.println("Introducir moneda ");
			valor = teclado.nextInt();
			if (valor == 10 || valor == 20 || valor == 50) {
				monedero = monedero + valor; 
				
			}	
			else 
				System.out.println("Solo se aceptan monedas de 10, 20 o 50"); 
			
			
			if (PRECIO - monedero > 0)  {
				System.out.println("Faltan: " + (PRECIO - monedero) + " céntimos");
			}
		}  while (monedero < PRECIO);
		
		
		 
		}
			
	
	public void Vender() {
		existencias--;
		ganancias = ganancias + PRECIO;
		
	}
	public void devolverMonedas() {

		
		if (monedero-PRECIO > 0)  { 
			System.out.println("La vuelta es: " + (monedero-PRECIO)); }
		
		monedero = 0;
			
	}
	public String toString() {

		return "Producto a vender: " + PRODUCTOS + " El precio: " + PRECIO + " Las existencias: " + existencias + " Ganancias: " + ganancias;
	}
	

}
