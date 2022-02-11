package empleadoAbst;

public class Principal {
	public Principal() {
		Empresa emp = new Empresa();
		Vendedores ven1 = new Vendedores("ABC13", "Mario", "AA", 4);
		Administrativos ven2 = new Administrativos("ABC13", "Mario", "AA", 4);
		
		
		EmpCenter ob = new EmpCenter();
		ob.EmpCenter(ven1);
		ob.EmpCenter(ven2);
		System.out.println(emp.toString());
		//System.out.println(ven1.toString());
		//ven1.sueldofi();
		//System.out.println(ven1.sueldotot());
	}
	
	public static void main(String[] args) {
		new Principal();

	}
	
}
