package ro.ase.csie.cts.dp.cerinta7.decorator;


public abstract class AbstractDecoratorNotaDePlata extends AbstractNotaDePlata{
	AbstractNotaDePlata notaDePlata = null;
	
	public AbstractDecoratorNotaDePlata(AbstractNotaDePlata notaDePlata) {
		super(notaDePlata.getContinut(), notaDePlata.getPret());
		this.notaDePlata = notaDePlata;
	}

	@Override
	public void printeazaNota() {
		this.notaDePlata.printeazaNota();
	}
}
