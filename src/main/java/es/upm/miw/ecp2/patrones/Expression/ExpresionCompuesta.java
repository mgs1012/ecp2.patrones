package es.upm.miw.ecp2.patrones.Expression;

import java.util.List;

public abstract class ExpresionCompuesta extends Expresion {
	
	protected Expresion operando1;
	protected Expresion operando2;

	public ExpresionCompuesta(Expresion exp1, Expresion exp2) {
		this.operando1 = exp1;
		this.operando2 = exp2;
	}

	public int operar(){
		return 0;
		
	}
	
	public String toString(){
		return null;
	}
}
