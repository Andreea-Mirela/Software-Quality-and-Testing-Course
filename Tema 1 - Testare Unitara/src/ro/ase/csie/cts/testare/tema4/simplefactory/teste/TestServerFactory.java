package ro.ase.csie.cts.testare.tema4.simplefactory.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import ro.ase.csie.cts.testare.tema4.simplefactory.modele.ApplicationServer;
import ro.ase.csie.cts.testare.tema4.simplefactory.modele.GamingServer;
import ro.ase.csie.cts.testare.tema4.simplefactory.modele.ServerAbstract;
import ro.ase.csie.cts.testare.tema4.simplefactory.modele.ServerFactory;
import ro.ase.csie.cts.testare.tema4.simplefactory.modele.TipServer;
import ro.ase.csie.cts.testare.tema4.simplefactory.modele.WebServer;;

public class TestServerFactory {
	
	ServerAbstract server1;
	ServerAbstract server2;
	ServerAbstract server3;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		server1 = ServerFactory.creareServer(TipServer.GAMING, "82.79.187.41", 8886);
		server2 = ServerFactory.creareServer(TipServer.WEB, "78.97.59.98", 8885);
		server3 = ServerFactory.creareServer(TipServer.APPLICATION, "92.80.202.155", 8884);
	}

	@After
	public void tearDown() throws Exception {
		server1 = null;
		server2 = null;
		server3 = null;
	}

	@Test
	public void testGamingServer() {
		assertTrue(server1 instanceof GamingServer);
	}
	
	@Test
	public void testWebServer() {
		assertTrue(server2 instanceof WebServer);
	}
	
	@Test
	public void testApplicationServer() {
		assertTrue(server3 instanceof ApplicationServer);
	}

}
