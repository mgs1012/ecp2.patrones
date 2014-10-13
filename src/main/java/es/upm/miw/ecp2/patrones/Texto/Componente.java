package es.upm.miw.ecp2.patrones.Texto;

public abstract class Componente {

	public abstract void add(Componente componente);
	
	public abstract void remove(Componente componente);

	public abstract String dibujar(boolean b);
	
	public abstract boolean esComponenteCompuesto();
}