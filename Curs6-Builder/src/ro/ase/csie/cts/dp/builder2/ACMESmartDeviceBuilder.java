package ro.ase.csie.cts.dp.builder2;

import ro.ase.csie.cts.dp.builder.module.InterfataDisplay;
import ro.ase.csie.cts.dp.builder.module.InterfataExternalMemory;
import ro.ase.csie.cts.dp.builder.module.InterfataGPS;

public class ACMESmartDeviceBuilder extends AbstractSmartDeviceBuilder{
	
	//referinta catre un smart device
	SmartDevice dispozitiv;
	
	//constructor ce solicita atributele obligatorii
	public ACMESmartDeviceBuilder(String model){
		dispozitiv = new SmartDevice();
		
		//producator setat implicit
		dispozitiv.setProducator("ACME");
		dispozitiv.setModel(model);
	}
	
	//metode din interfata abstracta

	@Override
	public void adaugaWiFi() {
		// TODO adaugare reguli proprii de validare a modulului
		dispozitiv.hasWiFi();
	}

	@Override
	public void adaugaGPS(InterfataGPS modulGPS) {
		// TODO adaugare reguli proprii de validare a modulului
		dispozitiv.setModulGPS(modulGPS);
	}

	@Override
	public void adaugaDisplay(InterfataDisplay display) {
		// TODO adaugare reguli proprii de validare a modulului
		dispozitiv.setDisplay(display);
		
	}

	@Override
	public void adaugaSDCard(InterfataExternalMemory memorieExterna) {
		// TODO adaugare reguli proprii de validare a modulului
		dispozitiv.setCardMemorie(memorieExterna);
		
	}
	
	//metoda publica pentru a obtine dispozitivul
	public SmartDevice getDispozitiv(){
		return this.dispozitiv;
	}
}
