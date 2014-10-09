package es.upm.miw.ecp2.patrones.NaturalNumber;

public abstract class NaturalNumber {
	
	private int value;
	
	private String[] textV;
	
	public NaturalNumber(int value, String[] textV) {
		this.setValue(value);
		this.textV = textV;
	}
	
	public int getValue(){
		return  this.value;
	}
	
	public void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}
	
	public void add(int value){
		this.setValue(this.value+value);
	}

	public String getTextValue(){
		if (this.value < textV.length) {
            return textV[this.value];
        } else {
            return "???";
        }
	}
}
