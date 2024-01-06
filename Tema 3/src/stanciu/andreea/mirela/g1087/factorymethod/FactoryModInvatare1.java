package stanciu.andreea.mirela.g1087.factorymethod;

public class FactoryModInvatare1 extends FactoryAbstract {

	@Override
	public LectieAbstracta getLectie(TipLectie tip, String titlu, String tema) {
		LectieAbstracta lectieAbstracta = null;
		switch (tip) {
		case TEXT:
			lectieAbstracta = new LectieText(titlu, tema);
			break;
		case AUDIO:
			lectieAbstracta = new LectieAudio(titlu, tema, true);
			break;
		case VIDEO:
			lectieAbstracta = new LectieVideo(titlu, tema, "lectie.mp4");
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return lectieAbstracta;
	}

}
