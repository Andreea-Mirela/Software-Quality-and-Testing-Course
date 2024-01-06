package ro.ase.csie.cts.dp.chain;

public abstract class Handler {
	protected Handler succesor = null;

	public void setSuccessor(Handler Succesor) {
		succesor = Succesor;
	}

	public abstract void gestioneazaCerere(Mesaj mesaj);
}
