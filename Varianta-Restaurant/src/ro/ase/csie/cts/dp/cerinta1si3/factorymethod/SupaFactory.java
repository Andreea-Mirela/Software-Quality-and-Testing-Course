package ro.ase.csie.cts.dp.cerinta1si3.factorymethod;

public class SupaFactory extends AbstractSupaFactory {

	@Override
	protected InterfataSupa creareSupa(TipSupa tipSupa) {
		
		InterfataSupa supa = null;

		switch (tipSupa) {
		case LEGUME:
			supa = new SupaLegume();
			break;
		case CIUPERCI:
			supa = new SupaCiuperci();
			break;
		case VITA:
			supa = new SupaVita();
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return supa;
	}

}
