package ro.ase.csie.cts.dp.cerinta1si3.factorymethod;

public abstract class AbstractSupaFactory {
	protected abstract InterfataSupa creareSupa(TipSupa tipSupa);

	public InterfataSupa newSupa(TipSupa tipSupa, String descriere, int cantitate) {
		InterfataSupa supa = creareSupa(tipSupa);

		if (supa != null) {
			supa.setDescriere(descriere);
			supa.setCantitate(cantitate);
		}

		return supa;
	}
}
