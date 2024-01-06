package ro.ase.csie.cts.g1087.dp.memento;

import java.util.Date;

public class MementoCaracterJoc {
	
	//rolul obiectului de tip memento este doar sa conserve starea - adica valorile atributelor 
	String denumire;
	int puncteViata;
	String abilitatiMagice;
	
	Date momentSalvare;
	
	public MementoCaracterJoc(String denumire, int puncteViata, String abilitatiMagice) {
		super();
		this.denumire = denumire;
		this.puncteViata = puncteViata;
		this.abilitatiMagice = abilitatiMagice;
		momentSalvare = new Date();
	}
	
}
