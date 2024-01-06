package stanciu.andreea.mirela.g1087.singleton;

public class ContAdministrator {
	
	private static ContAdministrator referintaObiectUnic = null;
	
	String email;
	String parola;
	
	private ContAdministrator(String email, String parola) {
		super();
		this.email = email;
		this.parola = parola;
		System.out.println("Autentificare administrator...");
	}

	private ContAdministrator() {
		super();
		System.out.println("Se preiau datele administratorului...");
		this.email = "stanciumirela18@stud.ase.ro";
		this.parola = "123456";
		System.out.println("Autentificare administrator...");
	} 
	
	@Override
	public String toString() {
		return 	String.format("Administratorul cu adresa de email %s", this.email);
	}
	
	public static ContAdministrator getAdministrator(String email, 
			String parola) throws ExceptieCreareAdministrator {
		
		if(ContAdministrator.referintaObiectUnic == null) {
			System.out.println("Creare obiect unic - singleton");
			ContAdministrator.referintaObiectUnic = 
					new ContAdministrator(email, parola);
		}
		else {
			if(!email.equals(ContAdministrator.referintaObiectUnic.email))
				throw new ExceptieCreareAdministrator();
		}
		return referintaObiectUnic;
	}
	
	public static ContAdministrator getAdministrator() {
		if(ContAdministrator.referintaObiectUnic == null)
			ContAdministrator.referintaObiectUnic = new ContAdministrator();
		return ContAdministrator.referintaObiectUnic;
	}

}
