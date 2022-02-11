package teoria2;

public class Principal {
	public Principal() {
		Matricula ies = new Matricula("123", "ABC");
		alumno alumn=new alumno();
		alumn.setNombre("Juan");
		alumn.setDatos(ies);
		System.out.println(alumn.toString());
		alumno alumn1 = new alumno("Pedro", ies);
		System.out.println(alumn1.toString());
	}

	public static void main(String[] args) {
		Principal interfaz= new Principal();

	}

}
