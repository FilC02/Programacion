package vectores3;

public class Main {
	
	Main() {
		Sakartvelo ka = new Sakartvelo();
		int[]vec1;
		int[]vec2;
		int[]vec3;
		
		vec1 = ka.cargar();
		vec2 = ka.cargar();
		
		vec3 = ka.multiplicar(vec1, vec2);
		
		ka.resultado(vec3);
		
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
