package ro.ase.csie.cts.dp.proxy.virtual;

public class Imagine implements InterfataImagine {
	private String fisier = null;

	@Override
	public void afisareImagine() {

		System.out.println("Se afiseaza:" + fisier);
	}

	public Imagine(final String Imagine) {
		fisier = Imagine;
		incarcaImagine();
	}

	public void incarcaImagine() {
		System.out.println(this.fisier + " Imaginea se incarca ...");
	}
}
