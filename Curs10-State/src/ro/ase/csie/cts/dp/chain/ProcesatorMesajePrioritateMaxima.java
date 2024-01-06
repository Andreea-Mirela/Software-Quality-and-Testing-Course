package ro.ase.csie.cts.dp.chain;

public class ProcesatorMesajePrioritateMaxima extends Handler{
	public void gestioneazaCerere(Mesaj mesaj)
	{
		if (mesaj.getPrioritate() > 100){
			System.out.println("\n Mesaj cu prioritate maxima: "+mesaj.getText());
		}
		else{
			if(this.succesor!=null)
				this.succesor.gestioneazaCerere(mesaj);
		}
	}
}