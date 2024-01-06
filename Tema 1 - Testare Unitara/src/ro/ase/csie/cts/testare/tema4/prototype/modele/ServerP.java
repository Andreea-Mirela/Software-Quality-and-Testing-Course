package ro.ase.csie.cts.testare.tema4.prototype.modele;

import java.util.ArrayList;

import ro.ase.csie.cts.testare.tema4.InterfataServer;

public class ServerP implements InterfataServer, Cloneable{

	protected String adresaIp;
	protected int port;
	protected final int nrMaximConexiuni = 10; // nr maxim de utilizatori care se pot conecta simulatn la server (ex serverul
										// de baze de date)
	protected int nrCurentUtilizatori;
	protected ArrayList<Resursa> resurse = new ArrayList<>();
	
	public ServerP(String adresaIp, int port, ArrayList<Resursa> resurse) {
		System.out.println("Creare server...");
		this.adresaIp = adresaIp;
		this.port = port;
		this.nrCurentUtilizatori = 0;
		this.resurse = resurse;
	}

	private ServerP() {
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

	public ArrayList<Resursa> getResurse() {
		return resurse;
	}

	@Override
	public Object clone() {

		ServerP copie = new ServerP();
		copie.adresaIp = this.adresaIp;
		copie.port = this.port;
		copie.nrCurentUtilizatori = this.nrCurentUtilizatori;
		copie.resurse = (ArrayList<Resursa>) this.resurse.clone();
		
		return copie;
	}
}
