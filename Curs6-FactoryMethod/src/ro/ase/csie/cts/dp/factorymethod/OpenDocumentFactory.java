package ro.ase.csie.cts.dp.factorymethod;

import ro.ase.csie.cts.dp.factorymethod.documente.DocumentHtmlGeneric;
import ro.ase.csie.cts.dp.factorymethod.documente.DocumentOpenOfficeText;
import ro.ase.csie.cts.dp.factorymethod.documente.InterfataDocument;
import ro.ase.csie.cts.dp.factorymethod.documente.TipDocument;

public class OpenDocumentFactory extends AbstractDocumentFactory{
	@Override
	public InterfataDocument creareDocument(TipDocument tipDocument) {
		//referinta obiect generat
		InterfataDocument document = null;
		
		//verificare tip document solicitat
		switch(tipDocument){
		case TEXT:
			//generare document text specific Open Office
			document = new DocumentOpenOfficeText();
			break;
		case HTML:
			document = new DocumentHtmlGeneric();
			break;
		}
		return document;
	}
}
