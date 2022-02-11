package herensiateoria;

public class Jefaso extends Trabajadores{
	private int Incentivo;
	
	
	public int getIncentivo() {
		return Incentivo;
	}


	public void setIncentivo(int incentivo) {
		Incentivo = incentivo;
	}


	public Jefaso(String nombre, int edad, int salario, int incentivo) {
		super(nombre,edad,salario);
		this.Incentivo = super.getSalario() + incentivo;
		
	}


	@Override
	public String toString() {
		return super.toString() + " plus salarial por jefe " + Incentivo;
	}


	

	
	
}
