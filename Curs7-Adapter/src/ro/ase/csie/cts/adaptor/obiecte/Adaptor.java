package ro.ase.csie.cts.adaptor.obiecte;

public class Adaptor implements InterfataTipB {
	
	InterfataTipA tipA;

	public Adaptor(InterfataTipA tipA) {
		super();
		this.tipA = tipA;
	}

	@Override
	public String[] getText() {
		return tipA.getText().split(" ");
	}

	@Override
	public void setText(String[] cuvinte) {
		StringBuilder builder = new StringBuilder();
		for(String s : cuvinte) {
		    builder.append(s+" ");
		}
		tipA.setText(builder.toString());
	}

	@Override
	public void display() {
		tipA.afisare();
	}
	
	
}
