package ro.ase.csie.cts.dp.simplefactory.documente;

public class DocumentGeneric {
	String denumire;
	int tip;
	int atribut;
	
	public DocumentGeneric(String denumire, int tip) {
		super();
		this.denumire = denumire;
		this.tip = tip;
	}

	public DocumentGeneric(String denumire, int tip, int atribut) {
		super();
		this.denumire = denumire;
		this.tip = tip;
		this.atribut = atribut;
	}	
}
