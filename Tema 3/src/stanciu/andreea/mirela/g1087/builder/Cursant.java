package stanciu.andreea.mirela.g1087.builder;

import java.text.SimpleDateFormat;
import java.util.Date;

import stanciu.andreea.mirela.g1087.builder.module.InterfataDomeniuActivitate;
import stanciu.andreea.mirela.g1087.builder.module.InterfataHobby;
import stanciu.andreea.mirela.g1087.builder.module.InterfataObiectivFinanciar;
import stanciu.andreea.mirela.g1087.builder.module.InterfataStudii;

public class Cursant {

	String nume;
	Date dataNastere;
	String telefon;
	String adresaContact;
	boolean esteGenFeminin;
	boolean esteIncepator;
	
	InterfataStudii studii;
	InterfataDomeniuActivitate domeniuActivitate;
	InterfataHobby hobby;
	InterfataObiectivFinanciar obiectivFinanciar;
	
	public Cursant() {
		super();
	}

	public Cursant(String nume, 
			Date dataNastere, 
			String telefon, 
			String adresaContact,
			boolean esteGenFeminin, 
			boolean esteIncepator, 
			InterfataStudii studii,
			InterfataDomeniuActivitate domeniuActivitate, 
			InterfataHobby hobby,
			InterfataObiectivFinanciar obiectivFinanciar) {
		this.nume = nume;
		this.dataNastere = dataNastere;
		this.telefon = telefon;
		this.adresaContact = adresaContact;
		this.esteGenFeminin = esteGenFeminin;
		this.esteIncepator = esteIncepator;
		this.studii = studii;
		this.domeniuActivitate = domeniuActivitate;
		this.hobby = hobby;
		this.obiectivFinanciar = obiectivFinanciar;
	}

	public Cursant(String nume, Date dataNastere, String telefon, boolean esteGenFeminin) {
		super();
		this.nume = nume;
		this.dataNastere = dataNastere;
		this.telefon = telefon;
		this.esteGenFeminin = esteGenFeminin;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Date getDataNastere() {
		return dataNastere;
	}

	public void setDataNastere(Date dataNastere) {
		this.dataNastere = dataNastere;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getAdresaContact() {
		return adresaContact;
	}

	public void setAdresaContact(String adresaContact) {
		this.adresaContact = adresaContact;
	}

	public boolean isEsteGenFeminin() {
		return esteGenFeminin;
	}

	public void setEsteGenFeminin(boolean esteGenFeminin) {
		this.esteGenFeminin = esteGenFeminin;
	}

	public boolean isEsteIncepator() {
		return esteIncepator;
	}

	public void setEsteIncepator(boolean esteIncepator) {
		this.esteIncepator = esteIncepator;
	}

	public InterfataStudii getStudii() {
		return studii;
	}

	public void setStudii(InterfataStudii studii) {
		this.studii = studii;
	}

	public InterfataDomeniuActivitate getDomeniuActivitate() {
		return domeniuActivitate;
	}

	public void setDomeniuActivitate(InterfataDomeniuActivitate domeniuActivitate) {
		this.domeniuActivitate = domeniuActivitate;
	}

	public InterfataHobby getHobby() {
		return hobby;
	}

	public void setHobby(InterfataHobby hobby) {
		this.hobby = hobby;
	}

	public InterfataObiectivFinanciar getObiectivFinanciar() {
		return obiectivFinanciar;
	}

	public void setObiectivFinanciar(InterfataObiectivFinanciar obiectivFinanciar) {
		this.obiectivFinanciar = obiectivFinanciar;
	}

	@Override
	public String toString() {
		return "Cursant [nume=" + nume + ", dataNastere=" + dataNastere + ", telefon=" + telefon + ", adresaContact="
				+ adresaContact + ", esteGenFeminin=" + esteGenFeminin + ", esteIncepator=" + esteIncepator
				+ ", studii=" + studii + ", domeniuActivitate=" + domeniuActivitate + ", hobby=" + hobby
				+ ", obiectivFinanciar=" + obiectivFinanciar + "]";
	} 
}
