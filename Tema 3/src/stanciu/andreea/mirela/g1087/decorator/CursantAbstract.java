package stanciu.andreea.mirela.g1087.decorator;

public abstract class CursantAbstract {
	protected String nume;
	protected String telefon;
	protected String adresaContact;
	
	public CursantAbstract(String nume, String telefon, String adresaContact) {
		super();
		this.nume = nume;
		this.telefon = telefon;
		this.adresaContact = adresaContact;
	}
	
	public String getNume() {
		return nume;
	}

	public String getTelefon() {
		return telefon;
	}

	public String getAdresaContact() {
		return adresaContact;
	}

	public abstract void sustineTestPartial(int nrCapitol);
	public abstract void rezolvaCerintaPractica(int nrCapitol);
	public abstract void sustineExamen();
}
