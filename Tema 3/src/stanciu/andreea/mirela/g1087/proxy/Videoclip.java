package stanciu.andreea.mirela.g1087.proxy;

public class Videoclip implements InterfataVideoclip {
	private String fisier = null;

	public Videoclip(final String Videoclip) {
		super();
		this.fisier = Videoclip;
		incarcaVideoclip();
	}

	@Override
	public void redareVideoclip() {
		System.out.println("Se afiseaza:" + fisier);
	}

	public void incarcaVideoclip() {
		System.out.println(" Videoclipul " + this.fisier + " se incarca ...");
	}

}
