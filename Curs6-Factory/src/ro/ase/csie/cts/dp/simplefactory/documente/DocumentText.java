package ro.ase.csie.cts.dp.simplefactory.documente;

public class DocumentText extends InterfataDocument {

	@Override
	public String getTip() {
		return "Text";
	}

	@Override
	public void print(String text) {
		System.out.println("Text: " + text);
	}

}
