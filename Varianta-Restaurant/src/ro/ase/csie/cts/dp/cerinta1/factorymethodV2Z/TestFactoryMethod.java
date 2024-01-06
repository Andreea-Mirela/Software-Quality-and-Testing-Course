package ro.ase.csie.cts.dp.cerinta1.factorymethodV2Z;


public class TestFactoryMethod {
	public static void main(String[] args) {

		AbstractSupaFactory factory = new FactorySupaLegume();//unde e transparenta fata de utilizator
		
		InterfataSupa supa = factory.creareSupa("specialitate de legume", 500);
		supa.afiseazaSpecificatii();
		supa.adaugaIngredientSecret("mar");
	}
}
