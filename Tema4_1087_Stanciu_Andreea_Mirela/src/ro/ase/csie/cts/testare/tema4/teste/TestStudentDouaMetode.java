package ro.ase.csie.cts.testare.tema4.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.testare.tema4.clase.InterfataValidariProdus;
import ro.ase.csie.cts.testare.tema4.clase.Produs;
import ro.ase.csie.cts.testare.tema4.exceptii.ExceptieNumeProdusInvalid;
import ro.ase.csie.cts.testare.tema4.exceptii.ExceptiePretProdusInvalid;
import ro.ase.csie.cts.testare.tema4.exceptii.ExceptieProduseVanduteNull;
import ro.ase.csie.cts.testare.tema4.exceptii.ExceptieValoareProduseInvalida;
import ro.ase.csie.cts.testare.tema4.exceptii.ExceptieVanzareInvalida;
import ro.ase.csie.cts.testare.tema4.exceptii.IndexVanzareInexistentException;

public class TestStudentDouaMetode {

	public static final String NUME;
	public static final float PRET = InterfataValidariProdus.PRET_MIN;
	public static final ArrayList<Integer> PRODUSE_VANDUTE = new ArrayList<>();
	public static final int NR_SAPTAMANI = 3;
	public static ArrayList<Integer> produseVanduteSaptamanal = new ArrayList<>();
	Produs produsCorect;
	Produs produsCuArrayModificabil, produsP;

	static {
		String numeInitial = "";
		for (int i = 0; i < InterfataValidariProdus.DIMENSIUNE_MIN_NUME; i++) {
			numeInitial += 'c';
		}
		NUME = numeInitial;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		for (int i = 0; i < NR_SAPTAMANI; i++) {
			PRODUSE_VANDUTE.add(InterfataValidariProdus.PRODUSE_VANDUTE_MAX);
		}

		produseVanduteSaptamanal.add(10);
		produseVanduteSaptamanal.add(20);
		produseVanduteSaptamanal.add(30);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		produsCorect = new Produs(NUME, PRET, PRODUSE_VANDUTE);
		produsCuArrayModificabil = new Produs(NUME, PRET, produseVanduteSaptamanal);
		produsP = new Produs(NUME, PRET);
	}

	@After
	public void tearDown() throws Exception {
	}

	// Cerinta 3
	// 1 test Right pentru fiecare metod
	@Category({CategorieRight.class})
	@Test
	public void testGetProcentSaptamaniSlabeRight() {
		int limita = 15;
		int procentAsteptat = 25;

		ArrayList<Integer> produseVandute = new ArrayList<>();
		produseVandute.add(10);
		produseVandute.add(20);
		produseVandute.add(30);
		produseVandute.add(40);

		Produs produs;
		try {
			produs = new Produs(NUME, PRET, produseVandute);
			int procentCalculat = produs.getProcentSaptamaniSlabe(limita);
			assertEquals("Procentul asteptat nu este egal cu cel calculat!", procentAsteptat, procentCalculat);

		} catch (ExceptieNumeProdusInvalid | ExceptiePretProdusInvalid | ExceptieValoareProduseInvalida
				| ExceptieProduseVanduteNull e) {
			fail("Constructorul cu 3 param a generat erori");
		} catch (ExceptieVanzareInvalida e) {
			fail("Metoda getProcentSaptamaniSlabe() a generat exceptie pentru limita de vanzare negativa");
		}
	}

	@Category({CategorieRight.class})
	@Test
	public void testGetIndexSaptamaniCuVanzariMaximeRight() {
		ArrayList<Integer> arrayListIndecsiAsteptat = new ArrayList<>(Arrays.asList(0, 2, 3));
		ArrayList<Integer> arrayListIndecsiCalculat = new ArrayList<>();

		ArrayList<Integer> produseVandute = new ArrayList<>();
		produseVandute.add(40);
		produseVandute.add(20);
		produseVandute.add(40);
		produseVandute.add(40);
		produseVandute.add(39);

		Produs produs;
		try {
			produs = new Produs(NUME, PRET, produseVandute);
			arrayListIndecsiCalculat = produs.getIndexSaptamaniCuVanzariMaxime();
			assertEquals("ArrayList-ul asteptat de indecsi nu este egal cu cel calculat!", arrayListIndecsiAsteptat,
					arrayListIndecsiCalculat);

		} catch (ExceptieNumeProdusInvalid | ExceptiePretProdusInvalid | ExceptieValoareProduseInvalida
				| ExceptieProduseVanduteNull e) {
			fail("Constructorul cu 3 param a generat erori");
		}
	}

