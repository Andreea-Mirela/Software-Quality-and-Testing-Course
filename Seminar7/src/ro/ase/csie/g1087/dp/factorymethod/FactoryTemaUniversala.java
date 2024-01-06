package ro.ase.csie.g1087.dp.factorymethod;

import ro.ase.csie.g1087.dp.simplefactory.CaracterDCComics;
import ro.ase.csie.g1087.dp.simplefactory.CaracterDisney;
import ro.ase.csie.g1087.dp.simplefactory.CaracterMarvel;
import ro.ase.csie.g1087.dp.simplefactory.SuperErouAbstract;
import ro.ase.csie.g1087.dp.simplefactory.TipErou;

public class FactoryTemaUniversala extends FactoryAbstract{

	@Override
	public SuperErouAbstract getSuperErou(TipErou tip, String nume) {
		
		
		SuperErouAbstract superErou = null;
		switch(tip) {
	case DISNEY:
		superErou = new CaracterDisney(nume, 0, false);
		break;//daca uiti de break strici tot factoryul
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
