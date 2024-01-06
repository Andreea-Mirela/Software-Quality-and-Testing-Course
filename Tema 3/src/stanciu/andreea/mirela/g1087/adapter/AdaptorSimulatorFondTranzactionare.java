package stanciu.andreea.mirela.g1087.adapter;

public class AdaptorSimulatorFondTranzactionare extends SimulatorFondInvestitiiAbstract{
	
	InterfataSimulatorFondTranzactionare simulatorFondInvestitii = null;

	public AdaptorSimulatorFondTranzactionare(InterfataSimulatorFondTranzactionare simulatorFondInvestitii) {
		super(simulatorFondInvestitii.getSoldCont(), simulatorFondInvestitii.getSumaTranzactionata(), simulatorFondInvestitii.getDobanda());
		this.simulatorFondInvestitii = simulatorFondInvestitii;
	}

	@Override
	public void investeste(double total) {
		simulatorFondInvestitii.cumpara(total);
	}

	@Override
	public void retrage(double total) {
		simulatorFondInvestitii.vinde(total);
	}
	
}
