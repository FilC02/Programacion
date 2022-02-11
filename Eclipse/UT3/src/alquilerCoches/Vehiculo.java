package alquilerCoches;

public class Vehiculo {
	private String matricula;
	private int plazas;
	private boolean reservado;
	private Motor motor;
	
	public Vehiculo(String matricula,int plazas, Motor motor) {
		setMatricula(matricula);
		setPlazas(plazas);
		setMotor(motor);
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	public boolean getReservado() {
		return reservado;
	}
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public String toString() {
		return matricula + " " + plazas + " " + motor;
	}
	
	public void disponibilidad() {
		reservado = !reservado;
		
	}

}
