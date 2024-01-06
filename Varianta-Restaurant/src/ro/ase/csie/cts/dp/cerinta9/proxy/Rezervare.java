package ro.ase.csie.cts.dp.cerinta9.proxy;

public class Rezervare implements InterfataRezervare {
	
	@Override
	public void realizeazaRezervare(int nrPersoane) {
		System.out.println("Rezervare realizata pentru " + nrPersoane + " persoane");
	}
}
