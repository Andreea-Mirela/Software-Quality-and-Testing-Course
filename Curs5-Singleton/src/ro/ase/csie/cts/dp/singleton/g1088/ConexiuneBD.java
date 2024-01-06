package ro.ase.csie.cts.dp.singleton.g1088;

public class ConexiuneBD {
	
	String ip;
	String denumire;
	
	private static ConexiuneBD conexiune = null;

	private ConexiuneBD() {
		super();
	}

	private ConexiuneBD(String ip, String denumire) {
		System.out.println("Apel constructor");
		this.ip = ip;
		this.denumire = denumire;
	}
	
	//versiune lazy 
	public static synchronized ConexiuneBD getConexiune() {
		if(conexiune == null) {
			//datele se pot prelua din fisiere de configurare
			conexiune = new ConexiuneBD("10.0.0.1", "cts");
		}
		return conexiune;
	}
	

}
