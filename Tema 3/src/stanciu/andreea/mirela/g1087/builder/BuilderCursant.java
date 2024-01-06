package stanciu.andreea.mirela.g1087.builder;

import java.text.SimpleDateFormat;
import java.util.Date;

import stanciu.andreea.mirela.g1087.builder.module.InterfataDomeniuActivitate;
import stanciu.andreea.mirela.g1087.builder.module.InterfataHobby;
import stanciu.andreea.mirela.g1087.builder.module.InterfataObiectivFinanciar;
import stanciu.andreea.mirela.g1087.builder.module.InterfataStudii;

public class BuilderCursant extends BuilderAbstractCursant{
	
	Cursant cursant;

	public BuilderCursant(String nume, Date dataNastere, String telefon, boolean esteGenFeminin) {
		cursant = new Cursant();
		
		cursant.setNume(nume);
		cursant.setDataNastere(dataNastere);
		cursant.setTelefon(telefon);
		cursant.setEsteGenFeminin(esteGenFeminin);
	}

	@Override
	public void adaugaAdresaContact(String adresaContact) {
		cursant.setAdresaContact(adresaContact);
	}

	@Override
	public void adaugaNivel(boolean esteIncepator) {
		cursant.setEsteIncepator(esteIncepator);
		
	}

	@Override
	public void adaugaStudii(InterfataStudii studii) {
		cursant.setStudii(studii);
		
	}

	@Override
	public void adaugaDomeniuActivitate(InterfataDomeniuActivitate domeniuActivitate) {
		cursant.setDomeniuActivitate(domeniuActivitate);
		
	}

	@Override
	public void adaugaHobby(InterfataHobby hobby) {
		cursant.setHobby(hobby);
	}

	@Override
	public void adaugaObiectivFinanciar(InterfataObiectivFinanciar obiectivFinanciar) {
		cursant.setObiectivFinanciar(obiectivFinanciar);
	}

	public Cursant getCursant(){
		return this.cursant;
	}
}
