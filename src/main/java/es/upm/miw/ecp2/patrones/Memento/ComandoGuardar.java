package es.upm.miw.ecp2.patrones.Memento;

import upm.jbb.IO;

public class ComandoGuardar extends Comando {
	
	private GestorMementos<MementoCalculadora> gestorMementos;

	private CalculadoraMementable calculadora;
	
	public ComandoGuardar(CalculadoraMementable calc, GestorMementos<MementoCalculadora> gm) {
		this.calculadora = calc;
		this.gestorMementos = gm;
	}

	@Override
	public String name() {
		return "Guardar";
	}

	@Override
	public void execute() {
		this.gestorMementos.addMemento(IO.in.readString("Nombre memento"), this.calculadora.guardar());
	}

}
