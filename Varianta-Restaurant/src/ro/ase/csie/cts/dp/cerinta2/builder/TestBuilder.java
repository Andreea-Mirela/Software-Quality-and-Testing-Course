package ro.ase.csie.cts.dp.cerinta2.builder;


public class TestBuilder {
	public static void main(String[] args) {
		
		Client client = 
				new Client.ClientBuilder("Ion")
				.adaugaAsezareLaGeam()
				.adaugaMuzicaAmbientala()
				.build();
		
		System.out.println(client.toString());
	}
}
