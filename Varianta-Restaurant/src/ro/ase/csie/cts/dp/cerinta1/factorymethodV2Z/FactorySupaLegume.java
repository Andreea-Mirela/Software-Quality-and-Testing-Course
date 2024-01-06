package ro.ase.csie.cts.dp.cerinta1.factorymethodV2Z;

public class FactorySupaLegume extends AbstractSupaFactory{

	@Override
	protected InterfataSupa creareSupa(String descriere, int cantitate) {
		InterfataSupa supa = new SupaLegume();
		supa.setDescriere(descriere);
		supa.setCantitate(cantitate);
		return supa;
	}

}
