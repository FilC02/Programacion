package abstracto;

public class Violin extends Instrumentos {
	public Violin(String tipo) {
		super(tipo);
		
	}

	@Override
	public void tocar() {
		System.out.println("Se toca con el arco");
		
	}
	
	
}
