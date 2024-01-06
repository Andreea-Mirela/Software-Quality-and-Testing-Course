package ro.ase.csie.cts.testare.tema4.clase;

import java.util.ArrayList;

import ro.ase.csie.cts.testare.tema4.exceptii.ExceptieNumeProdusInvalid;
import ro.ase.csie.cts.testare.tema4.exceptii.ExceptiePretProdusInvalid;
import ro.ase.csie.cts.testare.tema4.exceptii.ExceptieProduseVanduteNull;
import ro.ase.csie.cts.testare.tema4.exceptii.ExceptieValoareProduseInvalida;
import ro.ase.csie.cts.testare.tema4.exceptii.IndexVanzareInexistentException;
import ro.ase.csie.cts.testare.tema4.exceptii.ExceptieVanzareInvalida;

/*
 * 
 * DISCLAIMER
 * 
 * Cele mai multe dintre metodele date au bug-uri si greseli de implementare
 * 
 * 
 * SPECS
 * 
 * nume - intre 5 si 200 caractere alfa-numerice (fara caractere speciale)
 * pret - intre [0.01, 100000)
 * valori in produseVanduteSaptamanal - intre [0, 1000]
 * 
 * 
 */

public class Produs implements InterfataValidariProdus {
	private String nume;
	private float pret;
	private ArrayList<Integer> produseVanduteSaptamanal; // numar de produse vandute in fiecare saptamana

	public Produs(String nume, float pret) throws ExceptieNumeProdusInvalid, ExceptiePretProdusInvalid {
		if (esteNumeValid(nume))
			this.nume = nume;
		else
			throw new ExceptieNumeProdusInvalid();
		if (estePretValid(pret))
			this.pret = pret;
		else
			throw new ExceptiePretProdusInvalid();
		this.produseVanduteSaptamanal = new ArrayList<Integer>();
	}

	public Produs(String nume, float pret, ArrayList<Integer> produseVandute)
			throws ExceptieNumeProdusInvalid, ExceptiePretProdusInvalid, ExceptieValoareProduseInvalida, ExceptieProduseVanduteNull {
		if (esteNumeValid(nume))
			this.nume = nume;
		else
			throw new ExceptieNumeProdusInvalid();
		if (estePretValid(pret))
			this.pret = pret;
		else
			throw new ExceptiePretProdusInvalid();

		if (produseVandute != null) {
			this.produseVanduteSaptamanal = new ArrayList<Integer>();
			for (Integer n : produseVandute)
				if (esteValoareProduseValida(n))
					this.produseVanduteSaptamanal.add(n);
				else
					throw new ExceptieValoareProduseInvalida();
		} else {
			throw new ExceptieProduseVanduteNull();
		}
	}

	public void setVanzari(ArrayList<Integer> produseVandute) throws ExceptieProduseVanduteNull, ExceptieValoareProduseInvalida {
		if (produseVandute != null) {
			this.produseVanduteSaptamanal = new ArrayList<Integer>();
			for (Integer n : produseVandute)
				if (esteValoareProduseValida(n))
					this.produseVanduteSaptamanal.add(n);
				else
					throw new ExceptieValoareProduseInvalida();
		} else {
			throw new ExceptieProduseVanduteNull();
		}
	}

	public String getName() {
		return this.nume;
	}

	public float getPret() {
		return this.pret;
	}

	public void adaugaSaptamana(int produseVandute) throws ExceptieVanzareInvalida {
		if(produseVandute < PRODUSE_VANDUTE_MIN || produseVandute > PRODUSE_VANDUTE_MAX) {
			throw new ExceptieVanzareInvalida();
		}
		this.produseVanduteSaptamanal.add(produseVandute);
	}

	public int getNrProduseVandute(int i) throws IndexVanzareInexistentException {
		if((i < 0) || ( i > this.produseVanduteSaptamanal.size())) {
			throw new IndexVanzareInexistentException();
		}
		return this.produseVanduteSaptamanal.get(i);
	}

	/*
	 * 
	 * 
	 * determina numarul de saptamani in care au fost vandute un numar de produse
	 * peste limita data
	 * 
	 */
	public int getNrSaptamaniPesteMedie(int minLimit) throws ExceptieVanzareInvalida {
		if(minLimit < PRODUSE_VANDUTE_MIN || minLimit > PRODUSE_VANDUTE_MAX) {
			throw new ExceptieVanzareInvalida();
		}
		int nrSaptamani = 0;
		for (int n : this.produseVanduteSaptamanal)
			if (n > minLimit)
				nrSaptamani++;
		return nrSaptamani;
	}

	/*
	 * 
	 * 
	 * determina procentul saptamanilor (din total saptamani) care au avut vanzari
	 * sub limita data
	 * 
	 */
	public int getProcentSaptamaniSlabe(int minLimit) throws ExceptieVanzareInvalida {
		if(minLimit < 0) {
			throw new ExceptieVanzareInvalida();
		}
		float m = 0;
		for (Integer n : produseVanduteSaptamanal)
			if (n < minLimit)
				m++;

		return (int) (100 * m / this.produseVanduteSaptamanal.size());
	}

	/*
	 * 
	 * 
	 * 
	 * determina indexul saptamanilor cu vanzari maxime (mai multe saptamani pot
	 * avea vanzari la nivel maxim)
	 * 
	 * 
	 */

	public ArrayList<Integer> getIndexSaptamaniCuVanzariMaxime() {
		ArrayList<Integer> saptamaniMax = new ArrayList<>();
		int max = this.produseVanduteSaptamanal.get(0);

		for (int i = 0; i < this.produseVanduteSaptamanal.size(); i++)
			if (this.produseVanduteSaptamanal.get(i) > max)
				max = this.produseVanduteSaptamanal.get(i);
		
		for (int i = 0; i < this.produseVanduteSaptamanal.size(); i++)
			if (this.produseVanduteSaptamanal.get(i) == max)
				saptamaniMax.add(i);

		return saptamaniMax;
	}

	@Override
	public String toString() {
		String output = this.nume + " vanzari saptamanale: ";
		for (Integer n : produseVanduteSaptamanal)
			output += n + " ";
		return output;
	}

	public boolean esteNumeValid(String nume) {
		return (nume.length() >= DIMENSIUNE_MIN_NUME && nume.length() <= DIMENSIUNE_MAX_NUME);
	}

	public boolean estePretValid(float pret) {
		return (pret >= PRET_MIN && pret < PRET_MAX);
	}

	public boolean esteValoareProduseValida(int valoareProduse) {
		return (valoareProduse >= PRODUSE_VANDUTE_MIN && valoareProduse <= PRODUSE_VANDUTE_MAX);
	}
}