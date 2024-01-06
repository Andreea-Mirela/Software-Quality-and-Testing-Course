package stanciu.andreea.mirela.g1087.adapter;

public class SimulatorFondForex implements InterfataSimulatorFondTranzactionare {
	
	double soldCont;
	double sumaTranzactionata;
	public static final double dobanda = 15.00;
	
	public double getSoldCont() {
		return soldCont;
	}
	public void setSoldCont(double soldCont) {
		this.soldCont = soldCont;
	}
	public double getSumaTranzactionata() {
		return sumaTranzactionata;
	}
	public void setSumaTranzactionata(double sumaTranzactionata) {
		this.sumaTranzactionata = sumaTranzactionata;
	}
	
	@Override
	public double getDobanda() {
		return dobanda;
	}
	@Override
	public void cumpara(double suma) {
		this.sumaTranzactionata += suma;
		this.soldCont -= suma;
		System.out.println("S-au cumparat valute cu suma de " + suma + ", iar soldul ramas este de " + this.soldCont);
	}
	@Override
	public void vinde(double suma) {
		this.sumaTranzactionata -= suma;
		this.soldCont += suma;
		System.out.println("S-au vandut valute in valoare de " + suma + " lei, iar soldul contului este de " + this.soldCont);
	}
}
