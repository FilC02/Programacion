package interface3_clasesherencia;

public class Principal {
	public Principal() {
		Perro  sus = new Perro("P", "PB");
		Gato sus2 = new Gato("G", "GB");
		Raton sus3 = new Raton("R", "RB");
		Embassy embassy = new Embassy();
		
		sus.visualizar_costumbres(sus3);
		sus2.visualizar_costumbres(sus, sus3);
		sus3.visualizar_costumbres(sus2);
		
		
		/*embassy.animal(sus); unefficient
		embassy.animal(sus2);
		embassy.animal(sus3);
		embassy.sus("AA"); */
		
	}
	public static void main(String[] args) {
		Principal amogus = new Principal();
		
		
		
	}

}
