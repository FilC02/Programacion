package interface3_clasesherencia;

public interface Presa {
	//public abstract 
	default void huir(Animal cazador, Animal cazado) {
		System.out.println("El" + cazador.tipo + "huye DE " + cazado.tipo);
	}
}
