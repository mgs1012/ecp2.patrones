package es.upm.miw.ecp2.patrones.Memento;

import es.upm.miw.ecp2.patrones.Memento.CalculadoraMementable;

public class ComandoIniciar extends Comando{

	public ComandoIniciar(Calculadora calc) {
		this.calculadora = calc;
	}

	@Override
	public String name() {
		return "Iniciar";
	}

	@Override
	public void execute() {
		this.calculadora.iniciar();
		
	}

}