	//1 test de tip Cross-Check;
	@Test
	public void testGetIndexSaptamaniCuVanzariMaximeCrossCheck() throws IndexVanzareInexistentException {
		ArrayList<Integer> arrayListIndecsiCalculat = new ArrayList<>();

		ArrayList<Integer> produseVandute = new ArrayList<>();
		produseVandute.add(40);
		produseVandute.add(20);
		produseVandute.add(40);
		produseVandute.add(40);
		produseVandute.add(39);

		Produs produs;
		try {
			produs = new Produs(NUME, PRET, produseVandute);
			arrayListIndecsiCalculat = produs.getIndexSaptamaniCuVanzariMaxime();
			for(int index : arrayListIndecsiCalculat) {
				if(produs.getNrProduseVandute(index) != getValoareMaximFromArrayList(produseVandute)) {
					fail("Indexul din array nu corespunde unei vanzari maxime");
				}
			}
			assertTrue(true);

		} catch (ExceptieNumeProdusInvalid | ExceptiePretProdusInvalid | ExceptieValoareProduseInvalida
				| ExceptieProduseVanduteNull e) {
			fail("Constructorul cu 3 param a generat erori");
		}
	}
	
	//1 test de tip Inverse Relationship;
	@Test
	public void testGetProcentSaptamaniSlabeInverseRelationShip() {
		int limita = 15;
		int nrValoriPesteLimita = 0;

		ArrayList<Integer> produseVandute = new ArrayList<>();
		produseVandute.add(10);
		produseVandute.add(20);
		produseVandute.add(30);
		produseVandute.add(40);
		
		for(int valoare : produseVandute) {
			if(valoare > limita)
				nrValoriPesteLimita++;
		}
		
		int procentVanzariPesteLimita = (int) (100 * nrValoriPesteLimita / produseVandute.size());

		Produs produs;
		try {
			produs = new Produs(NUME, PRET, produseVandute);
			int procentCalculat = produs.getProcentSaptamaniSlabe(limita);
			assertEquals("Procentul asteptat nu este egal cu cel calculat!", procentVanzariPesteLimita, 100 - procentCalculat);

		} catch (ExceptieNumeProdusInvalid | ExceptiePretProdusInvalid | ExceptieValoareProduseInvalida
				| ExceptieProduseVanduteNull e) {
			fail("Constructorul cu 3 param a generat erori");
		} catch (ExceptieVanzareInvalida e) {
			fail("Metoda getProcentSaptamaniSlabe() a generat exceptie pentru limita de vanzare negativa");
		}
	}
	
	// 2 teste la alegere pentru a verifica alte criterii (altele decat cele de mai
	// sus) pentru oricare dintre cele 2 metode
	@Test(expected = ExceptieVanzareInvalida.class)
	public void testGetProcentSaptamaniSlabeExceptie() throws ExceptieVanzareInvalida {
		int procentCalculat = produsCorect.getProcentSaptamaniSlabe(-10);
	}

	@Test
	public void testGetIndexSaptamaniCuVanzariMaximeVanzariSortateCrescator() throws ExceptieVanzareInvalida {
		ArrayList<Integer> arrayListIndecsiAsteptat = new ArrayList<>(Arrays.asList(3));
		ArrayList<Integer> arrayListIndecsiCalculat = new ArrayList<>();

		ArrayList<Integer> produseVandute = new ArrayList<>();
		produseVandute.add(10);
		produseVandute.add(20);
		produseVandute.add(30);
		produseVandute.add(40);

		Produs produs;
		try {
			produs = new Produs(NUME, PRET, produseVandute);
			arrayListIndecsiCalculat = produs.getIndexSaptamaniCuVanzariMaxime();
			assertEquals("ArrayList-ul asteptat de indecsi nu este egal cu cel calculat!", arrayListIndecsiAsteptat,
					arrayListIndecsiCalculat);
		} catch (ExceptieNumeProdusInvalid | ExceptiePretProdusInvalid | ExceptieValoareProduseInvalida
				| ExceptieProduseVanduteNull e) {
			fail("Constructorul cu 3 param a generat erori");
		}
	}
	
	public int getValoareMaximFromArrayList(ArrayList<Integer> valori) {
		int max = 0;
		for(int valoare : valori) {
			if(valoare > max)
				max = valoare;
		}
		return max;
	}

}
