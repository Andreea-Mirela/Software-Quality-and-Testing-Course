package ro.ase.csie.cts.dp.builder2;

import ro.ase.csie.cts.dp.builder.module.InterfataDisplay;
import ro.ase.csie.cts.dp.builder.module.InterfataExternalMemory;
import ro.ase.csie.cts.dp.builder.module.InterfataGPS;

public abstract class AbstractSmartDeviceBuilder {
	public abstract void adaugaWiFi();
	public abstract void adaugaGPS(InterfataGPS modulGPS);
	public abstract void adaugaDisplay(InterfataDisplay display);
	public abstract void adaugaSDCard(InterfataExternalMemory cardMemorie);
	public abstract SmartDevice getDispozitiv();
}
