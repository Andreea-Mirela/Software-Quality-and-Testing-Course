package stanciu.andreea.mirela.g1087.decorator;

public class DecoratorCursantBonusMega extends DecoratorAbstractCursant {

	public DecoratorCursantBonusMega(CursantAbstract cursant) {
		super(cursant);
	}

	@Override
	public void sustineExamen() {
		System.out.println("Cursantul " + this.cursant.getNume() + " sustine doar jumatate din cerintele examenului final, avand un bonus de tip Mega");
	}
}

