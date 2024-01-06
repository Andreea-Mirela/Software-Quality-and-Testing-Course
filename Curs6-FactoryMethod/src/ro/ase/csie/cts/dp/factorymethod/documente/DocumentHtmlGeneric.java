package ro.ase.csie.cts.dp.factorymethod.documente;

public class DocumentHtmlGeneric extends InterfataDocument {

	@Override
	public String getTip() {
		return "Document HTML";
	}

	@Override
	public void print(String text) {
		System.out.println("<p>"+text+"</p>");
	}
}
