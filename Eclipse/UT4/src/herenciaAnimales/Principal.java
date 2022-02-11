package herenciaAnimales;

public class Principal {
	Principal() {
	Perro dzaghli = new Perro("perro",20,"amarillo");
	
	System.out.println(dzaghli.toString());
	
	dzaghli.emitir_sonido();
	
	Serpiente sss = new Serpiente("Serpiente",20, "si");
	
	System.out.println(sss.toString());
	
	sss.emitir_sonido();
	
	}
	

	public static void main(String[] args) {
		
		Principal sus = new Principal();

	}

}
