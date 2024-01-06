package ro.ase.csie.cts.dp.cerinta1si3.factorymethod;


public class TestFactoryMethod {
	public static void main(String[] args) {
		//creare Fcatory documente
		AbstractSupaFactory factory = new SupaFactory();
		
		InterfataSupa supa = factory.newSupa(TipSupa.CIUPERCI, "Specialitate de ciuperci", 250);
		supa.afiseazaSpecificatii();
		supa.adaugaIngredientSecret("pui");
	}
}
