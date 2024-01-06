package ro.ase.csie.cts.dp.cerinta2.builder;

public class Client {
	String nume;
	boolean areAsezareLaGeam;
	boolean areScaunErgonomic;
	boolean areMasaDecorata;
	boolean areMuzicaAmbientala;

	private Client() {
		super();
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", areAsezareLaGeam=" + areAsezareLaGeam + ", areScaunErgonomic="
				+ areScaunErgonomic + ", areMasaDecorata=" + areMasaDecorata + ", areMuzicaAmbientala="
				+ areMuzicaAmbientala + "]";
	}



	// builder pentru clasa
	public static class ClientBuilder {

		private Client client;

		public ClientBuilder(String nume) {
			this.client = new Client();
			this.client.nume = nume;
		}

		public ClientBuilder adaugaAsezareLaGeam() {
			this.client.areAsezareLaGeam = true;
			return this;
		}
		
		public ClientBuilder adaugaScaunErgonomic() {
			this.client.areScaunErgonomic = true;
			return this;
		}
		
		public ClientBuilder adaugaMasaDecorata() {
			this.client.areMasaDecorata = true;
			return this;
		}
		
		public ClientBuilder adaugaMuzicaAmbientala() {
			this.client.areMuzicaAmbientala = true;
			return this;
		}
		
		public Client build(){
			return this.client;
		}
	}
}
