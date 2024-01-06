package ro.ase.csie.cts.dp.cerinta6.facade;

import java.util.ArrayList;
import java.util.List;

public class MeseLibere {

private List<Integer> listaMeseLibere;
	
	public MeseLibere()
	{
		listaMeseLibere=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			listaMeseLibere.add(i+1);
	}
	
	public boolean verificareMasaLibera(int codCamera){
		return listaMeseLibere.contains(codCamera);
	}
	
}
