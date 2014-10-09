package es.upm.miw.ecp2.patrones.Connection;

public class Preparado extends StateConnection{
	
	public Estado getEstado(){
		return Estado.PREPARADO;
	}

	@Override
	public void abrir(Conexion con) {
	}

	@Override
	public void cerrar(Conexion con) {
		con.setEstado(new Cerrado());
	}

	@Override
	public void parar(Conexion con) {
		con.setEstado(new Parado());
	}

	@Override
	public void iniciar(Conexion con) {
	}

	@Override
	public void enviar(Conexion con,  String msg) {
		con.getLink().enviar(msg);
		con.setEstado(new Esperando());
	}

	@Override
	public void recibir(Conexion con, int respuesta) {
		throw new UnsupportedOperationException("Accion no permitida... ");
	}
}
