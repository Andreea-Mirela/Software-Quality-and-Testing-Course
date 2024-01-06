package ro.ase.csie.cts.dp.cerinta6.facade;

import java.util.ArrayList;
import java.util.List;

public class TestFacade {
	public static void main(String[] args) {
		int codMasa=6;
		
		/*		if(Facade.verificareCamera(codCamera)){
					System.out.println("Camera este pregatita");
				}
				else{
					System.out.println("Va rugam asteptati");
				}*/
				
				System.out.println(RestaurantFacade.verificareDisponibilitateCamera(codMasa));
	}
}
