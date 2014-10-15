package es.upm.miw.ecp2.patrones.Memento;

import es.upm.miw.ecp2.patrones.Memento.CalculadoraMementable;
import upm.jbb.IO;

public class ComandoImprimir extends Comando{

	public ComandoImprimir(Calculadora calcm) {
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
