package es.upm.miw.ecp2.patrones.Memento;

import java.util.HashMap;
import java.util.Map;

public class GestorMementos<T> {
	
	 private Map<String, T> lista = new HashMap<String, T>();

	    public void addMemento(String key, T memento) {
	        this.lista.put(this.lista.size() + ":" + key, memento);
	    }

	    public T getMemento(String key) {
	        return this.lista.get(key);
	    }

	    public String[] keys() {
	        return this.lista.keySet().toArray(new String[0]);
	    }

}
