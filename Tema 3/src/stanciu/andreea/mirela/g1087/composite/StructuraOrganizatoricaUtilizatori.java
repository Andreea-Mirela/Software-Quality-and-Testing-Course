package stanciu.andreea.mirela.g1087.composite;

import java.util.ArrayList;

public class StructuraOrganizatoricaUtilizatori extends NodStructuraIerarhicaUtilizatori{

	ArrayList<NodStructuraIerarhicaUtilizatori> elementeStructura = new ArrayList();
	String numeStructura;
	String descriere;

	public StructuraOrganizatoricaUtilizatori(String numeStructura, String descriere) {
		this.numeStructura = numeStructura;
		this.descriere = descriere;
	}
	
	@Override
	public String getNume() {
		return this.numeStructura;
	}

	@Override
	public String getNivelCunostinte() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getInformatii() {
		StringBuffer sb = new StringBuffer();
		sb.append(numeStructura + " - " + this.descriere);
		sb.append("\n");

		for (NodStructuraIerarhicaUtilizatori nod : elementeStructura)
			sb.append("\t" + nod.getInformatii());

		return sb.toString();
	}

	@Override
	public void adaugaNodCopil(NodStructuraIerarhicaUtilizatori elementStructura) {
		elementeStructura.add(elementStructura);
	}

	@Override
	public void stergeNodCopil(NodStructuraIerarhicaUtilizatori elementStructura) {
		elementeStructura.remove(elementStructura);
	}

	@Override
	public NodStructuraIerarhicaUtilizatori getNodCopil(int i) {
		return (NodStructuraIerarhicaUtilizatori) elementeStructura.get(i);
	}
}
