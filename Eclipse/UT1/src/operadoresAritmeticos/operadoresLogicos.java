package operadoresAritmeticos;

public class operadoresLogicos {

	public static void main(String[] args) {
		final boolean frio = false;
		System.out.println( frio == frio );
		
		
		boolean bueno = false;
		boolean bonito = true;
		boolean barato = false;
		boolean operador = !bueno & bonito & !barato;
		System.out.println(operador);
		
		boolean llueve = true; 
		boolean riego = false;
		boolean mojado = llueve | riego;
		System.out.println(mojado);
		
		

	}

}
