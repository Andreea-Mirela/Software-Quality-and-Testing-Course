package ro.ase.csie.cts.testare.tema4.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

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

public class TestStudentTreiMetode {
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

	//Cerinta 2
	// 1 test Right pentru fiecare metoda
	@Category({CategorieRight.class})
	@Test
	public void testAdaugaSaptamanaRight() {
		Integer nrProduseVanduteDeAdaugat = 40;
		try {
			produsCuArrayModificabil.adaugaSaptamana(nrProduseVanduteDeAdaugat);
			assertEquals("Adaugarea valorii produselor vandute a esuat. Nu se gaseste valoarea adaugata in ArrayList!",
					(int) nrProduseVanduteDeAdaugat,
					produsCuArrayModificabil.getNrProduseVandute(produseVanduteSaptamanal.size()));
		} catch (ExceptieVanzareInvalida e) {
			fail("Metoda adaugaSaptamana() a generat exceptie de valoare vanzare negativa");
		} catch (IndexVanzareInexistentException e) {
			fail("Metoda getNrProduseVandute() a generat exceptie index");
		}
	}

	@Category({CategorieRight.class})
	@Test
	public void testGetNrProduseVanduteRight() {
		Integer nrProduseVanduteAsteptat = produseVanduteSaptamanal.get(1);
		try {
			assertEquals(
					"Valoarea din array-ul initial cu care am construit produsul este diferita de valoarea din array-ul atribut de la acelasi index",
					(int) nrProduseVanduteAsteptat, produsCuArrayModificabil.getNrProduseVandute(1));
		} catch (IndexVanzareInexistentException e) {
			fail("Metoda getNrProduseVandute() a generat exceptie");
		}
	}

	@Test
	public void testGetNrSaptamaniPesteMedieRight() throws ExceptieVanzareInvalida {
		int limita = 10;
		int nrAsteptat = 2;

		int nrCalculcat = produsCuArrayModificabil.getNrSaptamaniPesteMedie(limita);
		assertEquals("Numarul de produse vandute peste o anumita limita nu este egal cu cel asteptat", nrAsteptat,
				nrCalculcat);
	}

	// 1 test Range pentru a verifica o conditie pentru care functia testata
	// genereaza o exceptie (pentru fiecare metoda);
	@Test(expected = ExceptieVanzareInvalida.class)
	public void testAdaugaSaptamanaRangeExceptie() throws ExceptieVanzareInvalida {
		produsCuArrayModificabil.adaugaSaptamana(InterfataValidariProdus.PRODUSE_VANDUTE_MIN - 1);
	}

	@Test(expected = IndexVanzareInexistentException.class)
	public void testGetNrProduseVanduteRangeExceptie() throws IndexVanzareInexistentException {
		produsCuArrayModificabil.getNrProduseVandute(NR_SAPTAMANI+1);
	}

	@Test(expected = ExceptieVanzareInvalida.class)
	public void testGetNrSaptamaniPesteMedieRangeExceptie() throws ExceptieVanzareInvalida {
		produsCuArrayModificabil.getNrSaptamaniPesteMedie(InterfataValidariProdus.PRODUSE_VANDUTE_MIN - 1);
	}

	// 2 teste pentru verificarea limitelor extreme (Boundary) pentru fiecare
	// metoda;
	@Test
	public void testAdaugaSaptamanaLimitaMinima() {
		Integer nrProduseVanduteDeAdaugat = InterfataValidariProdus.PRODUSE_VANDUTE_MIN;
		try {
			produsCuArrayModificabil.adaugaSaptamana(nrProduseVanduteDeAdaugat);
			assertEquals("Adaugarea valorii produselor vandute a esuat. Nu se gaseste valoarea adaugata in ArrayList!",
					(int) nrProduseVanduteDeAdaugat,
					produsCuArrayModificabil.getNrProduseVandute(produseVanduteSaptamanal.size()));
		} catch (ExceptieVanzareInvalida e) {
			fail("Metoda adaugaSaptamana() a generat exceptie de valoare vanzare negativa");
		} catch (IndexVanzareInexistentException e) {
			fail("Metoda getNrProduseVandute() a generat exceptie index");
		}
	}

