package stanciu.andreea.mirela.g1087.builder;

import stanciu.andreea.mirela.g1087.builder.module.InvestitieCrypto;
import stanciu.andreea.mirela.g1087.builder.module.StudiiLiceale;

public class ConfiguratorCursant {
	BuilderAbstractCursant builder;

	public ConfiguratorCursant(BuilderAbstractCursant builder) {
		super();
		this.builder = builder;
	}
	
	public Cursant getCursant(){
		return this.builder.getCursant();
	}
	
	public void construieste(){
		this.builder.adaugaNivel(true);
		this.builder.adaugaStudii(new StudiiLiceale(8));
		this.builder.adaugaObiectivFinanciar(new InvestitieCrypto(20));
		
	}
}
