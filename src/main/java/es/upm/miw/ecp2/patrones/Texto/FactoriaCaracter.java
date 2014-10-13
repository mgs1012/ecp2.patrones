package es.upm.miw.ecp2.patrones.Texto;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	
	private static FactoriaCaracter factory =null;
	
	private Map<Character, Caracter> caracteres;
	
	public FactoriaCaracter(){
		this.caracteres = new HashMap<>();
	}

	public static FactoriaCaracter getFactoria() {
		if(FactoriaCaracter.factory==null)
			FactoriaCaracter.factory =  new FactoriaCaracter();
		return FactoriaCaracter.factory;
	}

	public Caracter get(char c) {
		if(!this.caracteres.containsKey(c)){
			this.caracteres.put(c, new Caracter(c));
		}
		return caracteres.get(c);
	}
	
	
	 

}
