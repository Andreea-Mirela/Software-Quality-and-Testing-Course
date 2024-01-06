package stanciu.andreea.mirela.g1087.adapter;

public abstract class SimulatorFondInvestitiiAbstract {
	
	protected double soldCurent;
	protected double sumaInvestita;
	protected double randamentTinta;
	
	public SimulatorFondInvestitiiAbstract(double soldCurent, double sumaInvestita, double randament) {
		super();
		this.soldCurent = soldCurent;
		this.sumaInvestita = sumaInvestita;
		this.randamentTinta = randament;
	}

	public double getSoldCurent() {
		return soldCurent;
	}

	public double getSumaTranzactionata() {
		return sumaInvestita;
	}

	public void setRandament(double randament) {
		this.randamentTinta = randament;
	}
	
	public abstract void investeste(double total);
	public abstract void retrage(double total);
}
