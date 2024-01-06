package ro.ase.csie.cts.dp.decorator.buton;

public abstract class DecoratorAbstractControlVizual extends AbstractControlVizual {
	protected AbstractControlVizual controlVizual;

	public DecoratorAbstractControlVizual(AbstractControlVizual controlVizual) {
		super();
		this.controlVizual = controlVizual;
	}

	@Override
	public void click() {
		this.controlVizual.click();
	};
}
