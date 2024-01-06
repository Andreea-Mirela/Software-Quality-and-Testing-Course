package stanciu.andreea.mirela.g1087.composite;

public class Utilizator extends NodStructuraIerarhicaUtilizatori{
	String nume;
	String nivelCunostinte;
	
	public Utilizator(String nume, String nivelCunostinte) {
		super();
		this.nume = nume;
		this.nivelCunostinte = nivelCunostinte;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNivelCunostinte() {
		return nivelCunostinte;
	}

	public void setNivelCunostinte(String nivelCunostinte) {
		this.nivelCunostinte = nivelCunostinte;
	}
}
