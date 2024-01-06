package stanciu.andreea.mirela.g1087.flyweight;

import java.util.ArrayList;

public class ObiectGrafic implements InterfataObiectGrafic {

	String sursa;
	String denumire; 
	ArrayList<Integer> puncte;
	
	public ObiectGrafic(String sursa, String denumire) {
		super();
		this.sursa = sursa;
		this.denumire = denumire;
		System.out.println("Generare obiect grafic " + denumire);
	}

	@Override
	public void incarcaObiectGrafic() {
		System.out.println(String.format("Incarcare obiect grafic %s din sursa %s", denumire, sursa));
		for(int i=0; i<10;i++)
			puncte.add(i);
	}

	@Override
	public void afisareEcran(CaracteristiciAfisareEcran caracteristici) {
		System.out.println(
				String.format("Afisare %s la %d, %d cu culoare %s, de dimensiunea %s", 
						denumire, caracteristici.getCoordonataX(), caracteristici.getCoordonataY(),
						caracteristici.getCuloare(), caracteristici.getDimensiune()));
	}

}
