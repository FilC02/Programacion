package flota;


public class camion extends vehiculo {
	private float peso;
	private Motor motor;
	static final float GASOLINA=0.02f;
	static final float DIESEL=0.05f;
			
	
	
	
	public Motor getMotor() {
		return motor;
	} 


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public camion(String matricula, float precio, int ruedas, String color,float peso, Motor motor) {
		super(matricula,precio,ruedas,color);
		this.motor = motor;
		
		this.peso = peso;
	}
	public void establecer_precio() {
		this.precio = this.precio * 0.21f + this.precio;
	}

	@Override
	public String toString() {
		return super.toString() + "camion [peso=" + peso + "]" + " Motor " + motor;
	}
	
	
	

	
	
}
