package es.upm.miw.ecp2.patrones.Calculadora;

import es.upm.miw.ecp2.patrones.Memento.CalculadoraMementable;
import upm.jbb.IO;

public class ComandoImprimir extends Comando{

	public ComandoImprimir(Calculadora calc) {
		this.calculadora = calc;
	}
	
	public ComandoImprimir(CalculadoraMementable calcm) {
		this.calculadora = calcm;
	}
	

	@Override
	public String name() {
		return "Imprimir";
	}

	@Override
	public void execute() {
		IO.out.println(this.calculadora.getTotal());
		
	}

}
