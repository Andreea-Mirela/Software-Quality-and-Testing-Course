package stanciu.andreea.mirela.g1087.factorymethod;

public class FactoryModInvatare2 extends FactoryAbstract {

	@Override
	public LectieAbstracta getLectie(TipLectie tip, String titlu, String tema) {
		LectieAbstracta lectieAbstracta = null;
		switch (tip) {
		case TEXT:
			lectieAbstracta = new LectieTextImagini(titlu, tema, new String[] {"investitie.jpg", "financiar.jpg"});
			break;
		case AUDIO:
			lectieAbstracta = new LectieAudio(titlu, tema, false);
			break;
		case VIDEO:
			lectieAbstracta = new LectieVideo(titlu, tema, "crypto.mp4");
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return lectieAbstracta;
	}

}
