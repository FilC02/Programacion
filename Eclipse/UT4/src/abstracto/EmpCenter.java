package abstracto;

import empleadoAbst.Administrativos;
import empleadoAbst.Empresa;
import empleadoAbst.Vendedores;

public abstract class EmpCenter {
	public void imprimir(Empresa empleado) {
		empleado.toString();
		if (empleado instanceof Administrativos) {
			((Empresa) empleado).sueldofi();
			System.out.println("Sueldo total de: ");
			((Empresa) empleado).sueldotot();
		}
		if (empleado instanceof Vendedores) {
			((Empresa) empleado).sueldofi();
			((Empresa) empleado).sueldotot();
		}
	}

}
