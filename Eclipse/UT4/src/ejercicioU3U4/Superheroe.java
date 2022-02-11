package ejercicioU3U4;

public class Superheroe extends Persona {
	private String nombreFiccion;	

public Superheroe(String nombre,int edad,String ficcion) {
	super(nombre,edad);	
	setNombreFiccion(ficcion);
}

public Superheroe() {
	super();
	setNombreFiccion(null);
}

public String getNombreFiccion() {
	return nombreFiccion;
}


public void setNombreFiccion(String nombreFiccion) {
	this.nombreFiccion = nombreFiccion;
}
@Override
public void correr() {
	super.correr();
	System.out.println("Además tengo otros poderes");
}

public void volar() {
	System.out.println("puedo volar");
}
@Override
public String toString() {
	return super.toString()+"\nMi nombre de ficción es "+nombreFiccion;
}

}