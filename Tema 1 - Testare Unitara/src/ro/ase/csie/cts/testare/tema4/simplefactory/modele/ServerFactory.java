package ro.ase.csie.cts.testare.tema4.simplefactory.modele;

public class ServerFactory {
public static ServerAbstract creareServer(TipServer tipServer, String adresaIp, int port) {
		
		ServerAbstract server = null;
		
		switch(tipServer) {
		case GAMING: 
			server = new GamingServer();
			server.setAdresaIp(adresaIp);
			server.setPort(port);
			break;
		case WEB:
			server = new WebServer();
			server.setAdresaIp(adresaIp);
			server.setPort(port);
			break;
		case APPLICATION:
			server = new ApplicationServer();
			server.setAdresaIp(adresaIp);
			server.setPort(port);
			break;
		default:
				throw new UnsupportedOperationException();
		}
		return server; 
	}
}
