package ro.ase.csie.cts.testare.tema4;

public interface InterfataServer {

	public String getAdresaIp();

	public int getPort();

	public int getNrMaximConexiuni();

	public boolean conectare();

	public boolean deconectare();
}
