package stanciu.andreea.mirela.g1087.factorymethod;

public class LectieVideo extends LectieAbstracta{

	String cale; 
	
	public LectieVideo(String titlu, String tema, String cale) {
		super(titlu, tema);
		this.cale = cale;
	}

	@Override
	public String getTip() {
		return "Lectie de tip video";
	}

	@Override
	public void print(String continut) {
		System.out.println("Se va reda continutul video...");
	}

}