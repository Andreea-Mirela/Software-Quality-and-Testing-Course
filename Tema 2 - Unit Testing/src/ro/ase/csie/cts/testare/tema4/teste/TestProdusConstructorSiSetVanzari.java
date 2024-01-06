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
import ro.ase.csie.cts.testare.tema4.exceptii.IndexVanzareInexistentException;
import ro.ase.csie.cts.testare.tema4.exceptii.ExceptieVanzareInvalida;

public class TestProdusConstructorSiSetVanzari {

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

	// Cerinta 1
	// cel putin 1 test Right / Conformance pentru fiecare constructor
	@Category({CategorieRight.class})
	@Test
	public void testConstructorDoiParametriRightInitializareAtribute() {
		Produs produs;
		try {
			produs = new Produs(NUME, PRET);
			assertEquals("Numele nu este initializat corect", NUME, produs.getName());
			assertEquals("Pretul nu este initializat corect", PRET, produs.getPret(), 0);
		} catch (ExceptieNumeProdusInvalid | ExceptiePretProdusInvalid e) {
			fail("Constructorul cu doi parametri a generat exceptie de validitate a parametrilor");
		}
	}

	@Category({CategorieRight.class})
	@Test
	public void testConstructorTreiParametriRightInitializareAtribute() {
		Produs produs;
		try {
			produs = new Produs(NUME, PRET, PRODUSE_VANDUTE);
			assertEquals("Numele nu este initializat corect", NUME, produs.getName());
			assertEquals("Pretul nu este initializat corect", PRET, produs.getPret(), 0);
			for (int i = 0; i < PRODUSE_VANDUTE.size(); i++) {
				assertEquals("Valoarea nu este initializata corect", (int) PRODUSE_VANDUTE.get(i),
						produs.getNrProduseVandute(i));
			}
		} catch (ExceptieNumeProdusInvalid | ExceptiePretProdusInvalid | ExceptieValoareProduseInvalida
				| ExceptieProduseVanduteNull e) {
			fail("Constructorul cu trei parametri a generat exceptie de validitate a parametrilor");
		} catch (IndexVanzareInexistentException e) {
			fail("Metoda getNrProduseVandute() a generat exceptie");
		}
	}

	// cel putin 2 teste Error Condition pentru fiecare constructor
	@Test
	public void testConstructorDoiParametriRightCreareObiect() {
		try {
			Produs produs = new Produs(NUME, PRET);
			assertNotNull(produs);
		} catch (Exception e) {
			fail("Constructorul cu doi parametri a generat exceptie pentru valori ok");
		}
	}

	@Test
	public void testConstructorTreiParametriRightCreareObiect() {
		try {
			Produs produs = new Produs(NUME, PRET, PRODUSE_VANDUTE);
			assertNotNull(produs);
		} catch (Exception e) {
			fail("Constructorul cu trei parametri a generat exceptie pentru valori ok");
		}
	}

	@Test(expected = ExceptieNumeProdusInvalid.class)
	public void testConstructorDoiParametriNumeInvalidExceptie()
			throws ExceptieNumeProdusInvalid, ExceptiePretProdusInvalid {

		String numeGresit = "";
		for (int i = 0; i < InterfataValidariProdus.DIMENSIUNE_MIN_NUME - 1; i++) {
			numeGresit += 'c';
		}
		Produs produs = new Produs(numeGresit, PRET);

	}

	@Test(expected = ExceptiePretProdusInvalid.class)
	public void testConstructorDoiParametriPretInvalidExceptie()
			throws ExceptieNumeProdusInvalid, ExceptiePretProdusInvalid {

		float pretGresit = InterfataValidariProdus.PRET_MIN - 1;
		Produs produs = new Produs(NUME, pretGresit);

	}

	@Test(expected = ExceptieNumeProdusInvalid.class)
	public void testConstructorTreiParametriNumeInvalidExceptie() throws ExceptieNumeProdusInvalid,
			ExceptiePretProdusInvalid, ExceptieValoareProduseInvalida, ExceptieProduseVanduteNull {

		String numeGresit = "";
		for (int i = 0; i < InterfataValidariProdus.DIMENSIUNE_MIN_NUME - 1; i++) {
			numeGresit += 'c';
		}
		Produs produs = new Produs(numeGresit, PRET, PRODUSE_VANDUTE);

	}

	@Test(expected = ExceptiePretProdusInvalid.class)
	public void testConstructorTreiParametriPretInvalidExceptie() throws ExceptieNumeProdusInvalid,
			ExceptiePretProdusInvalid, ExceptieValoareProduseInvalida, ExceptieProduseVanduteNull {

		float pretGresit = InterfataValidariProdus.PRET_MIN - 1;
		Produs produs = new Produs(NUME, pretGresit, PRODUSE_VANDUTE);

	}

