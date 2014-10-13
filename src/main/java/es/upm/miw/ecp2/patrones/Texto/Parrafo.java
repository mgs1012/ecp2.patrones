package es.upm.miw.ecp2.patrones.Texto;

public class Parrafo extends CompuestoComponente {

	public Parrafo() {
		super();
	}

	@Override
	public void add(Componente componente) {
		if (!componente.esComponenteCompuesto())
			this.addComponente(componente);
		else
			throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public void remove(Componente componente) {
		if (!esComponenteCompuesto())
			this.removeComponente(componente);
		else
			throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public String dibujarS() {
		return "\n";
	}

}
