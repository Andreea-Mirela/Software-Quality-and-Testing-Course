package ro.ase.csie.cts.dp.facade;

public class MasinaSpalat {
	protected boolean esteInchisa = true;

	public void opreste() {
		this.esteInchisa = true;
	}

	public void porneste() {
		this.esteInchisa = false;
	}
}
