package flota;

public class moto extends vehiculo {
	static final int FAROS=200;
	private boolean faros;
	private Motor motor;

	public boolean isFaros() {
		return faros;
	}
	

	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	public void setFaros(boolean faros) {
		this.faros = faros;
	}
	
	public moto(String matricula, float precio, int ruedas, String color,boolean faros, Motor motor) {
		super(matricula,precio,ruedas,color);
		this.motor = motor;
		ruedas = 2;
		this.faros = faros;
	}
	
	public moto(String matricula, float precio, String color,boolean faros, Motor motor) {
		super(matricula,precio,color);
		this.motor = motor;
		super.ruedas = 2;
		this.faros = faros;
	}
	
	public String nieblastring(boolean faros) {
		String sino = "";
		if (faros = true) {
			sino = "Si";  }
		else if (faros = false) {
				sino = "no";
		}
		return sino;
			
	
	}
	
	public void establecer_precio() {
		this.precio = this.precio * 0.21f + this.precio;
	}

	@Override
	public String toString() {
		return super.toString() + "moto [faros=" + faros + "]" + " motor " + motor;
	}
	

	
}
