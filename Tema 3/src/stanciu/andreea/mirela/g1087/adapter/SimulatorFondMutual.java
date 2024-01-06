package stanciu.andreea.mirela.g1087.adapter;

public class SimulatorFondMutual extends SimulatorFondInvestitiiAbstract{

	public SimulatorFondMutual(double soldCurent, double sumaInvestita, double randament) {
		super(soldCurent, sumaInvestita, randament);
	}

	@Override
	public void investeste(double total) {
		this.sumaInvestita += total;
		this.soldCurent -= total;
		System.out.println("A fost investita suma de de " + total + ", iar soldul curent este acum de " + this.soldCurent );
	}

	@Override
	public void retrage(double total) {
		this.sumaInvestita -= total;
		this.soldCurent += total;
		System.out.println("Au fost retrasi din investitii " + total + " lei, iar soldul curent este de " + this.soldCurent );
	}

}
