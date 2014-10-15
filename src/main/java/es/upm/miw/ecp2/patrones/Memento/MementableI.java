package es.upm.miw.ecp2.patrones.Memento;

public interface MementableI<T> {

	T createMemento();

	void restoreMemento(T memento);

}
