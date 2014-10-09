package es.upm.miw.ecp2.patrones.NaturalNumber;

public class NaturalNumberEn  extends NaturalNumber{
	
	
    private int value;
    
    private static final String[] textValue = { "zero", "one", "two",
		"three", "four", "five" };

	public NaturalNumberEn(int value) {
		super(value, NaturalNumberEn.textValue);
	}
	
	

}
