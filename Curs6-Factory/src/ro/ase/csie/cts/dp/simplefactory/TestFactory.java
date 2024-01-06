package ro.ase.csie.cts.dp.simplefactory;

import ro.ase.csie.cts.dp.simplefactory.documente.InterfataDocument;
import ro.ase.csie.cts.dp.simplefactory.documente.TipDocument;

public class TestFactory {
	public static void main(String[] args) {
		//creare Fcatory documente
		DocumentFactory factory = new DocumentFactory();
		
		//creare document text
		InterfataDocument doc1 = DocumentFactory.creareDocument(TipDocument.TEXT, "Factory.txt");
		
		//creare document html
				InterfataDocument doc2 = DocumentFactory.creareDocument(
						TipDocument.HTML, "Factory.html");
				
				System.out.println("Tip document doc1: "+doc1.getTip());
				System.out.println("Tip document doc2: "+doc2.getTip());
	}
}
