package empleadoAbst;


public  class EmpCenter {
	public void EmpCenter(Empleados empleado) {
		System.out.println(empleado.toString());
		if (empleado instanceof Administrativos) {
			((Empleados) empleado).sueldofi();
			System.out.println("Sueldo total de: ");
			System.out.println(((Empleados) empleado).sueldotot());
		}
		if (empleado instanceof Vendedores) {
			((Empleados) empleado).sueldofi();
			System.out.println(((Empleados) empleado).sueldotot());
		}
		System.out.println(empleado.totalemp);
	}

}


