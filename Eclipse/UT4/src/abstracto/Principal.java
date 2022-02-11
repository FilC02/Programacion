package abstracto;

public class Principal {
	public Principal() {
		Instrumentos myguitar = new Guitarra("Guitarra");
		Instrumentos violin = new Violin("Violin");
		Instrumenthub ins = new Instrumenthub();
		ins.visualizar(myguitar);
		ins.visualizar(violin);
	}
	public static void main(String[] args) {
		
		new Principal();
	}

}
