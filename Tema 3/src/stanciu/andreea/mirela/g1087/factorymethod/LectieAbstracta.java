package stanciu.andreea.mirela.g1087.factorymethod;

public abstract class LectieAbstracta {
	private String titlu;
	private String tema;
	
	public LectieAbstracta(String titlu, String tema) {
		super(); 
		this.titlu = titlu;
		this.tema = tema;
	}
	
	public abstract String getTip();
	public abstract void print(String continut);

	public void setTitlu(String titlu){
		this.titlu = titlu;
	}

	@Override
	public String toString() {
		return "LectieAbstracta [titlu=" + titlu + ", tema=" + tema + "]";
	}
}
