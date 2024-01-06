
//pt comisionul luat de banca la tranzactii
public class FeeBankAccount extends DebitBankAccount {

	private long fee = 2;
	
	public FeeBankAccount(NotificationService ns, String iban, Person person) {
		super(ns, iban, person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(long amount) throws InsuficientFundException {
		System.out.println("Adding " + fee + " fee to withdrawal");
		super.withdraw(amount + 2);
	}
}
