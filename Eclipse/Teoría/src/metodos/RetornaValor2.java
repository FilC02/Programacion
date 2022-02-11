package metodos;

public class RetornaValor2 {

	public static void main(String[] args) {
		int result=0,operador1=3,operador2=5;
		result=sumarNumeros(operador1,operador2);
		System.out.println("Resultado: " + result);
		System.out.println("Main operador1 " + operador1 + " operador2 " + operador2);

	}
	public static int sumarNumeros(int operador1, int operador2) {
		operador1++;
		operador2--;
		System.out.println("sumarNumeros: operador1 " +operador1 + " operador2 " + operador2);
		return operador1+operador2;
		
	}
}