	@Test
	public void testAdaugaSaptamanaLimitaMaxima() {
		Integer nrProduseVanduteDeAdaugat = InterfataValidariProdus.PRODUSE_VANDUTE_MAX;
		try {
			produsCuArrayModificabil.adaugaSaptamana(nrProduseVanduteDeAdaugat);
			assertEquals("Adaugarea valorii produselor vandute a esuat. Nu se gaseste valoarea adaugata in ArrayList!",
					(int) nrProduseVanduteDeAdaugat,
					produsCuArrayModificabil.getNrProduseVandute(produseVanduteSaptamanal.size()));
		} catch (ExceptieVanzareInvalida e) {
			fail("Metoda adaugaSaptamana() a generat exceptie de valoare vanzare negativa");
		} catch (IndexVanzareInexistentException e) {
			fail("Metoda getNrProduseVandute() a generat exceptie index");
		}
	}

	@Test
	public void testGetNrProduseVanduteLimitaMinima() {
		Integer nrProduseVanduteAsteptat = produseVanduteSaptamanal.get(0);
		try {
			assertEquals(
					"Valoarea din array-ul initial cu care am construit produsul este diferita de valoarea din array-ul atribut de la acelasi index",
					(int) nrProduseVanduteAsteptat, produsCuArrayModificabil.getNrProduseVandute(0));
		} catch (IndexVanzareInexistentException e) {
			fail("Metoda getNrProduseVandute() a generat exceptie");
		}
	}

	@Test
	public void testGetNrProduseVanduteLimitaMaxima() {
		Integer nrProduseVanduteAsteptat = produseVanduteSaptamanal.get(NR_SAPTAMANI - 1);
		try {
			assertEquals(
					"Valoarea din array-ul initial cu care am construit produsul este diferita de valoarea din array-ul atribut de la acelasi index",
					(int) nrProduseVanduteAsteptat, produsCuArrayModificabil.getNrProduseVandute(NR_SAPTAMANI - 1));
		} catch (IndexVanzareInexistentException e) {
			fail("Metoda getNrProduseVandute() a generat exceptie");
		}
	}

	@Test
	public void testGetNrSaptamaniPesteMedieLimitaMinima() throws ExceptieVanzareInvalida {
		int limita = InterfataValidariProdus.PRODUSE_VANDUTE_MIN;
		int nrAsteptat = 3;

		int nrCalculcat = produsCuArrayModificabil.getNrSaptamaniPesteMedie(limita);
		assertEquals("Numarul de produse vandute peste o anumita limita nu este egal cu cel asteptat", nrAsteptat,
				nrCalculcat);
	}

	@Test
	public void testGetNrSaptamaniPesteMedieLimitaMaxima() throws ExceptieVanzareInvalida {
		int limita = InterfataValidariProdus.PRODUSE_VANDUTE_MAX;
		int nrAsteptat = 0;

		int nrCalculcat = produsCuArrayModificabil.getNrSaptamaniPesteMedie(limita);
		assertEquals("Numarul de produse vandute peste o anumita limita nu este egal cu cel asteptat", nrAsteptat,
				nrCalculcat);
	}

	// 2 teste de Cardinalitate pentru getNrSaptamaniPesteMedie();
	@Test
	public void testGetNrSaptamaniPesteMedieZeroVanzari() throws ExceptieVanzareInvalida {
		int limita = 25;
		int nrAsteptat = 0;

		ArrayList<Integer> produseVandute = new ArrayList<>();
		Produs produs;
		try {
			produs = new Produs(NUME, PRET, produseVandute);
			int nrCalculcat = produs.getNrSaptamaniPesteMedie(limita);
			assertEquals("Numarul de produse vandute peste o anumita limita nu este egal cu cel asteptat", nrAsteptat,
					nrCalculcat);
		} catch (ExceptieNumeProdusInvalid | ExceptiePretProdusInvalid | ExceptieValoareProduseInvalida
				| ExceptieProduseVanduteNull e) {
			fail("Constructorul cu 3 param a generat erori");
		}
	}

