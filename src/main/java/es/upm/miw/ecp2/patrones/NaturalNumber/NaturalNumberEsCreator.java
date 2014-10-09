package es.upm.miw.ecp2.patrones.NaturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {


	@Override
	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberEs(value);
	}

}
