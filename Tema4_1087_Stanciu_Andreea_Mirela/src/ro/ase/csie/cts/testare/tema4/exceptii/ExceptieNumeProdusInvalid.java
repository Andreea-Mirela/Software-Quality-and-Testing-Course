package ro.ase.csie.cts.testare.tema4.exceptii;

public class ExceptieNumeProdusInvalid extends Exception {
	public ExceptieNumeProdusInvalid() {
		super("Numele produsului nu trece testul de validare a numarului de caractre!");
	}
}
