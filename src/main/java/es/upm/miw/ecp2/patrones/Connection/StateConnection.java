package es.upm.miw.ecp2.patrones.Connection;

public abstract class StateConnection {
	
	public abstract Estado getEstado();

	public abstract void abrir(Conexion con);

	public abstract void cerrar(Conexion con);

	public abstract void parar(Conexion con);

	public abstract void iniciar(Conexion con);

	public abstract void enviar(Conexion con, String msg);

	public abstract void recibir(Conexion con, int respuesta);


}
