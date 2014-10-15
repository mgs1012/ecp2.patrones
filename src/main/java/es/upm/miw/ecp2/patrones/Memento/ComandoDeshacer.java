package es.upm.miw.ecp2.patrones.Memento;

public class ComandoDeshacer extends Comando {
	
	private GestorMementos<MementoCalculadora> gestorMementos;
	
	private CalculadoraMementable calculadora;

	public ComandoDeshacer(CalculadoraMementable calc, GestorMementos<MementoCalculadora> gm) {
		this.calculadora = calc;
		this.gestorMementos = new GestorMementos<MementoCalculadora>();
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
