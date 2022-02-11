package cuentasBancarias;
import java.util.*;
public class banco {
	private String cliente;
	private String cuenta;
	private String clave;
	private double saldo;
	static Scanner sus = new Scanner(System.in);
	
	public void banco(String cliente, String clave) {
		setClave(clave);
		setCliente(cliente);
		
		
	}
	public void banco()  {
		saldo = 0;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public banco(String nombre, String clave) {
		
	}
	public void ingresar() {
		System.out.println("Ingresar cantidad");
		double valor = sus.nextDouble();
		saldo = saldo + valor;	
	}
	
	public void reintegrar() {
		System.out.println("Cantidad a retirar");
		double valor = sus.nextDouble();
		if (valor > saldo) 
			System.out.println("No se puede retirar mas del valor del saldo");
		else { 
			saldo = saldo - valor;
			System.out.println("Ha retirado" +valor+ "queda " +saldo);
		}
		
	}
	public void transferir(banco puntero) {
		System.out.println("Dinero a transferir");	
		double valor = sus.nextDouble();
		if (saldo > valor) {
			puntero.setSaldo(valor);
			System.out.println("Operacion completada, ha transferido" + valor + " a " + puntero.getCliente());
		}
		else {
			System.out.println("Saldo insuficiente, cancelado operación");
		}
			
	}
	
	public void cambiarClave() {
		System.out.println("Para cambiar la contraseña introduzca la contraseña actual");
		String validar = sus.nextLine();
		
		if (validar.equals(clave)) {
			System.out.println("Introduzca la contraseña nueva: ");
			clave = sus.nextLine();
		}
		else
			System.out.println("Contraseña incorrecta");
		
	}
	public void validarCantidad() {
		
		double value;
		do { 
			value = sus.nextDouble();
			if (value > 0) 
		
				System.out.println("Cantidad correcta!");
			else
				System.out.println("Cantidad incorrecta introduzca de nuevo.");
		} while (value <= 0);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
