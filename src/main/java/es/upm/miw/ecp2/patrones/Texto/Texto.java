package es.upm.miw.ecp2.patrones.Texto;

public class Texto extends CompuestoComponente {

	public Texto() {
		super();
	}

	public void add(Componente componente) {
		if (componente.esComponenteCompuesto())
			this.addComponente(componente);
		else
			throw new UnsupportedOperationException("Operación no soportada");
	}

	public void remove(Componente componente) {
		listaComponentes.remove(componente);
	}

	@Override
	public String dibujarS() {
		return "---o---\n";
	}

}
