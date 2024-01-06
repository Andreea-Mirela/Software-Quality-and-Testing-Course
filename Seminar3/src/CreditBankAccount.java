
public class CreditBankAccount extends BankAccount implements Receivable {


	public CreditBankAccount(NotificationService ns, String iban, Person accountHolder, long balance) {
		super(ns);
		this.iban = iban;
		this.accountHolder = accountHolder;
		this.balance = balance;//il cream deja cu o datorie
	}

	@Override
	public void deposit(long amount) {
		this.balance += amount;
		notificationService.sendNotificationService(accountHolder, "adding " + amount + " in " + iban);
	}

}
