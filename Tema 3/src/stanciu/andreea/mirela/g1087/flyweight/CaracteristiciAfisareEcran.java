package stanciu.andreea.mirela.g1087.flyweight;

public class CaracteristiciAfisareEcran {
	int coordonataX;
	int coordonataY;
	String culoare;
	double dimensiune;
	
	public CaracteristiciAfisareEcran(int coordonataX, int coordonataY, String culoare, double dimensiune) {
		super();
		this.coordonataX = coordonataX;
		this.coordonataY = coordonataY;
		this.culoare = culoare;
		this.dimensiune = dimensiune;
	}

	public int getCoordonataX() {
		return coordonataX;
	}

	public int getCoordonataY() {
		return coordonataY;
	}

	public String getCuloare() {
		return culoare;
	}

	public double getDimensiune() {
		return dimensiune;
	}
}
