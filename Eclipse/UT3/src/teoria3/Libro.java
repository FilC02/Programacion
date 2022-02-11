package teoria3;

public class Libro {
	private String titulo;
	public Libro(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void comparaLibro(Libro puntero) {
		if(titulo.contentEquals(puntero.getTitulo()))
			System.out.println("Los libros tienen el mismo titulo");
		else
			System.out.println("Los libros no tienen el mismo titulo");
	}

}
