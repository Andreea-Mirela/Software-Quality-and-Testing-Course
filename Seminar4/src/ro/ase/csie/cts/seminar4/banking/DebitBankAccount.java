package ro.ase.csie.cts.seminar4.banking;

//principiul SOLID
public class DebitBankAccount extends BankAccount implements Payable, Receivable, Transferable {
	

	public DebitBankAccount(NotificationService ns, String iban, Person person) {
		super(ns);
		this.iban=iban;
		this.accountHolder = person;
		balance = 0;
	}

	@Override
	public void withdraw(long amount) throws InsuficientFundException {
		if(amount > balance)
			throw new InsuficientFundException("Insuficient funds " + balance);
		notificationService.sendNotificationService(accountHolder, "withdrawing " + amount + " from " + iban);
		balance -= amount;
	}
	
	@Override
	public void deposit(long amount) {
		notificationService.sendNotificationService(accountHolder, "adding " + amount + " in " + iban);
		balance += amount;
	}
	
	//generam doar getteri nu si stteri pt ca nu vrem sa fie accesibile aceste date private
	//click dreapta generate getters and setters
	public String getIban() {
		return iban;
	}

	public long getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [iban=" + iban + ", balance=" + balance + ", accountHolder=" + accountHolder + "]";
	}

	@Override
	public void transfer(Receivable destination, long amount) throws InsuficientFundException {
		this.withdraw(amount);
		destination.deposit(amount);
		
	}

	
	
}
