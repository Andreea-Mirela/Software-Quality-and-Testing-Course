package ro.ase.csie.cts.g1087.dp.chain;

public class ModulChatPrivat extends NodChainAbstract{

	public static final String NUME_MODUL = "Modul Chat Privat";
	
	public ModulChatPrivat() {
		super(NUME_MODUL);
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		// verificam destinatia
		//daca destinatia e un player, sau at everyone
		if(mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("@Everyone")) {//nu e rolul nostru, il trimitem mai departe
			if(this.next != null) {
				this.next.procesareMesajChat(mesaj);
			} 
		}
		else {
			//procesare mesaj privat
			System.out.println(String.format("Mesaj privat pentru %s = %s ", 
					mesaj.getDestinatie(), mesaj.getContinut()));
		}
	}

}
