package interface_herenciamutliple;

public class Perro extends SerVivo implements Ianimal {

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String tipo, String localizacion) {
		super(tipo, localizacion);
		// TODO Auto-generated constructor stub
	}

	
	public void comer() {
		System.out.println("Los perros son carnivoros. Se alimentan de carne");
	}
	
	public void vacunar() {
		System.out.println("Los cachorros necesitan tres vacunas");
	}
}
