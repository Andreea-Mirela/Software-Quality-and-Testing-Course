package stanciu.andreea.mirela.g1087.proxy;

public class ProxyVideoclip implements InterfataVideoclip{
	private Videoclip videoclip = null;
	private String fisier = null;

	public ProxyVideoclip(final String videoclip) {
		this.fisier = videoclip;
	}
	
	@Override
	public void redareVideoclip() {
		if (ExistaMemorieSuficienta(this.fisier))
			if (videoclip == null)
				videoclip = new Videoclip(fisier);
		videoclip.redareVideoclip();
	}

	boolean ExistaMemorieSuficienta(String fisier) {
		System.out.println("Verificare memorie...");
		return true;
	}

	
}
