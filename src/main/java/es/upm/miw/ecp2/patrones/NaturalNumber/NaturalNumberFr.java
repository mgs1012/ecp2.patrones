package es.upm.miw.ecp2.patrones.NaturalNumber;

public class NaturalNumberFr extends NaturalNumber {
	
    private int value;

	private static final String[] textValue = { "zéro", "un", "deux",
			"trois", "quatre", "cinq" };

	public NaturalNumberFr(int value) {
		super(value, NaturalNumberFr.textValue);
	}

}
