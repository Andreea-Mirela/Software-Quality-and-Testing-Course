package ro.ase.csie.cts.testare.tema4.singleton.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.testare.tema4.singleton.modele.Server;

public class TestServer {
	
	Server server1;
	Server server2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		server1 = Server.getServer("127.0.0.1", 3306);
		server2 = Server.getServer("10.0.0.1", 3306);
	}

	@After
	public void tearDown() throws Exception {
		server1 = null;
		server2 = null;
	}

	@Test
	public void testReferintaObiecte() {
			assertEquals("Test referinta catre acelasi obiect", server1, server2);
	}
}

