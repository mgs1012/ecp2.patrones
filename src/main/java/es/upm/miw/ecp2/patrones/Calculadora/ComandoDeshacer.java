package es.upm.miw.ecp2.patrones.Calculadora;

import es.upm.miw.ecp2.patrones.Calculadora.Calculadora;
import es.upm.miw.ecp2.patrones.Calculadora.Comando;
import es.upm.miw.ecp2.patrones.Calculadora.GestorMementos;

public class ComandoDeshacer extends Comando {

	public ComandoDeshacer(Calculadora calc) {
		this.calculadora = calc;
	}

	@Override
	public String name() {
		return "Deshacer";
	}

	@Override
	public void execute() {
		this.calculadora.deshacer();
	}
	
}
