package herenciaAnimales;

public class Serpiente extends Animal{
	
	private boolean esVenenosa;
	
	
	
	public boolean isEsVenenosa() {
		return esVenenosa;
	}


	public void setEsVenenosa(boolean esVenenosa) {
		
		this.esVenenosa = esVenenosa;
	}

	public void emitir_sonido() {
		System.out.println("SSSSSSSSSS");
	}
	

	public Serpiente(String animal, float peso, String esVenenosa) {
		super(animal,peso);
		if (esVenenosa.equalsIgnoreCase("Si")) 
			this.esVenenosa = true;
		else
			this.esVenenosa = false;
		
		
	}
	
	public String cambio( ) {
		String veneno;
		if (this.esVenenosa = true) 
			veneno = "si";
		else
			veneno = "no";
		return veneno;

	}

	@Override
	public String toString() {
		return "Serpiente [esVenenosa=" + cambio() + "]";
	}
	

	
	
	
}
