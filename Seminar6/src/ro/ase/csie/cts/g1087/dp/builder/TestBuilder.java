package ro.ase.csie.cts.g1087.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
//		//1. construiesti obiectul 
//		SuperErou superErou = new SuperErou();
//		//2. initializarea atributelor. aceasta este marea problema pt multe buguri ex baza de date inconsistenta
//		superErou.nume = "Supername"; //nu este o varianta ok deoarece in viitor programatorii vor uita sa initializeze atributele
//		
//		SuperErou superErou2 = new SuperErou("Batman",100,false,false, new Arma(),new Arma(),null,null);
//		//nu mai permitem crearea de obiecte cu valori implicite, insa problema e ca e greu de modificat si inteles codul
//		
//		//solutia consta in BUILDER, ne uitam pe diagrama uml 

		SuperErou superman = 
				new SuperErou.SuperErouBuilder("Superman", 100)
				.setArmaDreapta(new Arma())
				.setArmaStanga(new Arma())
				.build();
		//aici ne dam seama ca e util ca returnam mereu o referinta deoarece ne permite sa scriem .set repetate
		
		SuperErou joker = 
				new SuperErou.SuperErouBuilder("Joker",200)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.build();
		
		SuperErou joker2 = 
				new SuperErou.SuperErouBuilder("Joker",200)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.build();
	}

}
