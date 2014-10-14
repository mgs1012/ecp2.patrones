package es.upm.miw.ecp2.patrones.calculadora;

public interface MementableI<T> {

	T createMemento();

	void restoreMemento(T memento);

}
