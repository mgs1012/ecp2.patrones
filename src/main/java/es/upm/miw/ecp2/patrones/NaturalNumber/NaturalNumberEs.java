package es.upm.miw.ecp2.patrones.NaturalNumber;

public class NaturalNumberEs extends NaturalNumber {

	private int value;

	private static final String[] textValue = { "cero", "uno", "dos", "tres",
			"cuatro", "cinco" };

	public NaturalNumberEs(int value) {
		super(value, NaturalNumberEs.textValue);
	}


}
