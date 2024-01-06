package ro.ase.csie.cts.dp.builder2;

import ro.ase.csie.cts.dp.builder.module.GPSIntern;

public class TestBuilder {

	public static void main(String[] args) {
		//test builder v2
				ACMESmartDeviceBuilder builder = new ACMESmartDeviceBuilder("X");
				builder.adaugaWiFi();
				builder.adaugaGPS(new GPSIntern());
				SmartDevice smart1 = builder.getDispozitiv();
				
				//folosind catalogul
				ConfiguratorDispozitiv configurator = 
						new ConfiguratorDispozitiv(new ACMESmartDeviceBuilder("X"));
				configurator.construieste();
				SmartDevice smart2 = configurator.getDispozitiv();
	}

}
