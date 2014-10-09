package es.upm.miw.ecp2.patrones.NaturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberFr(value);
	}

}
