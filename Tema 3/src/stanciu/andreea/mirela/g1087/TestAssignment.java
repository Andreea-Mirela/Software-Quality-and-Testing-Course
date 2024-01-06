package stanciu.andreea.mirela.g1087;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import stanciu.andreea.mirela.g1087.adapter.AdaptorSimulatorFondTranzactionare;
import stanciu.andreea.mirela.g1087.adapter.SimulatorFondForex;
import stanciu.andreea.mirela.g1087.adapter.SimulatorFondInvestitiiAbstract;
import stanciu.andreea.mirela.g1087.adapter.SimulatorFondMutual;
import stanciu.andreea.mirela.g1087.builder.BuilderAbstractCursant;
import stanciu.andreea.mirela.g1087.builder.BuilderCursant;
import stanciu.andreea.mirela.g1087.builder.ConfiguratorCursant;
import stanciu.andreea.mirela.g1087.builder.Cursant;
import stanciu.andreea.mirela.g1087.builder.module.HobbySah;
import stanciu.andreea.mirela.g1087.builder.module.InvestitieCrypto;
import stanciu.andreea.mirela.g1087.composite.StructuraOrganizatoricaUtilizatori;
import stanciu.andreea.mirela.g1087.composite.Utilizator;
import stanciu.andreea.mirela.g1087.decorator.CursantAbstract;
import stanciu.andreea.mirela.g1087.decorator.CursantD;
import stanciu.andreea.mirela.g1087.decorator.DecoratorCursantBonusMega;
import stanciu.andreea.mirela.g1087.decorator.DecoratorCursantPenalizare;
import stanciu.andreea.mirela.g1087.factorymethod.FactoryAbstract;
import stanciu.andreea.mirela.g1087.factorymethod.FactoryModInvatare1;
import stanciu.andreea.mirela.g1087.factorymethod.FactoryModInvatare2;
import stanciu.andreea.mirela.g1087.factorymethod.LectieAbstracta;
import stanciu.andreea.mirela.g1087.factorymethod.TipLectie;
import stanciu.andreea.mirela.g1087.flyweight.CaracteristiciAfisareEcran;
import stanciu.andreea.mirela.g1087.flyweight.FactoryObiectGrafic;
import stanciu.andreea.mirela.g1087.flyweight.InterfataObiectGrafic;
import stanciu.andreea.mirela.g1087.flyweight.ObiectGrafic;
import stanciu.andreea.mirela.g1087.flyweight.TipObiectGrafic;
import stanciu.andreea.mirela.g1087.prototype.ModelPortofoliuInvestitii;
import stanciu.andreea.mirela.g1087.proxy.InterfataVideoclip;
import stanciu.andreea.mirela.g1087.proxy.ProxyVideoclip;
import stanciu.andreea.mirela.g1087.singleton.ContAdministrator;
import stanciu.andreea.mirela.g1087.singleton.ExceptieCreareAdministrator;
import stanciu.andreea.mirela.g1087.singleton.ModulGestiune;
import stanciu.andreea.mirela.g1087.singleton.ModulProfil;

public class TestAssignment {

