package ro.ase.csie.cts.dp.simplefactory;

import ro.ase.csie.cts.dp.simplefactory.documente.DocumentText;
import ro.ase.csie.cts.dp.simplefactory.documente.InterfataDocument;
import ro.ase.csie.cts.dp.simplefactory.documente.TipDocument;

public class DocumentFactory {
	public static InterfataDocument creareDocument(TipDocument tipDocument, String titlu) {
		
		//referinta obiect generat
		InterfataDocument document = null;
		
		//verificare tip document solicitat 
		switch(tipDocument) {
		case TEXT: 
			document = new DocumentText();
			document.setTitlu(titlu);
			break;
		case HTML:
			document = new DocumentText();
			break;
		default:
				throw new UnsupportedOperationException();
		}
		return document; 
	}
}
