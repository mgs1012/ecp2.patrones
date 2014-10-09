package es.upm.miw.ecp2.patrones.Connection;

public abstract class StateConnection {

	public abstract void abrir(StateConnection estado);

	public abstract void cerrar(StateConnection estado);

	public abstract void parar(StateConnection estado);

	public abstract void iniciar(StateConnection estado);

	public abstract void enviar(StateConnection estado);

	public abstract void recibir(StateConnection estado);

}
