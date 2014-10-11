package es.upm.miw.ecp2.patrones.Expression;

public abstract class ExpresionCompuesta extends Expresion {
	
	protected Expresion operando1;
	protected Expresion operando2;

	public ExpresionCompuesta(Expresion exp1, Expresion exp2) {
		this.operando1 = exp1;
		this.operando2 = exp2;
	}

	public abstract int operar();
	
	public String toString(){
		return null;
	}
}
