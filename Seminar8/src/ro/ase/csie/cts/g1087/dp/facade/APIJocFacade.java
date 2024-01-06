package ro.ase.csie.cts.g1087.dp.facade;

public class APIJocFacade {
	//Facade nu e o super inventie, ci ceva facut ca sa elimine dry, face toate operatiile pe care le scrisesem anterior in main 
	
	public static ProfilJucator getProfil(String ipServer, int port, 
			String numeUtilizator, String parola) {
		ServerJoc server = new ServerJoc(ipServer,port);
		if(server.conectare()) {
			Utilizator utilizator = new Utilizator();
			utilizator.login(numeUtilizator, parola);
			ProfilJucator profil = utilizator.getProfil();
			String dateProfil = profil.getDateProfil();
			return profil; 
		} else {
			return null;
		}
	}
}
