package ro.ase.csie.g1087.dp.simplefactory;

public class FactorySuperErou {
	public static SuperErouAbstract getSuperErou(TipErou tip, String nume) {// nu e obligatoriu sa mai ai alte atrib in
																			// afar de tip, tine de context
		SuperErouAbstract superErou = null;
		switch (tip) {
		case DISNEY:
			superErou = new CaracterDisney(nume, 0, false);
			break;// daca uiti de break strici tot factoryul
		case MARVEL:
			superErou = new CaracterMarvel(nume, 500, 0);
			break;
		case DC:
			superErou = new CaracterDCComics(nume, 500, 100);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return superErou;
	}
}
