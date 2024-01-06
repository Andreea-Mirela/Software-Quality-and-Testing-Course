package ro.ase.csie.g1087.dp.simplefactory;

public abstract class SuperErouAbstract {
	String nume;
	int puncteViata;
	
	public SuperErouAbstract(String nume, int puncteViata) {
		super(); //poate fi sters deoarece compilatorul face oricum apelul pt noi
		this.nume = nume;
		this.puncteViata = puncteViata;
	}



	public abstract void seDeplaseaza();
	
}
