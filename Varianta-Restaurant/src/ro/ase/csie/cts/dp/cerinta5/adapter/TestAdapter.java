package ro.ase.csie.cts.dp.cerinta5.adapter;

public class TestAdapter {
	public static void main(String[] args) {

		InterfataPrinterBar printer = new AdaptorPrinter();
		printer.tiparireFacturi("Nota de plata 1");
	}
}