	@Test(expected = ExceptieValoareProduseInvalida.class)
	public void testConstructorTreiParametriValoareProduseInvalidaExceptie() throws ExceptieNumeProdusInvalid,
			ExceptiePretProdusInvalid, ExceptieValoareProduseInvalida, ExceptieProduseVanduteNull {

		ArrayList<Integer> produseVanduteGresit = new ArrayList<>();
		produseVanduteGresit.add(InterfataValidariProdus.PRODUSE_VANDUTE_MAX + 1);
		produseVanduteGresit.add(InterfataValidariProdus.PRODUSE_VANDUTE_MIN - 1);
		produseVanduteGresit.add(InterfataValidariProdus.PRODUSE_VANDUTE_MAX + 10);

		Produs produs = new Produs(NUME, PRET, produseVanduteGresit);
	}

	// 1 test Reference pentru constructorul care primeste ArrayList
	@Test
	public void testConstructorCuTreiParametriProduseVanduteReference()
			throws ExceptieProduseVanduteNull, ExceptieValoareProduseInvalida, ExceptieNumeProdusInvalid,
			ExceptiePretProdusInvalid, IndexVanzareInexistentException {
		ArrayList<Integer> produseVandute = new ArrayList<>();

		int vanzariSaptamana1 = 9;
		int vanzariSaptamana2 = 10;

		produseVandute.add(vanzariSaptamana1);
		produseVandute.add(vanzariSaptamana2);

		Produs produs;
		produs = new Produs(NUME, PRET, produseVandute);

		ArrayList<Integer> produseVanduteProdus = new ArrayList<>();
		for (int i = 0; i < produseVandute.size(); i++)
			produseVanduteProdus.add(produs.getNrProduseVandute(i));

		produseVandute.set(0, 50);
		produseVandute.set(1, 70);

		ArrayList<Integer> produseVanduteActualizate = new ArrayList<>();
		for (int i = 0; i < produseVandute.size(); i++)
			produseVanduteActualizate.add(produs.getNrProduseVandute(i));

		assertArrayEquals(produseVanduteProdus.toArray(), produseVanduteActualizate.toArray());

	}

	// 1 test Existence pentru constructorul care primeste ArrayList
	@Test(expected = ExceptieProduseVanduteNull.class)
	public void testConstructorTreiParametriExistanceProduseVanduteNull() throws ExceptieNumeProdusInvalid,
			ExceptiePretProdusInvalid, ExceptieValoareProduseInvalida, ExceptieProduseVanduteNull {
		ArrayList<Integer> produseVanduteNull = null;
		Produs produs = new Produs(NUME, PRET, produseVanduteNull);
	}

	// 1 test Reference pentru setVanzari()
	@Test
	public void testSetVanzariReference() throws ExceptieProduseVanduteNull, ExceptieValoareProduseInvalida,
			ExceptieNumeProdusInvalid, ExceptiePretProdusInvalid, IndexVanzareInexistentException {
		ArrayList<Integer> produseVandute = new ArrayList<>();

		int vanzariSaptamana1 = 9;
		int vanzariSaptamana2 = 10;

		produseVandute.add(vanzariSaptamana1);
		produseVandute.add(vanzariSaptamana2);

		Produs produs;
		produs = new Produs(NUME, PRET);

		produs.setVanzari(produseVandute);

		ArrayList<Integer> produseVanduteProdus = new ArrayList<>();
		for (int i = 0; i < produseVandute.size(); i++)
			produseVanduteProdus.add(produs.getNrProduseVandute(i));

		produseVandute.set(0, 50);
		produseVandute.set(1, 70);

		ArrayList<Integer> produseVanduteActualizate = new ArrayList<>();
		for (int i = 0; i < produseVandute.size(); i++)
			produseVanduteActualizate.add(produs.getNrProduseVandute(i));

		assertArrayEquals(produseVanduteProdus.toArray(), produseVanduteActualizate.toArray());
	}

	// 1 test Existence pentru setVanzari()
	@Test(expected = ExceptieProduseVanduteNull.class)
	public void testSetVanzariExistanceProduseVanduteNull() throws ExceptieNumeProdusInvalid, ExceptiePretProdusInvalid,
			ExceptieValoareProduseInvalida, ExceptieProduseVanduteNull {
		ArrayList<Integer> produseVanduteNull = null;
		Produs produs = new Produs(NUME, PRET);
		produs.setVanzari(produseVanduteNull);
	}
}
