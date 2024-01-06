package stanciu.andreea.mirela.g1087.factorymethod;

public class LectieTextImagini extends LectieAbstracta {
	
	String[] src;

	public LectieTextImagini(String titlu, String tema, String[] src) {
		super(titlu, tema);
		this.src = src;
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