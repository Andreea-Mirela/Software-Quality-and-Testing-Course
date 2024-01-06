package stanciu.andreea.mirela.g1087.decorator;

public abstract class DecoratorAbstractCursant extends CursantAbstract{
	CursantAbstract cursant = null;
	
	public DecoratorAbstractCursant(CursantAbstract cursant) {
		super(cursant.getNume(), cursant.getTelefon(), cursant.getAdresaContact());
		this.cursant = cursant;
	}

	@Override
	public void sustineTestPartial(int nrCapitol) {
		this.cursant.sustineTestPartial(nrCapitol);
	}

	@Override
	public void rezolvaCerintaPractica(int nrCapitol) {
		this.cursant.rezolvaCerintaPractica(nrCapitol);
	}

	@Override
	public void sustineExamen() {
		this.cursant.sustineExamen();
	}

	

}
