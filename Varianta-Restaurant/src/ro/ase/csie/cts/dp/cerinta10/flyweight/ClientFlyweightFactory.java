package ro.ase.csie.cts.dp.cerinta10.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ClientFlyweightFactory {
	private Map<String, Client> clienti = new HashMap<String, Client>();

	public Client getClient(String nume, String nrTelefon, String adresaMail) {
		Client client = clienti.get(nume);
		if (client == null) {
			System.out.println("S a adaugat clientul " + nume);
			client = new Client(nume, nrTelefon, adresaMail);
			clienti.put(nume, client);
		}
		return client;
	}

	public int getNrClienti() {
		return clienti.size();
	}
}
