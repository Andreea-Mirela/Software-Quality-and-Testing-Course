package ro.ase.csie.cts.dp.cerinta8.composite;

public abstract class NodMeniuAbstract {

	// metoda pentru a adauga un nod la structura ierarhica
	public void adaugaNodCopil(NodMeniuAbstract elementStructura) {
		throw new UnsupportedOperationException();
	}

	// public abstract void adaugaNodCopil(NodStructuraIerarhica elementStructura);

	// metoda pentru a sterge un nod din structura ierarhica
	public void stergeNodCopil(NodMeniuAbstract elementStructura) {
		throw new UnsupportedOperationException();
	}

	// metoda pentru a extrage un nod din structura ierarhica
	public NodMeniuAbstract getNodCopil(int i) {
		throw new UnsupportedOperationException();
	}
	
	public abstract String getDenumire();
	public abstract double getPret();
	
	public String getInfo() {
		return this.getDenumire() + " - " + this.getPret();
	}
}
