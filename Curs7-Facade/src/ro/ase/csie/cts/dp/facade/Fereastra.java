package ro.ase.csie.cts.dp.facade;

public class Fereastra {
	protected boolean esteInchisa = true;

	public void inchide() {
		this.esteInchisa = true;
	}

	public void deschide() {
		this.esteInchisa = false;
	}
}
