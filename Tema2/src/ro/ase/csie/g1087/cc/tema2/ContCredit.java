package ro.ase.csie.g1087.cc.tema2;

public class ContCredit {

	private Account tipCont;
	private Imprumut imprumut;

	public ContCredit(Account tipCont, Imprumut imprumut) {
		this.imprumut = imprumut;
		this.tipCont = tipCont;
	}

	@Override
	public String toString() {
		return "Loan: " + this.imprumut.getValoareImprumut() + "; rate: " + this.imprumut.getRata() + "; days active:"
				+ this.imprumut.getZileActiv() + "; Type: " + this.getTipCont() + ";";
	}

	public void print() {
		System.out.println("This is an account");
	}

	public Account getTipCont() {
		return tipCont;
	}

	public Imprumut getImprumut() {
		return imprumut;
	}
	
	
}
