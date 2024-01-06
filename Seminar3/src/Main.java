import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		NotificationService smsService = new SMSNotificationService();
		NotificationService emailService = new EmailNotificationService();
		
		Map<Person, Receivable> employees = new HashMap <> ();
		
		//cream persoane pe care sa le adaugam in structura
		Person p1 = new Person("Chuck Noris");
		p1.setEmail("chuck@noris.com");
		p1.setMobile("07489753847");
		CreditBankAccount b1 = new CreditBankAccount(smsService,"RF4876R8734678434", p1,-500);
		
		Person p2 = new Person("Arnols");
		p2.setEmail("Arnols@Arnols.com");
		p2.setMobile("07489753847");
		DebitBankAccount b2 = new FeeBankAccount(emailService, "ING4876R8734678434", p2);
		
		Person p3 = new Person("Van Damme");
		p3.setEmail("Damme@Van.com");
		p3.setMobile("07489753847");
		DebitBankAccount b3 = new DebitBankAccount(smsService, "BT4876R8734678434", p3);
		
		employees.put(p1, b1);
		employees.put(p2, b2);
		employees.put(p3, b3);
		
		//e ziua de salariu si vrem sa le adaugam bani in cont
		for(Receivable a : employees.values()) {
			a.deposit(1000);
		}
		
		Map<Person, Payable> union = new HashMap<>();
		union.put(p2, b2);
		union.put(p3, b3);
		
		for(Payable a : union.values()) {
			try {
				a.withdraw(10);
			} catch (InsuficientFundException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		try {
			b2.transfer(b3, 200);
		} catch (InsuficientFundException e) {
			System.out.println(e.getMessage());
		}
	}
}
