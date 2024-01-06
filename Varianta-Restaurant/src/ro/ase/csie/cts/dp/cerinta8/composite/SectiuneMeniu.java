package ro.ase.csie.cts.dp.cerinta8.composite;

import java.util.ArrayList;



public class SectiuneMeniu extends NodMeniuAbstract {
	ArrayList<NodMeniuAbstract> elementeStructura = new ArrayList();
	String numeSectiune;

	public SectiuneMeniu(String numeSectiune) {
		this.numeSectiune = numeSectiune;
	}


	@Override
	public void adaugaNodCopil(NodMeniuAbstract elementStructura) {
		elementeStructura.add(elementStructura);
	}

	@Override
	public void stergeNodCopil(NodMeniuAbstract elementStructura) {
		elementeStructura.remove(elementStructura);
	}

	@Override
	public NodMeniuAbstract getNodCopil(int i) {
		return (NodMeniuAbstract) elementeStructura.get(i);
	}


	@Override
	public String getDenumire() {
		return this.numeSectiune;
	}


	@Override
	public double getPret() {
		float pretSubsectiune = 0;
		for (NodMeniuAbstract nod : this.elementeStructura) {
			pretSubsectiune += nod.getPret();
		}
		return pretSubsectiune;
	}

	@Override
	public String getInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append(numeSectiune);
		sb.append("\n");

		for (NodMeniuAbstract nod : elementeStructura)
			sb.append("\t" + nod.getInfo());

		return sb.toString();

	}
}
