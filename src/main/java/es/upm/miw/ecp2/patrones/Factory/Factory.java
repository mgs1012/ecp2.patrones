package es.upm.miw.ecp2.patrones.Factory;

import java.util.HashMap;
import java.util.Map;

public class Factory {
	
	private static Factory factory = new Factory();

	private Map<String, Integer> references;

	private int reference;

	public Factory() {
		this.references = new HashMap<>();
		this.reference = 0;
	}
	
	public static Factory getFactory(){
		return Factory.factory;
	}

	public int getReference(String key) {
		Integer result = this.references.get(key);
		if (result == null) {
			this.references.put(key, this.reference);
			result = this.reference;
			reference++;
		}
		return result;
	}

	public void removeReference(String key) {
		this.references.remove(key);
	}

}
