package ro.ase.csie.g1087.cc.tema2;

public class CalculatorComisionPremium implements InterfataComision {

	private double procentTaxa;

	public CalculatorComisionPremium(double procentTaxa) {
		this.procentTaxa = procentTaxa;
	}

	@Override
	public double calculeazaComisionTotal(ContCredit[] conturi) {
		double comisionTotal = 0.0;
		for (ContCredit cont : conturi) {
			if (cont.getTipCont() == Account.PREMIUM || cont.getTipCont() == Account.SUPER_PREMIUM)
				comisionTotal += calculeazaTaxaBroker(cont.getImprumut().calculeazaDobandaPrincipala());
		}
		return comisionTotal;
	}

	public double calculeazaTaxaBroker(double dobandaPrincipala) {
		return this.procentTaxa * dobandaPrincipala;
	}

}
