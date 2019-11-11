package es2.coda;

public class EccezioneStrutturaVuota extends RuntimeException {

	public EccezioneStrutturaVuota(String messaggioErrore) {
		super(messaggioErrore);
	}

	public EccezioneStrutturaVuota() {
	}
}
