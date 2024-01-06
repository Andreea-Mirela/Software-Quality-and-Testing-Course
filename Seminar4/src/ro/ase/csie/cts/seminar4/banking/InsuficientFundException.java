package ro.ase.csie.cts.seminar4.banking;


public class InsuficientFundException extends Exception {
	public InsuficientFundException(String msg) {
		super(msg);
	}
}
