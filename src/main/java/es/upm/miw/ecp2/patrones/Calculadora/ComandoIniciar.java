package es.upm.miw.ecp2.patrones.Calculadora;

import es.upm.miw.ecp2.patrones.Memento.CalculadoraMementable;

public class ComandoIniciar extends Comando{
	
	public ComandoIniciar(Calculadora calc) {
		this.calculadora = calc;
	}
	
	public ComandoIniciar(CalculadoraMementable calcm) {
		this.calculadora = calcm;
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
