package interface_herenciamutliple;

public class Principal {
	public Principal() {
		Perro dog = new Perro();
		SerVivo zagli = new Perro("a", "b");
		Ianimal dou = new Perro("a", "b");
		//System.out.println(dog.toString());
		//System.out.println(dawg.toString());
		//System.out.println(dou.toString());
		//System.out.println(Ianimal.TIPOS_CELULAS);
		((Perro) zagli).vacunar();
	}
	public static void main(String[] args) {
		Principal p = new Principal();
		
	}

}
