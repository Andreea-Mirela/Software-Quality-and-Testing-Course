package ro.ase.csie.cts.dp.singleton.an2020.g1084;

import java.util.Arrays;

/*
 * 
 * In cadrul solutiei trebuie permisa o singura/unica instanta a 
 * clasei ContJucator
 * Toate modulele trebuie sa foloseasca acest unic obiect
 * Nu este permisa crearea de obiecte multiple de tipul ContJucator
 * 
 */

public class ContJucator {
	
	String utilizator;
	String parola;
	
	float resurse;
	String email;
	String[] caractereJoc;
	
	//are rolul de a gestiona obiectul unic
	private static ContJucator referintaObiectUnic = null;

	private ContJucator() {
		super();
		System.out.println("Se preiau datele utilizatorului din setarile clientului");
		
		this.utilizator = "Superman";
		this.parola = "123456";
		
		System.out.println("Autentificare jucator....");
		System.out.println("Incarcare profil jucator....");
	}
		
	private ContJucator(String utilizator, String parola) {
		super();
		this.utilizator = utilizator;
		this.parola = parola;
		
		System.out.println("Autentificare jucator....");
		System.out.println("Incarcare profil jucator....");
	}

	@Override
	public String toString() {
		return String.format("Jucatorul cu numele %s", this.utilizator);
	}
	
	public static ContJucator getJucator() {
		if(ContJucator.referintaObiectUnic == null) {
			ContJucator.referintaObiectUnic = new ContJucator();
		}
		return ContJucator.referintaObiectUnic;
	}
	
	//metoda prin care furnizam referinta catre obiectul unic
	//varianta in care metoda are nevoie de date pentru a crea obiectul
	public static ContJucator getJucator(String utilizator, String parola) throws ExceptieCreareJucator {
		if(ContJucator.referintaObiectUnic == null) {
			System.out.println("Creare obiect unic - singleton");
			ContJucator.referintaObiectUnic = new ContJucator(utilizator, parola);
		} else {
			if(!utilizator.equals(ContJucator.referintaObiectUnic.utilizator))
				throw new ExceptieCreareJucator();
		}
		return referintaObiectUnic;
	}
}
