package ro.ase.csie.cts.dp.builder1;

import ro.ase.csie.cts.dp.builder.module.InterfataDisplay;
import ro.ase.csie.cts.dp.builder.module.InterfataExternalMemory;
import ro.ase.csie.cts.dp.builder.module.InterfataGPS;

public class DispozitivMobil {

	//atribute
	String model;
	String producator;
	
	boolean areWiFi;
	
	//interfete pentru diferite module
	InterfataGPS modulGPS;
	InterfataDisplay display;
	InterfataExternalMemory cardMemorie;
	
	//constructor default privat
		private DispozitivMobil(){
			
		}

		//interfata publica pentru atribute
		public boolean hasWiFi() {
			return areWiFi;
		}

		public String getModel() {
			return model;
		}

		public String getProducator() {
			return producator;
		}

		public InterfataGPS getModulGPS() {
			return modulGPS;
		}

		public InterfataDisplay getDisplay() {
			return display;
		}

		public InterfataExternalMemory getCardMemorie() {
			return cardMemorie;
		}
		
		
		
		//builder pentru clasa
		public static class DispozitivMobilBuilder {
			
			private DispozitivMobil dispozitiv;
			
			public DispozitivMobilBuilder(String model, String producator){
				this.dispozitiv = new DispozitivMobil();
				this.dispozitiv.model = model;
				this.dispozitiv.producator = producator;
			}
			
			//metoda pentru adaugare WiFi
					public DispozitivMobilBuilder adaugaWiFi(){
						this.dispozitiv.areWiFi = true;
						return this;
					}
					
					//metoda pentru adaugare display
					public DispozitivMobilBuilder adaugaDisplay(InterfataDisplay display){
						this.dispozitiv.display = display;
						return this;
					}
					
					//metoda pentru adaugare memorie
					public DispozitivMobilBuilder adaugaCardMemorie(InterfataExternalMemory memorie){
						this.dispozitiv.cardMemorie = memorie;
						return this;
					}
					
					//metoda pentru adaugare GPS
					public DispozitivMobilBuilder adaugaModulGPS(InterfataGPS gps){
						this.dispozitiv.modulGPS = gps;
						return this;
					}
					
					//metoda prin care se obtine obiectul creat
					public DispozitivMobil build(){
						return this.dispozitiv;
					}
		}			
}


