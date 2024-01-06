package ro.ase.csie.cts.dp.chain;

public class Mesaj {
	private int prioritate;
	private String text;

	public Mesaj(String Text, int Prioritate){
		text = Text;
		prioritate = Prioritate;
	}

	public int getPrioritate(){
		return prioritate;
	}

	public String getText(){
		return text;
	}
}
