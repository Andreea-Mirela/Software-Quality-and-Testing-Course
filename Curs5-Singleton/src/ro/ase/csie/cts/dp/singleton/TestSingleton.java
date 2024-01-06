package ro.ase.csie.cts.dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		ConexiuneBD con1 = ConexiuneBD.getConexiune();
		ConexiuneBD con2 = ConexiuneBD.getConexiune();
		
		if(con1 == con2) {
			System.out.println("Referinte catre acelasi obiect");
		}
	}

}
