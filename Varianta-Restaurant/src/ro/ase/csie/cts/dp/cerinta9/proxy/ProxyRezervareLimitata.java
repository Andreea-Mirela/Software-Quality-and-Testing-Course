package ro.ase.csie.cts.dp.cerinta9.proxy;

public class ProxyRezervareLimitata implements InterfataRezervare {
	InterfataRezervare modulRezervareInitial = null;
	public static final int MIN_PERSOANE = 4;
	
	@Override
	public void realizeazaRezervare(int nrPersoane) {

		if(nrPersoane < MIN_PERSOANE) {
			System.out.println("Nu se poate realiza rezervarea din cauza numarului mic de persoane");
		} else {
			modulRezervareInitial.realizeazaRezervare(nrPersoane);
		}
	}
}
