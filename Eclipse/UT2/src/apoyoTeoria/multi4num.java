package apoyoTeoria;

public class multi4num {

	public static void main(String[] args) {
		int numero = 1;
		int contador = 1;
		//utilizando estructura do while nos permita sacar por pantalla el resultado de multiplicar los 4 primeros numeros naturales
		do {
			contador++;
			numero = numero * contador;
			
			
			
		} while (contador < 4);
		System.out.println(numero);
	}

}
//