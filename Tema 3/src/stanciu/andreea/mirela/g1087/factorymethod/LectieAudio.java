package stanciu.andreea.mirela.g1087.factorymethod;

public class LectieAudio extends LectieAbstracta{

	boolean cuVoceFeminina;
	
	public LectieAudio(String titlu, String tema, boolean voce) {
		super(titlu, tema);
		this.cuVoceFeminina = voce;
	}
	
	@Override
	public String getTip() {
		return "Lectie de tip audio";
	}

	@Override
	public void print(String continut) {
		System.out.println("Se va reda continutul audio...");
	}

}
