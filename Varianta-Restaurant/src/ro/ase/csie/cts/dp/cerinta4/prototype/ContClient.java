package ro.ase.csie.cts.dp.cerinta4.prototype;

import java.util.ArrayList;

public class ContClient implements Cloneable {

	String adresa;
	String parola;
	
	public ContClient(String adresa, String parola) {
		try {
			System.out.println("Inregistrare in baza de date a contului....");
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.adresa = adresa;
		this.parola = parola;
	}
	
	private ContClient() {
		
	}

	public String getAdresa() {
		return adresa;
	}

	public String getParola() {
		return parola;
	}

	@Override
	public String toString() {
		return "ContClient [adresa=" + adresa + ", parola=" + parola + "]";
	}

	@Override
	protected Object clone() {
		//deep-copy
			ContClient copie = new ContClient();
				copie.adresa = this.adresa;
				copie.parola = this.parola;
				
				return copie;
	}
	
	
	
}
