package ro.ase.csie.cts.dp.state;

public class StareNormal implements IPrintabil {
	@Override
	public void print(String text) {
		System.out.println("Normal: "+text);
	}
}
