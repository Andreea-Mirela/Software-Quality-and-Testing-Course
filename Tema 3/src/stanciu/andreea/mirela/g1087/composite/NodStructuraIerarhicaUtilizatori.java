package stanciu.andreea.mirela.g1087.composite;

public abstract class NodStructuraIerarhicaUtilizatori {
		public abstract String getNume();
		public abstract String getNivelCunostinte();

		public String getInformatii() {
			return this.getNume() + " - " + this.getNivelCunostinte();
		}

		public void adaugaNodCopil(NodStructuraIerarhicaUtilizatori elementStructura) {
			throw new UnsupportedOperationException();
		}

		public void stergeNodCopil(NodStructuraIerarhicaUtilizatori elementStructura) {
			throw new UnsupportedOperationException();
		}

		public NodStructuraIerarhicaUtilizatori getNodCopil(int i) {
			throw new UnsupportedOperationException();
		}
}
