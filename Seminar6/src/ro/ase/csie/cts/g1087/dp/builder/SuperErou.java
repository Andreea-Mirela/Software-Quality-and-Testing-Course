package ro.ase.csie.cts.g1087.dp.builder;

public class SuperErou {

	//definim contextul, adica atributele, pt a intelege dc e nev de builder
	private String nume;
	private int puncteViata;
	
	private boolean esteNegativ;
	private boolean esteRanitGrav;
	
	InterfataArma armaStanga;//pt a respecta d din solid folosim interfete, eliminand relatiile has a cu alte clase
	InterfataArma armaDreapta;
	InterfataSuperPutere superPutere;
	InterfataSuperPutere superSuperPutere;
	
	//problemele pe care le rezolva builderul:
	private SuperErou() {
		
	}

	private SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga,
			InterfataArma armaDreapta, InterfataSuperPutere superPutere, InterfataSuperPutere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteNegativ = esteNegativ;
		this.esteRanitGrav = esteRanitGrav;
		this.armaStanga = armaStanga;
		this.armaDreapta = armaDreapta;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	//solutia este limitata la limbajele in care poti construi clasa in clasa
	public static class SuperErouBuilder {
		
		SuperErou supererou; //mai bine punem o referinta decat sa copiem atributele
		
		public SuperErouBuilder(String nume, int puncteViata) {//atributele esentiale
			this.supererou = new SuperErou();//nu e ok pt alii sa construiasca cu const default, dar pt noi da
			this.supererou.nume = nume;
			this.supererou.puncteViata = puncteViata;
		}
		
		public SuperErouBuilder esteNegativ() {
			this.supererou.esteNegativ = true;//evitam situatiile in care setterul trimite false
			return this;
		}
		
		public SuperErouBuilder esteRanit() {
			this.supererou.esteRanitGrav = true;
			return this;
		}
		
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.supererou.armaStanga = arma;
			return this;
		}
		
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.supererou.armaDreapta = arma;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere) {
			this.supererou.superPutere = superPutere;
			return this;
		}
		
		public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere) {
			this.supererou.superSuperPutere = superSuperPutere;
			return this;
		}
		
		public SuperErou build() {
			return this.supererou;
		}
	}
	
}
