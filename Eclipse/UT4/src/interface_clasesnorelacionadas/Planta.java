package interface_clasesnorelacionadas;

public class Planta implements IaccionesImprescindibles {
	private String denominacion;
	
	public Planta(String denominacion) {
		super();
		this.denominacion = denominacion; //asdssadsgsahfddgdfsgdsgdfgdsgasdfsagdsagdfadsafdsagdfgdfsgdfsdsagadsggadsg
	}
	
	public void comer() {
		System.out.println("Comerr");
	}

}
