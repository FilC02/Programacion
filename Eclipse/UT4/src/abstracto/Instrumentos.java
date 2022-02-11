package abstracto;

public abstract class Instrumentos {
	protected String tipo;
	
	
	
	public Instrumentos(String tipo) {
		super();
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Instrumentos " + tipo ;
	}
	public abstract void tocar();
}
