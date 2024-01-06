package ro.ase.csie.cts.dp.cerinta7.decorator;


public class TestDecorator {
public static void main(String[] args) {
		
		AbstractNotaDePlata nota = new NotaDePlata("Burger", 40);
		nota.printeazaNota();
		
		nota = new DecoratorSarbatoriNotaDePlata(nota);
		nota.printeazaNota();
	}
}
