package ro.ase.csie.cts.dp.factorymethod.documente;

public class DocumentWordText extends InterfataDocument{
	@Override
	public String getTip() {
		return "Document MSWord de tip text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}
}
