package ro.ase.csie.g1087.cc.tema2;

public class Broker {
	ContCredit[] conturi;
	InterfataComision interfataComision;

	public Broker(ContCredit[] conturi, InterfataComision interfataComision) {
		this.conturi = conturi;
		this.interfataComision = interfataComision;
	}

	public double getComision() {
		return this.interfataComision.calculeazaComisionTotal(conturi);
	}
}
