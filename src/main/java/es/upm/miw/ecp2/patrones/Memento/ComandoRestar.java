package es.upm.miw.ecp2.patrones.Memento;

import es.upm.miw.ecp2.patrones.Memento.CalculadoraMementable;
import upm.jbb.IO;

public class ComandoRestar extends Comando {
	
	public ComandoRestar(CalculadoraMementable calcm) {
		this.calculadoram = calcm;
	}


	@Override
	public String name() {
		return "Restar";
	}

	@Override
	public void execute() {
		int valor = IO.in.readInt();
		this.calculadoram.restar(valor );		
	}

}
