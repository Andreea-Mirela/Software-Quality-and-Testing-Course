package ro.ase.csie.cts.dp.decorator.pizza;

public class DecoratorPizzaTaraneasca extends DecoratorPizza {
	public DecoratorPizzaTaraneasca(AbstractPizza pizza){
		super(pizza);
	}
	
	@Override
	public String getIngrediente(){
		return super.getIngrediente() + ", porumb";
	}
}