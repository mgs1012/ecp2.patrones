package es.upm.miw.ecp2.patrones.Calculadora;


public class ComandoDeshacer extends Comando {

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
