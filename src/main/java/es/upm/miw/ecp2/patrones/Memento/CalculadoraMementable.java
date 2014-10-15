package es.upm.miw.ecp2.patrones.Memento;

import es.upm.miw.ecp2.patrones.Calculadora.Calculadora;

public class CalculadoraMementable extends Calculadora implements MementableI<MementoCalculadora>{

	private int id;

    private int valor;

    private String cadena;

	
	public MementoCalculadora guardar(){
		return new MementoCalculadora(valor, cadena);
		
	}
	
	public void deshacer(){
		
	}

	@Override
	public int getTotal() {
		return super.getTotal();
	}

	@Override
	protected void setTotal(int total) {
		super.setTotal(total);
	}

	@Override
	public void sumar(int valor) {
		super.sumar(valor);
	}

	@Override
	public void restar(int valor) {
		super.restar(valor);
	}

	@Override
	public void iniciar() {
		super.iniciar();
	}

    public int getId() {
        return id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public MementoCalculadora createMemento() {
        return new MementoCalculadora(this.valor, this.cadena);
    }

    @Override
    public void restoreMemento(MementoCalculadora memento) {
        this.setValor(memento.getValor());
        this.setCadena(memento.getCadena());
    }

    @Override
    public String toString() {
        return "Originador[" + id + "," + cadena + "," + valor + "]";
    }


}
