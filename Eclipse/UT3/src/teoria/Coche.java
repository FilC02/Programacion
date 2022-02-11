package teoria;

public class Coche {
	final static double IVA = 0.21;
	private String marca;
	private double precio;
	public Coche() {
		marca = null;
		precio = 0;
	}
	public Coche(String marca, double precio) {
		SetMarca(marca);
		SetPrezio(precio);
		}
	
	public void SetMarca(String marca)  {
		this.marca = marca;
	}
	public void SetPrezio(double presio) {
		this.precio=presio;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public double getPrecio() {
		return precio;
	}
	public String toString() {
		return "Marca: " + marca + "Precio: " + precio;
	}
	//for (contador=0;contador<8 ;contador) {
		//contador = 0;
		//while (contador < 8) {
			//contador++;
		//}
	//}
	public static void empezar_conducir() {
		System.out.println("Arrancamos \n Meter marcha \n Aceleramos");
	}
	public double calcularPrecioIva() {
		return (precio + (precio * IVA));
	}
}
