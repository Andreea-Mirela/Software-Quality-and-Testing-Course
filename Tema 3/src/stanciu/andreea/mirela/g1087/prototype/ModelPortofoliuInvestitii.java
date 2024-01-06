package stanciu.andreea.mirela.g1087.prototype;

import java.util.ArrayList;

public class ModelPortofoliuInvestitii {

	double randamentTinta;

	ArrayList<InstrumentFinanciar> instrumente = new ArrayList<>();
	ArrayList<StrategieInvestitie> strategii = new ArrayList<>();

	public ModelPortofoliuInvestitii(double randamentTinta) {
		this.randamentTinta = randamentTinta;

		System.out.println("Incarcare model portofoliu de investitii din fisier .....");
		try {
			Thread.sleep(1000);

			this.instrumente.add(new InstrumentFinanciar("Actiuni"));
			this.instrumente.add(new InstrumentFinanciar("Obligatiuni"));
			this.instrumente.add(new InstrumentFinanciar("Titluri de stat"));
			this.instrumente.add(new InstrumentFinanciar("Depozite bancare"));
			this.instrumente.add(new InstrumentFinanciar("CFD"));
			this.instrumente.add(new InstrumentFinanciar("Forex"));

			this.strategii.add(new StrategieInvestitie("Analiza tehnica"));
			this.strategii.add(new StrategieInvestitie("Obiectivul de discount"));
			this.strategii.add(new StrategieInvestitie("Obiectivul VAN"));
			this.strategii.add(new StrategieInvestitie("mANAGEMENTUL RISCULUI"));

			System.out.println("Model portofoliu de investitii cu randament tinta de " + randamentTinta + " generat");
		} catch (InterruptedException e) {
		}
	}

	private ModelPortofoliuInvestitii() {
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		ModelPortofoliuInvestitii copie = new ModelPortofoliuInvestitii();
		copie.randamentTinta = this.randamentTinta;
		copie.instrumente = (ArrayList<InstrumentFinanciar>) this.instrumente.clone();
		copie.instrumente = (ArrayList<InstrumentFinanciar>) this.instrumente.clone();
		return copie;
	}
}
