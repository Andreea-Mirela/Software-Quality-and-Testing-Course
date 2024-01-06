package ro.ase.csie.cts.dp.cerinta10.flyweight;

public class TestFlyweight {
	public static void main(String[] args) {
		ContextRezervare contextRezervare1 = new ContextRezervare(1, 5, "10:00");
		ContextRezervare contextRezervare2 = new ContextRezervare(2, 5, "10:00");
		ContextRezervare contextRezervare3 = new ContextRezervare(3, 5, "10:00");

		ClientFlyweightFactory factory = new ClientFlyweightFactory();

		InterfataClient client = factory.getClient("Popescu", "0789546321", "popescu@gmail.com");

		client.realizeazaRezervare(contextRezervare1);
		client.realizeazaRezervare(contextRezervare2);

		InterfataClient client2 = factory.getClient("Popescu", "0789546321", "popescu@gmail.com");

		client2.realizeazaRezervare(contextRezervare3);
	}
}
