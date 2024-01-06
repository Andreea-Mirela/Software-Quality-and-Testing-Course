package stanciu.andreea.mirela.g1087.flyweight;

import java.util.HashMap;

public class FactoryObiectGrafic {
	private static HashMap<TipObiectGrafic, InterfataObiectGrafic> obiecteGrafice = new HashMap<>();


	public static InterfataObiectGrafic getModel(TipObiectGrafic tip) {
		InterfataObiectGrafic obiect = obiecteGrafice.get(tip);

		if (obiect == null) {
			switch (tip) {
			case MASINA:
				obiect = new ObiectGrafic("masina.img", "Masina");
				break;
			case CASA:
				obiect = new ObiectGrafic("casa.img", "Casa");
				break;
			case TEREN:
				obiect = new ObiectGrafic("teren.img", "Teren");
				break;
			default:
				throw new UnsupportedOperationException();
			}

			obiecteGrafice.put(tip, obiect);
		}

		return obiect;
	}
}
