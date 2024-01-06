package ro.ase.csie.cts.dp.cerinta5.adapter;

public class AdaptorPrinter extends PrinterBucatarie implements InterfataPrinterBar{

	@Override
	public void tiparireFacturi(String nota) {
		this.printareFacturi(nota);
	}

}
