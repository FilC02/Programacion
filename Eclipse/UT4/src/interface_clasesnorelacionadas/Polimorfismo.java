package interface_clasesnorelacionadas;

public class Polimorfismo {
	public void animaux(IaccionesImprescindibles act) {
		act.comer();
		if (act instanceof Perro) {
			((Perro) act).hacerejercicio();
		
		}
		//else if (act instanceof Planta) {
		//	((IaccionesImprescindibles) act).comer();
		//}
		
	}
}
