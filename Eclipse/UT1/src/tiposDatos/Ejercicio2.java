package tiposDatos;

public class Ejercicio2 {
	public static void main(String[] args) {
		final double BOLLO = 0.87;
		final float KILO_QUESO = 13.10F;
		final double GRAMOS = 0.15;
		double bocadillo = ((KILO_QUESO * GRAMOS) + BOLLO);
		System.out.printf("El bocadillo nos cuesta: %.2f\n",bocadillo);
		
		final double NUMERO_DE_HORMIGAS = 6E+100;
		System.out.println("Tenemos en clase una invasión de hormigas, concretamente "+NUMERO_DE_HORMIGAS);
		
		
	}

}
