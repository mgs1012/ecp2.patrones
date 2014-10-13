package es.upm.miw.ecp2.patrones.Texto;

public class Caracter extends Componente {
	
	private char caracter;

	public Caracter(char c) {
		this.caracter = c;
	}

	@Override
	public void add(Componente componente) {
		if(componente.esComponenteCompuesto())
			throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public void remove(Componente componente) {
	}

	@Override
	public String dibujar(boolean enMayusculas) {
		if(enMayusculas){
			return ("" + caracter).toUpperCase();
		}
		return ""+caracter;
	}

	@Override
	public boolean esComponenteCompuesto() {
		return false;
	}

}
