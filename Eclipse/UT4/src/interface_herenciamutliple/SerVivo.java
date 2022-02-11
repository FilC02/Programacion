package interface_herenciamutliple;

public abstract class SerVivo  {
	private String tipo;
	private String localizacion;
	
	
	
	
	public SerVivo(String tipo, String localizacion) {
		super();
		this.tipo = tipo;
		this.localizacion = localizacion;
	}
	
	
	
	public SerVivo() {
		super();
	}



	



	@Override
	public String toString() {
		return "SerVivo [tipo=" + tipo + ", localizacion=" + localizacion + "]";
	}
	
	public abstract void comer();
	public abstract void vacunar();
	
}
