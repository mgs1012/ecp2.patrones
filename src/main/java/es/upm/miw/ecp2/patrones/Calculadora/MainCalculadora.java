package es.upm.miw.ecp2.patrones.Calculadora;

import es.upm.miw.ecp2.patrones.Memento.CalculadoraMementable;
import es.upm.miw.ecp2.patrones.Memento.ComandoDeshacer;
import upm.jbb.IO;

public class MainCalculadora {
	
	 private GestorComandos gestor;

	    public MainCalculadora() {
	        Calculadora calc = new CalculadoraMementable();
	        this.gestor = new GestorComandos();
	        this.gestor.add(new ComandoSumar(calc));
	        this.gestor.add(new ComandoRestar(calc));
	        this.gestor.add(new ComandoIniciar(calc));
	        this.gestor.add(new ComandoImprimir(calc));
	        this.gestor.add(new ComandoDeshacer(calc));
	    }

	    public void ejecutar() {
	        String key = (String) IO.in.select(this.gestor.keys());
	        this.gestor.execute(key);
	    }

	    public static void main(String[] args) {
	        IO.in.addController(new MainCalculadora());
	    }

}