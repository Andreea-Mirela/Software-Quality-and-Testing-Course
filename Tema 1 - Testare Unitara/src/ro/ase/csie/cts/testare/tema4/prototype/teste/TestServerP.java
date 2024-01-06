package ro.ase.csie.cts.testare.tema4.prototype.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.testare.tema4.prototype.modele.Resursa;
import ro.ase.csie.cts.testare.tema4.prototype.modele.ServerP;

public class TestServerP {
	
	ServerP server;
	Resursa resursa1;
	Resursa resursa2;
	ArrayList<Resursa> resurse = new ArrayList<>();
	ServerP server2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		resursa1 = new Resursa("Web resouce");
		resursa2 = new Resursa("Db service");
		resurse.add(resursa1);
		resurse.add(resursa2);
		server = new ServerP("192.128.1.1", 8080, resurse);
	}

	@After
	public void tearDown() throws Exception {
		server = null;
		server2 = null;
	}

	@Test
	public void testDeepCopyObiecte() {
		server2 = (ServerP) server.clone();
		assertNotSame("Test deep copy server", server2, server);
	}
	
	@Test
	public void testReferintaResurse() {
		server2 = (ServerP) server.clone();
		assertNotSame("Test deep copy server resurse", server2.getResurse(), server.getResurse());
	}

}
