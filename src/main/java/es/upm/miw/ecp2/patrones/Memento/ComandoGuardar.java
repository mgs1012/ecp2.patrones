package es.upm.miw.ecp2.patrones.Memento;

import es.upm.miw.ecp2.patrones.Calculadora.Comando;
import es.upm.miw.ecp2.patrones.Calculadora.GestorMementos;
import upm.jbb.IO;

public class ComandoGuardar extends Comando {
	
	private GestorMementos<MementoCalculadora> gestorMementos;

	@Override
	public String name() {
		return "Guardar";
	}

	@Override
	public void execute() {
		this.gm.addMemento(IO.in.readString("Nombre memento"), this.calculadora.guardar());
	}

}
