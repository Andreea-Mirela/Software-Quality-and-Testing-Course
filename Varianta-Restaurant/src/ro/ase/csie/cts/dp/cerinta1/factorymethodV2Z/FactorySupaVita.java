package ro.ase.csie.cts.dp.cerinta1.factorymethodV2Z;

public class FactorySupaVita extends AbstractSupaFactory{

	@Override
	protected InterfataSupa creareSupa(String descriere, int cantitate) {
		InterfataSupa supa = new SupaCiuperci();
		supa.setDescriere(descriere);
		supa.setCantitate(cantitate);
		return supa;
	}

}
