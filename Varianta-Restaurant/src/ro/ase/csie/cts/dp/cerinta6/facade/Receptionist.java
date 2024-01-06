package ro.ase.csie.cts.dp.cerinta6.facade;

import java.util.ArrayList;
import java.util.List;

public class Receptionist {

	private List<Boolean> listaMeseDisponibile;

	public Receptionist(){
		listaMeseDisponibile=new ArrayList<Boolean>();
		for(int i=0;i<6;i++)
			listaMeseDisponibile.add(true);
		for(int i=6;i<15;i++)
			listaMeseDisponibile.add(false);
	}

	public boolean esteMasaDebarasata(int cod) {
		return listaMeseDisponibile.get(cod);
	}

	public boolean areServeteleNoi(int codCamera) {
		return listaMeseDisponibile.get(codCamera);
	}

}
