package herensiateoria;

public class Principal {
	
	public Principal() {
		Trabajadores emp1 = new Trabajadores("Jesus", 18, 965);
		Jefaso jefe = new Jefaso("Maria", 23, 965, 2000);
		
		System.out.println(emp1.toString());
		System.out.println(jefe.toString()); 
	}
	public static void main(String[] args) {
		Principal sus = new Principal();

	}

}
