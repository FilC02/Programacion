package polimorfismo;

public class Principal {
	public Principal() {
		Mamifero dog = new Perro(Tipo.PERRO, "labrador");
		Mamifero dolphe = new Delfin(Tipo.DELFIN,2.3);
		Caracteristicas ob= new Caracteristicas();
		ob.imprimir(dog);
		ob.imprimir(dolphe);
		
	}
	public static void main(String[] args) {
		Principal sus=new Principal();
	}
}