	public static void main(String[] args) {

		System.out.println("\nTEST SINGLETON");
		try {
			ContAdministrator administrator1 = ContAdministrator.getAdministrator();
			ContAdministrator administrator2 = ContAdministrator.getAdministrator();

			System.out.println(administrator1);
			System.out.println(administrator2);

			ModulGestiune modulGestiune = new ModulGestiune();
			ModulProfil modulProfil = new ModulProfil();

			ContAdministrator administrator3 = ContAdministrator.getAdministrator("altAdmin@gmail.com", "123456");

		} catch (ExceptieCreareAdministrator e) {
			System.out.println("S-a incercat crearea unui cont de administrator diferit!");
		}

		System.out.println("\nTEST BUILDER");
		Date simpleDateFormat1 = null;
		Date simpleDateFormat2 = null;
		try {
			simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy").parse("03/04/1995");
			simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy").parse("24/08/1999");

		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}

		BuilderCursant builder = new BuilderCursant("Popescu Ion", simpleDateFormat1, "0723648732", false);
		builder.adaugaAdresaContact("popescuion@gmail.com");
		builder.adaugaObiectivFinanciar(new InvestitieCrypto(50));
		builder.adaugaHobby(new HobbySah(5));
		Cursant cursant1 = builder.getCursant();
		System.out.println(cursant1.toString());

		ConfiguratorCursant configurator = new ConfiguratorCursant(
				new BuilderCursant("Ionescu Maria", simpleDateFormat2, "0757727345", true));
		configurator.construieste();
		Cursant cursant2 = configurator.getCursant();
		System.out.println(cursant2.toString());

		System.out.println("\nTEST FACTORY METHOD");
		boolean esteModulDeInvatare1 = true;

		FactoryAbstract factoryLectii = null;

		if (esteModulDeInvatare1) {
			factoryLectii = new FactoryModInvatare1();
		} else {
			factoryLectii = new FactoryModInvatare2();
		}

		LectieAbstracta lectie = factoryLectii.getLectie(TipLectie.TEXT, "Lectie investitii", "Imobiliare");
		System.out.println(lectie.toString());

		System.out.println("\nTEST PROTOTYPE");
		ModelPortofoliuInvestitii portofoliu1 = new ModelPortofoliuInvestitii(20.50);

		try {
			ModelPortofoliuInvestitii portofoliu2 = (ModelPortofoliuInvestitii) portofoliu1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("\nTEST ADAPTER");
		SimulatorFondMutual simulatorFondMutual = new SimulatorFondMutual(100000, 0, 25.00);
		simulatorFondMutual.investeste(1000);
		simulatorFondMutual.retrage(500);

		SimulatorFondForex simulatorFondForex = new SimulatorFondForex();
		simulatorFondForex.setSoldCont(1000);
		simulatorFondForex.setSumaTranzactionata(0);
		simulatorFondForex.cumpara(500);
		simulatorFondForex.vinde(200);

		ArrayList<SimulatorFondInvestitiiAbstract> simulatoare = new ArrayList<>();
		simulatoare.add(simulatorFondMutual);

		AdaptorSimulatorFondTranzactionare adaptorFondForex = new AdaptorSimulatorFondTranzactionare(
				simulatorFondForex);
		simulatoare.add(adaptorFondForex);

		System.out.println("----------------");

		for (SimulatorFondInvestitiiAbstract simulator : simulatoare) {
			simulator.investeste(100);
			simulator.retrage(100);
		}

		System.out.println("\nTEST DECORATOR");
		CursantAbstract cursantA = new CursantD("Popescu Ana", "0765243748", "ana@gmail.com");
		cursantA.sustineExamen();
		cursantA = new DecoratorCursantBonusMega(cursantA);
		cursantA.sustineExamen();
		CursantAbstract cursantB = new CursantD("Ionescu Andrei", "0748523876", "andrei@gmail.com");
		cursantB.sustineExamen();
		cursantB = new DecoratorCursantPenalizare(cursantB, 5);
		cursantB.sustineExamen();

		System.out.println("\nTEST COMPOSITE");
		StructuraOrganizatoricaUtilizatori serieACursanti = new StructuraOrganizatoricaUtilizatori("Seria A",
				"Serie cu mai multe clase");

		StructuraOrganizatoricaUtilizatori clasaAvansati = new StructuraOrganizatoricaUtilizatori("Clasa avansati",
				"Clasa in care sunt incadrati utilizatorii care au terminat cursul, dar aprofundeaza cu profesori care au predat initial la grupe de incepatori");

		clasaAvansati.adaugaNodCopil(new Utilizator("Popescu", "avansat"));
		clasaAvansati.adaugaNodCopil(new Utilizator("Ionescu", "avansat"));

		serieACursanti.adaugaNodCopil(new Utilizator("Ion", "Profesor"));
		serieACursanti.adaugaNodCopil(clasaAvansati);

		System.out.println(serieACursanti.getInformatii());

		System.out.println("\nTEST FLYWEIGHT");
		InterfataObiectGrafic masina1 = (ObiectGrafic) FactoryObiectGrafic.getModel(TipObiectGrafic.MASINA);
		InterfataObiectGrafic masina2 = (ObiectGrafic) FactoryObiectGrafic.getModel(TipObiectGrafic.MASINA);
		InterfataObiectGrafic masina3 = (ObiectGrafic) FactoryObiectGrafic.getModel(TipObiectGrafic.MASINA);

		Random random = new Random();

		masina1.afisareEcran(new CaracteristiciAfisareEcran(random.nextInt(100), random.nextInt(100), "rosu", 50.5));
		masina2.afisareEcran(new CaracteristiciAfisareEcran(random.nextInt(100), random.nextInt(100), "albastru", 70));
		masina3.afisareEcran(new CaracteristiciAfisareEcran(random.nextInt(100), random.nextInt(100), "verde", 20.7));

		System.out.println("\nTEST PROXY");
		final InterfataVideoclip videoclip1 = new ProxyVideoclip("Video1");
		final InterfataVideoclip videoclip2 = new ProxyVideoclip("Video2");

		videoclip1.redareVideoclip();
		videoclip2.redareVideoclip();
		videoclip2.redareVideoclip();
		videoclip1.redareVideoclip();
	}

}
