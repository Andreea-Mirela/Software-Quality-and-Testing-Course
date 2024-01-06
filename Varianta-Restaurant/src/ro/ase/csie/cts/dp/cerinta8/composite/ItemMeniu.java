package ro.ase.csie.cts.dp.cerinta8.composite;

public class ItemMeniu extends NodMeniuAbstract {
	String denumire;
	double pret;

	public ItemMeniu(String nume, double pret) {
		this.denumire = nume;
		this.pret = pret;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	
}
