package ro.ase.csie.g1087.dp.factorymethod;

import ro.ase.csie.g1087.dp.simplefactory.FactorySuperErou;
import ro.ase.csie.g1087.dp.simplefactory.SuperErouAbstract;
import ro.ase.csie.g1087.dp.simplefactory.TipErou;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		boolean esteTemaFantasy = true;
		
		FactoryAbstract factoryCaractere = null;
		
		if(esteTemaFantasy) {
			factoryCaractere = new FactoryTemaFantasy();
		} else {
			factoryCaractere = new FactoryTemaUniversala();
		}

		SuperErouAbstract superCaracter = FactorySuperErou.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
		superCaracter = FactorySuperErou.getSuperErou(TipErou.MARVEL, "Spiderman");
		superCaracter = FactorySuperErou.getSuperErou(TipErou.DC, "Batman");
	}

}
