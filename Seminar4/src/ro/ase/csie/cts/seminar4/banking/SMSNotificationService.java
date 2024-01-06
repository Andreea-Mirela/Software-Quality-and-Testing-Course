package ro.ase.csie.cts.seminar4.banking;

public class SMSNotificationService implements NotificationService {

	@Override
	public void sendNotificationService(Person destination, String msg) {
		System.out.println("Sending SMS to " + destination.getMobile());
		System.out.println(msg);
	}

}
