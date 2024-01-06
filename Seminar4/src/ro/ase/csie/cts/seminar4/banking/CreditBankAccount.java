package ro.ase.csie.cts.seminar4.banking;

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

	public static CreditBankAccount createCreditBankAccountWithBalance(NotificationService ns, String iban, Person accountHolder, long balance) {
		return new CreditBankAccount(ns,iban,accountHolder,balance);		
	}
	
	public static CreditBankAccount createCreditBankAccountWithoutBalance(NotificationService notificationService,
			String iban, Person accountHolder) {
		return new CreditBankAccount(notificationService, iban, accountHolder,0);
	}
}
