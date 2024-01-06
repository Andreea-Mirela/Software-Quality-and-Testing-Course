package ro.ase.csie.cts.dp.cerinta7.decorator;

public class DecoratorSarbatoriNotaDePlata extends AbstractDecoratorNotaDePlata {

	public DecoratorSarbatoriNotaDePlata(AbstractNotaDePlata notaDePlata) {
		super(notaDePlata);
	}

	@Override
	public void printeazaNota() {
		System.out.println("Nota de plata ce contine " + this.continut + " trebuie achitata cu " + this.pret + " lei. LA MULTI ANI!!!!");
	}

	
}
