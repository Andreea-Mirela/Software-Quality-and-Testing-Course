package ro.ase.csie.cts.dp.builder1;

import ro.ase.csie.cts.dp.builder.module.SDCard;

public class TestBuilder {
	public static void main(String[] args) {
			
			DispozitivMobil smartphone = 
					new DispozitivMobil.DispozitivMobilBuilder("3310", "Nokia")
					.adaugaWiFi()
					.adaugaCardMemorie(new SDCard(64))
					.build();
		}
}
