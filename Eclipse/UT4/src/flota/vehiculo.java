package flota;

public class vehiculo {
	protected String matricula;
	protected int ruedas;
	protected float precio;
	private String color;
	protected Motor motor;
	static final float IVA=0.21f;
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public vehiculo(String matricula,float precio, int ruedas, String color) {
		this.matricula = matricula;
		this.ruedas = ruedas;
		this.precio = precio;
		this.color = color;
	}
	
	public vehiculo(String matricula,float precio, String color) {
		this.matricula = matricula;
		this.precio = precio;
		this.color = color;
	}
	
	
	

	

	@Override
	public String toString() {
		return "vehiculo [matricula=" + matricula + ", ruedas=" + ruedas + ", precio=" + precio + ", color=" + color
				+ "]";
	}
	
}
