package es.upm.miw.ecp2.patrones.Memento;

import es.upm.miw.ecp2.patrones.Memento.CalculadoraMementable;
import upm.jbb.IO;

public class ComandoSumar extends Comando {

	public ComandoSumar(Calculadora calc) {
		this.calculadora = calc;
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
