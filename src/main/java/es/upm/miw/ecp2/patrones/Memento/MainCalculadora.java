package es.upm.miw.ecp2.patrones.Memento;

import upm.jbb.IO;

public class MainCalculadora {
	
	 private GestorComandos gestor;
	 
	 private GestorMementos<MementoCalculadora> gestorMementos;

	    public MainCalculadora() {
	    	Calculadora calculadora = new Calculadora();
	        CalculadoraMementable calc = new CalculadoraMementable();
	        gestorMementos = new GestorMementos<MementoCalculadora>();
	        
	        this.gestor = new GestorComandos();
	        this.gestor.add(new ComandoSumar(calculadora));
	        this.gestor.add(new ComandoRestar(calculadora));
	        this.gestor.add(new ComandoIniciar(calculadora));
	        this.gestor.add(new ComandoImprimir(calculadora));
	        this.gestor.add(new ComandoDeshacer(calc, gestorMementos));
	        this.gestor.add(new ComandoGuardar(calc, gestorMementos));
	    }

	    public void ejecutar() {
	        String key = (String) IO.in.select(this.gestor.keys());
	        this.gestor.execute(key);
	    }

	    public static void main(String[] args) {
	        IO.in.addController(new MainCalculadora());
	    }

}
