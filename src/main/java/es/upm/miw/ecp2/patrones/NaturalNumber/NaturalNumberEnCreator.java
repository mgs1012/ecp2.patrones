package es.upm.miw.ecp2.patrones.NaturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator {


	@Override
	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberEn(value);
	}

}
