package ro.ase.csie.cts.dp.factorymethod;

import ro.ase.csie.cts.dp.factorymethod.documente.DocumentHtmlGeneric;
import ro.ase.csie.cts.dp.factorymethod.documente.DocumentWordText;
import ro.ase.csie.cts.dp.factorymethod.documente.InterfataDocument;
import ro.ase.csie.cts.dp.factorymethod.documente.TipDocument;

public class MSDocumentFactory extends AbstractDocumentFactory{
	@Override
	public InterfataDocument creareDocument(TipDocument tipDocument) {
		//referinta obiect generat
		InterfataDocument document = null;
		
		//verificare tip document solicitat
		switch(tipDocument){
		case TEXT:
			//generare document text de tip Word - specific generatorului
			document = new DocumentWordText();
			break;
		case HTML:
			document = new DocumentHtmlGeneric();
			break;
		}
		return document;
	}
}
