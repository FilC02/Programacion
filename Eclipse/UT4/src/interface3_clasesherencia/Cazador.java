package interface3_clasesherencia;

public interface Cazador {
	default void sheni(Animal cazador, Animal cazado) {
		System.out.println(cazador + " persigue a " + cazado);
	}
	
	
}
