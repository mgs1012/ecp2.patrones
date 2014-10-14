package es.upm.miw.ecp2.patrones.calculadora;

public class ComandoDeshacer extends Comando {
	
	private GestorMementos<MementoCalculadora> gestorMementos;


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
