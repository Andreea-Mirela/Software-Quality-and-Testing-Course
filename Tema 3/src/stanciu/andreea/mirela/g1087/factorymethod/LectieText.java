package stanciu.andreea.mirela.g1087.factorymethod;

public class LectieText extends LectieAbstracta {

	public LectieText(String titlu, String tema) {
		super(titlu, tema);
	}

	@Override
	public String getTip() {
		return "Lectie de tip text";
	}

	@Override
	public void print(String continut) {
		System.out.println(continut);
		
	}

}
