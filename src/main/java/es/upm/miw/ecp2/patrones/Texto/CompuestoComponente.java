package es.upm.miw.ecp2.patrones.Texto;

import java.util.ArrayList;
import java.util.List;

public abstract class CompuestoComponente extends Componente {

	@Override
	public boolean esComponenteCompuesto() {
		return true;
	}

	public List<Componente> listaComponentes;

	public CompuestoComponente() {
		listaComponentes = new ArrayList<Componente>();
	}
	
	public abstract void add(Componente componente);
	
	public abstract void remove(Componente componente);

	public void addComponente(Componente componente){
		if(componente != null)
			this.listaComponentes.add(componente);
	}

	public void removeComponente(Componente componente){
		this.listaComponentes.remove(componente);
	}


	public String dibujar(boolean enMayusculas) {
		String s = "";
			for (Componente comp : listaComponentes) {
				s += comp.dibujar(enMayusculas);
			}
			return s+this.dibujarS();
	}

	public abstract String dibujarS();

	
}
