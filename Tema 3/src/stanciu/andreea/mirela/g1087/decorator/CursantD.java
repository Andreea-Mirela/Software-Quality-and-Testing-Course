package stanciu.andreea.mirela.g1087.decorator;

public class CursantD extends CursantAbstract {

	public CursantD(String nume, String telefon, String adresaContact) {
		super(nume, telefon, adresaContact);
	}

	@Override
	public void sustineTestPartial(int nrCapitol) {
		System.out.println("Cursantul " + this.nume + " sustine testul partial specific capitolului " + nrCapitol);
	}

	@Override
	public void rezolvaCerintaPractica(int nrCapitol) {
		System.out.println("Cursantul " + this.nume + " rezolva cerinta practica a capitolului " + nrCapitol);
	}

	@Override
	public void sustineExamen() {
		System.out.println("Cursantul " + this.nume + " sustine cele 10 etape ale examenului final");
	}

}
