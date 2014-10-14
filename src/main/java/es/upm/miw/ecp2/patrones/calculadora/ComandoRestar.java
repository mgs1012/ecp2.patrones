package es.upm.miw.ecp2.patrones.calculadora;

import upm.jbb.IO;

public class ComandoRestar extends Comando {

	private Calculadora calculadora;

	public ComandoRestar(Calculadora calc) {
		this.calculadora = calc;
	}

	@Override
	public String name() {
		return "Restar";
	}

	@Override
	public void execute() {
		int valor = IO.in.readInt();
		this.calculadora.restar(valor );		
	}

}
