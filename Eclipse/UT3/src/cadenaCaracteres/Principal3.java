package cadenaCaracteres;

public class Principal3 {

	public static void main(String[] args) {
		
		String bien = new String("¡Hola Mundo!");
		StringBuffer sb = new StringBuffer("Hoal Muuundo"); //Capacity 12
		transformarCadena(sb);
		
		

	}
	static public void transformarCadena(StringBuffer ador) {
		ador.delete(6, 8);
		ador.replace(2,4 , "la");
		ador.append('!'); 
		ador.insert(0, '¡');
		System.out.println(ador);
	}

}
