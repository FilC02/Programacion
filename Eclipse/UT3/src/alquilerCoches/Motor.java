package alquilerCoches;

public class Motor {
	private String tipo;
	private String potencia;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	public Motor(String tipo, String potencia) {
		setTipo(tipo);
		setPotencia(potencia);
	}
	public String toString() {
		return tipo + " " + potencia;
	}
	

}
