package interface_vehiculo;

public class Warehouse { //Improvable
	public void turismo(VehiculoMotorizado vehi) {
		
		//Put toString here as is repeated in all 3 conditionals.
		
		if (vehi instanceof Auto) {
			System.out.println(vehi.toString()); //Useless
			((Auto) vehi).comprobar();	
		}
		if (vehi instanceof Moto) { //Useless (seats non necessary in class -Moto-.
			System.out.println(vehi.toString()); 
		}
		if (vehi instanceof Camion) {
			System.out.println(vehi.toString()); //Useless
			((Camion) vehi).comprobar();	
		}
	}
}
