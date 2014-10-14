package es.upm.miw.ecp2.patrones.calculadora;

import upm.jbb.IO;

public class ComandoSumar extends Comando {

	public ComandoSumar(Calculadora calc) {
		this.calculadora = calc;
	}

	public ComandoSumar(CalculadoraMementable calcm) {
		this.calculadora = calcm;
	}

	@Override
	public String name() {
		return "Sumar";
	}

	@Override
	public void execute() {
		int valor = IO.in.readInt();
		;
		this.calculadora.sumar(valor);
	}

}
