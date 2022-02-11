package flota;

public class Principal {
	public Principal() {
		moto v1 = new moto("ABCDEFG", 123.23f, "Naranja",true, Motor.DIESEL); 
		moto v2 = new moto("ABCDSSEFG", 1233.23f, 3, "NaSranja",false, Motor.GASOLINA); 
		camion v3 = new camion("ABCDEFG", 123.23f, 3, "Naranja",2.3f,Motor.GASOLINA); 
		establecer_precio(v1);
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		
	}

	public static void main(String[] args) {
		Principal prin = new Principal();
		
	}
	
	public void establecer_precio(moto mo, camion ca) {
		System.out.println(moto.getMotor());
		
		
		
	}

}
