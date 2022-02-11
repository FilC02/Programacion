package abstracto;

public class Guitarra extends Instrumentos {
	public Guitarra(String tipo) {
		super(tipo);
	}
	public void tocar() {
		System.out.println("Se toca con los dedos");
	}
}
