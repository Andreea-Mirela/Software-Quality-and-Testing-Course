package ro.ase.csie.cts.dp.flyweight;

//Client context
public class RezervareContext {
	private final int pozitieText;

	public RezervareContext(int pozitie) {
		this.pozitieText = pozitie;
	}

	public int getPozitie() {
		return this.pozitieText;
	}
}
