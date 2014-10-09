package es.upm.miw.ecp2.patrones.Connection;

public class Parado extends StateConnection{
	
	public Estado getEstado(){
		return Estado.PARADO;
	}

	@Override
	public void abrir(Conexion con ) {
		throw new UnsupportedOperationException("Accion no permitida... ");
	}

	@Override
	public void cerrar(Conexion con) {
		throw new UnsupportedOperationException("Accion no permitida... ");
	}

	@Override
	public void parar(Conexion con) {
	}

	@Override
	public void iniciar(Conexion con) {
		con.setEstado(new Preparado());
	}

	@Override
	public void enviar(Conexion con, String msg) {
		throw new UnsupportedOperationException("Accion no permitida... ");
	}

	@Override
	public void recibir(Conexion con,int respuesta) {
		throw new UnsupportedOperationException("Accion no permitida... ");
	}

}
