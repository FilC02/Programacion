package teoria;

public class Superheroe extends Persona{
	private String nombreFiccion;
	
	
	public Superheroe(String nombre, int edad, String ficcion, String caracteristicas) {
		super(nombre,edad,caracteristicas);
		nombreFiccion = ficcion;
	}
	

	public String getNombreFiccion() {
		return nombreFiccion;
	}

	public void setNombreFiccion(String nombreFiccion) {
		this.nombreFiccion = nombreFiccion;
	}
	public  void volar() {
		System.out.print("Puedo volar ");
	}
	
	public  void correr() {
		super.correr();
		System.out.print(" Y se mas cosas ");
	}

	@Override
	public String toString() {
		return super.toString()+"\nMi nombre ficticio es " + nombreFiccion;
	}
	
	
}
