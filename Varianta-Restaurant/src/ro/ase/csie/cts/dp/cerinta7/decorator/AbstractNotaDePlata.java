package ro.ase.csie.cts.dp.cerinta7.decorator;

public abstract class AbstractNotaDePlata {

	String continut;
	int pret;
	
	public AbstractNotaDePlata(String continut, int pret) {
		super();
		this.continut = continut;
		this.pret = pret;
	}


	public String getContinut() {
		return continut;
	}


	public int getPret() {
		return pret;
	}
	

	public abstract void printeazaNota();
}
