package interface_clasesnorelacionadas;

public class Principal {
	public Principal() {
		Planta sus = new Planta("Arbol");
		Perro sus1 = new Perro("naranja");
		IaccionesImprescindibles sus2 = new Perro("naranja");
		IaccionesImprescindibles sus3 = new Perro("naraenja");
		Polimorfismo poly = new Polimorfismo();
		poly.animaux(sus2);
	}
	public static void main(String[] args) {
		new Principal();

	}

}
