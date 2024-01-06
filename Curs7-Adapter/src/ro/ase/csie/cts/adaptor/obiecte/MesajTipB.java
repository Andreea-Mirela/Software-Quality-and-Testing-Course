package ro.ase.csie.cts.adaptor.obiecte;

public class MesajTipB implements InterfataTipB{

	String[] cuvinte;
	
	public MesajTipB() {
		this.cuvinte = new String("Mesaj default tip B").split(" ");
	}

	@Override
	public String[] getText() {
		return this.cuvinte;
	}

	@Override
	public void setText(String[] cuvinte) {
		cuvinte = new String[cuvinte.length];
		System.arraycopy(cuvinte, 0, cuvinte, 0, cuvinte.length);
	}

	@Override
	public void display() {
		System.out.println("Mesaj:");
		for(int i = 0;i<cuvinte.length;i++)
			System.out.print(cuvinte[i] + "*");
		System.out.print('\n');
	}

}
