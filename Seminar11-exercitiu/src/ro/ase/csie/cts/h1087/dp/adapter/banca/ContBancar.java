package ro.ase.csie.cts.h1087.dp.adapter.banca;

public interface ContBancar {
	public void transfer(ContBancar destinatie, double suma);
	public void depune(double suma);
}
