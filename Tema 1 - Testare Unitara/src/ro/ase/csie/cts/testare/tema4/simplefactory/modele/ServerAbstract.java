package ro.ase.csie.cts.testare.tema4.simplefactory.modele;

import ro.ase.csie.cts.testare.tema4.InterfataServer;

public abstract class ServerAbstract implements InterfataServer {
	protected String adresaIp;
	protected int port;
	protected final int nrMaximConexiuni = 10; // nr maxim de utilizatori care se pot conecta simulatn la server (ex
												// serverul
	// de baze de date)
	protected int nrCurentUtilizatori;

	public abstract String getTip();

	public abstract void afiseazaSpecificatii();

	@Override
	public String getAdresaIp() {
		return this.adresaIp;
	}

	@Override
	public int getPort() {
		return this.port;
	}

	@Override
	public int getNrMaximConexiuni() {
		return nrMaximConexiuni;
	}

	@Override
	public boolean conectare() {
		if (this.nrCurentUtilizatori < nrMaximConexiuni) {
			this.nrCurentUtilizatori++;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deconectare() {
		this.nrCurentUtilizatori--;
		return true;
	}

	public void setAdresaIp(String adresaIp) {
		this.adresaIp = adresaIp;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setNrCurentUtilizatori(int nrCurentUtilizatori) {
		this.nrCurentUtilizatori = nrCurentUtilizatori;
	}
}
