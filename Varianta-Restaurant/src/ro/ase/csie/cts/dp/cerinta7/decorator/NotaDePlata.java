package ro.ase.csie.cts.dp.cerinta7.decorator;

public class NotaDePlata extends AbstractNotaDePlata{

	public NotaDePlata(String continut, int pret) {
		super(continut, pret);
	}

	@Override
	public void printeazaNota() {
		System.out.println("Nota de plata ce contine " + this.continut + " trebuie achitata cu " + this.pret + " lei.");
	}

	
}
