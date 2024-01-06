package stanciu.andreea.mirela.g1087.decorator;

public class DecoratorCursantPenalizare extends DecoratorAbstractCursant {

	int nivel;
	
	public DecoratorCursantPenalizare(CursantAbstract cursant, int nivel) {
		super(cursant);
		this.nivel = nivel;
	}

	@Override
	public void sustineExamen() {
		System.out.println("Cursantul " + this.cursant.getNume() + " sustine o cerinta in plus la examenul final, cu grad de dificultate " + this.nivel);
	}
}