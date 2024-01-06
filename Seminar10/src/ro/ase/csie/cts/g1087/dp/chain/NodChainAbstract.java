package ro.ase.csie.cts.g1087.dp.chain;

public abstract class NodChainAbstract {
	
	NodChainAbstract next = null;

	String numeModul;//sa stim ce module au procesat mesajul respectiv
	
	public NodChainAbstract(String numeModul) {
		super();
		this.numeModul = numeModul;
	}

	//chainul se poate modifica dinamic asa ca trb sa ni se permita sa modificam urmatorul nod
	public void setNext(NodChainAbstract next) {
		this.next = next;
	}
	
	public abstract void procesareMesajChat(MesajChat mesaj);
}
