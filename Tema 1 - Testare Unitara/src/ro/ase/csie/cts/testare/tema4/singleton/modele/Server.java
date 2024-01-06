package ro.ase.csie.cts.testare.tema4.singleton.modele;

import ro.ase.csie.cts.testare.tema4.InterfataServer;

public class Server implements InterfataServer {

	String adresaIp;
	int port;
	final int nrMaximConexiuni = 10; // nr maxim de utilizatori care se pot conecta simulatn la server (ex serverul
										// de baze de date)
	int nrCurentUtilizatori;

	private static Server referintaObiectUnic = null;

	private Server() {
		System.out.println("Creare server");
	}

	private Server(String adresaIp, int port) {
		System.out.println("Creare server");
		this.adresaIp = adresaIp;
		this.port = port;
		this.nrCurentUtilizatori = 0;
	}

	public static Server getServer(String adresaIp, int port) {
		if (referintaObiectUnic == null) {
			referintaObiectUnic = new Server();
			referintaObiectUnic.adresaIp = adresaIp;
			referintaObiectUnic.port = port;
			referintaObiectUnic.nrCurentUtilizatori = 0;
		}

		return referintaObiectUnic;
	}

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

}
