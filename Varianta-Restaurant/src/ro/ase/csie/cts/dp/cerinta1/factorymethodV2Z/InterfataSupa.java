package ro.ase.csie.cts.dp.cerinta1.factorymethodV2Z;

public abstract class InterfataSupa {

	String descriere; 
	int cantitate;
	
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	public void afiseazaSpecificatii() {
		System.out.println(" Supa: " + this.descriere + " de " + this.cantitate + " grame");
	}
	
	public abstract void adaugaIngredientSecret(String ingredient);
}
