package ro.ase.csie.cts.seminar2.solid;
//pt comisionul luat de banca la tranzactii
public class FeeBankAccount extends BankAccount {

	private long fee = 2;
	
	public FeeBankAccount(String iban, Person person) {
		super(iban, person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(long amount) throws InsuficientFundException {
		System.out.println("Adding " + fee + " fee to withdrawal");
		super.withdraw(amount + 2);
	}
}
