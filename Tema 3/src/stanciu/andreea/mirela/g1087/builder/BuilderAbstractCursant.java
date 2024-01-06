package stanciu.andreea.mirela.g1087.builder;

import stanciu.andreea.mirela.g1087.builder.module.InterfataDomeniuActivitate;
import stanciu.andreea.mirela.g1087.builder.module.InterfataHobby;
import stanciu.andreea.mirela.g1087.builder.module.InterfataObiectivFinanciar;
import stanciu.andreea.mirela.g1087.builder.module.InterfataStudii;

public abstract class BuilderAbstractCursant {
	public abstract void adaugaAdresaContact(String adresaContact);
	public abstract void adaugaNivel(boolean esteIncepator);
	
	public abstract void adaugaStudii(InterfataStudii studii);
	public abstract void adaugaDomeniuActivitate(InterfataDomeniuActivitate domeniuActivitate);
	public abstract void adaugaHobby(InterfataHobby hobby);
	public abstract void adaugaObiectivFinanciar(InterfataObiectivFinanciar obiectivFinanciar);
	public abstract Cursant getCursant();
}
