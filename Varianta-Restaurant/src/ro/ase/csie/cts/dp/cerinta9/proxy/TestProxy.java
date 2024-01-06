package ro.ase.csie.cts.dp.cerinta9.proxy;

public class TestProxy {

	public static void main(String[] args) {
		InterfataRezervare rezervare1 = new Rezervare();
		rezervare1.realizeazaRezervare(3);
		
		InterfataRezervare rezervareLimitata = new ProxyRezervareLimitata();
		rezervareLimitata.realizeazaRezervare(3);
	}

}
