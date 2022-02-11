package operadoresAritmeticos;

public class operadoresComparacion {

	public static void main(String[] args) {
		byte edadJuan = 6;
		byte edadPedro = 6;
		byte edadJulio = 21; 
		short contador = 14;
		double hipotenusa = 206.73;
		double cateto1 = 13.2;
		double cateto2 = 5.7;
		int juan = 6,pedro = 6, julio = 21, contadorebi = 14;
		float ipotenu = 206.73f, cate = 13.2f , cateee = 5.7f;
		
		System.out.println(edadJuan < 18);
		System.out.println(edadJuan == edadPedro);
		System.out.println(edadJulio > edadPedro);
		System.out.println((hipotenusa*hipotenusa) == ((cateto1*cateto1)*(cateto2*cateto2)));
		System.out.println(cateto1 > cateto2);
		System.out.println(contador == 8);
		System.out.println(contador != 8);
	
		
		

	}

}
