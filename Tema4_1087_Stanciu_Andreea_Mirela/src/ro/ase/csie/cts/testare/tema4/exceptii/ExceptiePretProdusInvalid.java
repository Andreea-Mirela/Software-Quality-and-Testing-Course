package ro.ase.csie.cts.testare.tema4.exceptii;

public class ExceptiePretProdusInvalid extends Exception {
	public ExceptiePretProdusInvalid() {
		super("Pretul produsului nu trece testul de validare!");
	}
}
