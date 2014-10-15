package es.upm.miw.ecp2.patrones.Calculadora;

import es.upm.miw.ecp2.patrones.Memento.MementoCalculadora;

public class Calculadora {
	
	    private int total;
	    
	    private int vAnterior;

	    public Calculadora() {
	        this.iniciar();
	    }

	    
	    
	    public int getTotal() {
	        return total;
	    }

	    protected void setTotal(int total) {
	        this.total = total;
	    }

	    public void sumar(int valor) {
	    	this.vAnterior = this.total;
	        this.setTotal(this.total + valor);
	    }

	    public void restar(int valor) {
	    	this.vAnterior = this.total;
	        this.setTotal(this.total - valor);
	    }

	    public void iniciar() {
	        this.setTotal(0);
	    }
	    
	    public void deshacer(){
	    	this.setTotal(vAnterior);
	    }



		public MementoCalculadora guardar() {
			// TODO Auto-generated method stub
			return null;
		}
}
