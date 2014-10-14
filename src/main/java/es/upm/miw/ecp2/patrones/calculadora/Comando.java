package es.upm.miw.ecp2.patrones.calculadora;

public abstract class Comando implements ComandoI {

	protected Calculadora calculadora;
	
	protected CalculadoraMementable calculadoram;
	
	protected GestorMementos<MementoCalculadora>  gm;

}
