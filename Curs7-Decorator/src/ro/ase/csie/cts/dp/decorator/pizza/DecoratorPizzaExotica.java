package ro.ase.csie.cts.dp.decorator.pizza;

public class DecoratorPizzaExotica extends DecoratorPizza {
	public DecoratorPizzaExotica(AbstractPizza pizza){
		super(pizza);
	}
	
	@Override
	public String getIngrediente(){
		return super.getIngrediente() + ", ananas";
	}

}
