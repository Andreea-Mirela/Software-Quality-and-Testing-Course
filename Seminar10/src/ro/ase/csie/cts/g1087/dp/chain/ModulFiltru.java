package ro.ase.csie.cts.g1087.dp.chain;

public class ModulFiltru extends NodChainAbstract{

	//am putea face mai multe filtre, pt limba romana, pt engleza, acronime etc
	public ModulFiltru(String numeModul) {
		super(numeModul);
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		String[] dictionar = new String[] {"rau", "obraznic", "violent"};
		//acum vrem sa vedem daca exista aceste cuvinte in mesaj
		boolean esteValid = true;
		
		for(String cuvant : dictionar) {
			if(mesaj.getContinut().contains(cuvant)) {
				esteValid = false; 
				break;
			}
		}
		
		//daca mesajul este valid il trimitem mai departe in sistem 
		if(esteValid && this.next!= null) {
			this.next.procesareMesajChat(mesaj);//verifica daca exista un modul care asteapta acest eveniment in lant si trimite mai departe evenimentul
			//daca uitam de next facem recursivitate infinita si crapa
		}
	}

}
