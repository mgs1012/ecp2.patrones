package es.upm.miw.ecp2.patrones.Calculadora;

import es.upm.miw.ecp2.patrones.Memento.CalculadoraMementable;
import es.upm.miw.ecp2.patrones.Memento.MementoCalculadora;

public abstract class Comando implements ComandoI {

	protected Calculadora calculadora;
	
	protected CalculadoraMementable calculadoram;
	
	protected GestorMementos<MementoCalculadora>  gm;

}
