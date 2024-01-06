package ro.ase.csie.cts.dp.decorator.buton;

public class DecoratorButonCuAnimatie extends DecoratorAbstractControlVizual {
	public DecoratorButonCuAnimatie(AbstractControlVizual controlVizual) {
		super(controlVizual);
	}

	
	@Override
	public void click() {
		this.controlVizual.click();
		System.out.println("Animatie text buton");
	};
}
