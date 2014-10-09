package es.upm.miw.ecp2.patrones.NaturalNumber;

public class NaturalNumberManager {
	
	private NaturalNumber naturalNumber;
	
	private NaturalNumberCreator creator;
	
	public void createNaturalNumber(int value){
		this.naturalNumber = this.creator.createNaturalNumber(value);
	}
	
	public void setCreator(NaturalNumberCreator creator){
		 this.creator = creator;
	}
	
	public NaturalNumber getNaturalNumber(){
		return naturalNumber;
	}

}
