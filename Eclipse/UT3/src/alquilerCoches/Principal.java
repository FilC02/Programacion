package alquilerCoches;
import java.util.*;
public class Principal {
	static Scanner sus = new Scanner(System.in);
	Vehiculo coche1=null;
	Vehiculo coche2 =null;
	Motor motor1 = null;
	Motor motor2 = null;
	
	public Principal() {
		String menu;
		int loop = 0;
		int reservado = 0;
		motor1 = new Motor("Diesel", "120CV");
		motor2 = new Motor("Diesel", "90CV");
		coche1 = new Vehiculo("3024 JHT", 5, motor1);
		coche2 = new Vehiculo("2078 HTL", 7, motor2);
		
		do {
		menu = insertar_menu();
		switch (menu) {
			case "1":
				Vehiculo coche = meter_plazas();
				if (coche.getReservado()) {
					System.out.println("Coche no disponible");
				}
				else {
					System.out.println(coche.toString());
					coche.disponibilidad(); 
					}
					break;
			case "2":
			
				Vehiculo cochedevu = meter_plazas();
				if (cochedevu.getReservado()) {
					System.out.println(cochedevu.toString());
					cochedevu.disponibilidad();
				}
				else
					System.out.println("Este coche no fue reservado");
				break;
			default:
				System.out.println("Opcion incorrecta");
		}
		} while (loop == 0);

		
		
		
	
		
	}
	public static void main(String[] args) {
		
		Principal amg = new Principal();

	}
	
	public String insertar_menu() {
		String menu;
		System.out.println("-Alquilar coche. (escriba 1) \n -Devolver coche. (escriba 2)");
		menu = sus.nextLine();
		return menu;
		
	}
	public Vehiculo meter_plazas() {
		String plazas;
		Vehiculo coche = null;
	
		System.out.println("El coche es de 5 o 7 plazas?");
		plazas = sus.nextLine();
		if (plazas.equals("5")) 
			coche = coche1;

		else if (plazas.equals("7"))
			coche = coche2;
		return coche;
			
	}
	
	

}
