package ro.ase.csie.cts.dp.cerinta8.composite;

public class TestComposite {
	public static void main(String[] args) {

		// definire structura organizatorica
		SectiuneMeniu meniuMicDejun = new SectiuneMeniu("Mic Dejun");

		// definire nod composite
		SectiuneMeniu meniuVara = new SectiuneMeniu("Meniu Vara");

		// adaugare angajati in echipa
		meniuMicDejun.adaugaNodCopil(new ItemMeniu("Ompleta", 12));
		meniuMicDejun.adaugaNodCopil(new ItemMeniu("Ceai", 5));

		// adaugare noduri copil
		meniuVara.adaugaNodCopil(new ItemMeniu("Suc de portocale", 8));
		meniuVara.adaugaNodCopil(meniuMicDejun);

		// afisare structura
		System.out.println(meniuVara.getInfo());

	}
}