	@Test
	public void testGetNrSaptamaniOVanzare() throws ExceptieVanzareInvalida {
		int limita = 25;
		int nrAsteptat = 0;

		int vanzareUnica = InterfataValidariProdus.PRODUSE_VANDUTE_MIN;
		ArrayList<Integer> produseVandute = new ArrayList<>();
		produseVandute.add(vanzareUnica);
		Produs produs;
		try {
			produs = new Produs(NUME, PRET, produseVandute);
			int nrCalculcat = produs.getNrSaptamaniPesteMedie(limita);
			assertEquals("Numarul de produse vandute peste o anumita limita nu este egal cu cel asteptat", nrAsteptat,
					nrCalculcat);
		} catch (ExceptieNumeProdusInvalid | ExceptiePretProdusInvalid | ExceptieValoareProduseInvalida
				| ExceptieProduseVanduteNull e) {
			fail("Constructorul cu 3 param a generat erori");
		}
	}

	// 2 teste de tip Ordering pentru getNrSaptamaniPesteMedie();
	@Test
	public void testGetNrSaptamaniPesteMedieVanzariSortateCrescator() throws ExceptieVanzareInvalida {
		int limita = 25;
		int nrAsteptat = 2;

		ArrayList<Integer> produseVandute = new ArrayList<>();
		produseVandute.add(10);
		produseVandute.add(20);
		produseVandute.add(30);
		produseVandute.add(40);

		Produs produs;
		try {
			produs = new Produs(NUME, PRET, produseVandute);
			int nrCalculcat = produs.getNrSaptamaniPesteMedie(limita);
			assertEquals("Numarul de produse vandute peste o anumita limita nu este egal cu cel asteptat", nrAsteptat,
					nrCalculcat);
		} catch (ExceptieNumeProdusInvalid | ExceptiePretProdusInvalid | ExceptieValoareProduseInvalida
				| ExceptieProduseVanduteNull e) {
			fail("Constructorul cu 3 param a generat erori");
		}
	}

	@Test
	public void testGetNrSaptamaniPesteMedieVanzariSortateDescrescator() throws ExceptieVanzareInvalida {
		int limita = 85;
		int nrAsteptat = 2;

		ArrayList<Integer> produseVandute = new ArrayList<>();
		produseVandute.add(100);
		produseVandute.add(90);
		produseVandute.add(80);
		produseVandute.add(70);

		Produs produs;
		try {
			produs = new Produs(NUME, PRET, produseVandute);
			int nrCalculcat = produs.getNrSaptamaniPesteMedie(limita);
			assertEquals("Numarul de produse vandute peste o anumita limita nu este egal cu cel asteptat", nrAsteptat,
					nrCalculcat);
		} catch (ExceptieNumeProdusInvalid | ExceptiePretProdusInvalid | ExceptieValoareProduseInvalida
				| ExceptieProduseVanduteNull e) {
			fail("Constructorul cu 3 param a generat erori");
		}
	}

	// numai pentru getNrSaptamaniPesteMedie() un test de performanta / timp care va
	// verifica daca functia returneaza un rezultat sub 3 secunde pentru o lista cu
	// 1000 de saptamani

	@Test
	public void testGetNrSaptamaniPesteMediePerformance()
			throws ExceptieVanzareInvalida, ExceptieProduseVanduteNull, ExceptieValoareProduseInvalida {

		ArrayList<Integer> vanzari = new ArrayList<>();
		int nrSaptamani = 1000;
		for (int i = 0; i < nrSaptamani; i++) {
			vanzari.add(InterfataValidariProdus.PRODUSE_VANDUTE_MAX);
		}
		produsP.setVanzari(vanzari);

		long tStart = System.currentTimeMillis();
		int nrSaptamaniPesteMedie = produsP.getNrSaptamaniPesteMedie(InterfataValidariProdus.PRODUSE_VANDUTE_MIN);
		long tFinal = System.currentTimeMillis();

		long durataMinima = 3000;
		long durata = tFinal - tStart;
		if (durata <= durataMinima) {
			assertTrue(true);
		} else {
			fail("Testul a depasit durata minima");
		}
	}

	// 2 teste la alegere pentru a verifica alte criterii (altele decat cele de mai
	// sus) pentru orice metoda
	
	@Test(expected = ExceptieVanzareInvalida.class)
	public void testAdaugaSaptamanaErrorCondition() throws ExceptieVanzareInvalida {
		produsCuArrayModificabil.adaugaSaptamana(-20);
	}

	@Test(expected = IndexVanzareInexistentException.class)
	public void testGetNrProduseVanduteErrorCondition() throws IndexVanzareInexistentException {
		produsCuArrayModificabil.getNrProduseVandute(-10);
	}
}
