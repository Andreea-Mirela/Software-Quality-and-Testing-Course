package ro.ase.csie.cts.dp.cerinta6.facade;

public class RestaurantFacade {
	public static boolean verificareCamera(int codMasa) {
		MeseLibere libere = new MeseLibere();
		if (libere.verificareMasaLibera(codMasa)) {
			Receptionist receptionist = new Receptionist();
			if (receptionist.esteMasaDebarasata(codMasa) && receptionist.areServeteleNoi(codMasa)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static String verificareDisponibilitateCamera(int codCamera) {
		MeseLibere libere = new MeseLibere();
		if (libere.verificareMasaLibera(codCamera)) {
			Receptionist receptionist = new Receptionist();
			if (receptionist.esteMasaDebarasata(codCamera) && receptionist.areServeteleNoi(codCamera)) {
				return "Camera este gata";
			} else {
				return "Asteptati pana se debaraseaza si se pun servetele noi";
			}
		} else {
			return "Asteptati pana se elibereaza masa";
		}
	}
}
