package ro.ase.csie.cts.dp.cerinta10.flyweight;

public class Client implements InterfataClient{
	String nume; 
	String nrTelefon;
	String adresaMail;
	public Client(String nume, String nrTelefon, String adresaMail) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresaMail = adresaMail;
	}
	public String getNume() {
		return nume;
	}
	
	@Override
	public void realizeazaRezervare(ContextRezervare context) {
		System.out.println("Clientul " + this.nume + " realizeaza o rezervare la masa " + context.getNrMasa());
	}

}
