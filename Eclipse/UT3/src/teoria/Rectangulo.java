package teoria;

public class Rectangulo {
	int base;
	int altura;
	private static int contador = 0;
	public static void main(String[] args) {
		System.out.println("Hemos creado" +Rectangulo.contador + " objetos");
		
	}
	public int getAltura() {
		return altura;
		
	}
	public int getBase() {
		return base;
		
	}
	public void setAlt(int altura) {
		this.altura = altura;
	}
	public void setAltura(int alt) {
		altura = Math.abs(alt);
	}
	public int calcular_area() {
		int area=0;
		area = base*altura;
		return area;
	}
	public String toString() {
		return ("La base es " + base + " y la altura " + altura);
	}
	public Rectangulo() {
		base = 0;
		altura = 0;
		contador++;
	}
	public Rectangulo(int base, int alt) {
		altura = alt;
		this.base=base;
		contador++;
	}
}
