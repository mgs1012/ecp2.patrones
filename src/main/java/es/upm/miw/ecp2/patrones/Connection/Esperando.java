package es.upm.miw.ecp2.patrones.Connection;

public class Esperando extends StateConnection{
	
	public Estado getEstado(){
		return Estado.ESPERANDO;
	}

	@Override
	public void abrir(Conexion con) {
		throw new UnsupportedOperationException("Accion no permitida... ");
	}

	@Override
	public void cerrar(Conexion con) {
		throw new UnsupportedOperationException("Accion no permitida... ");
	}

	@Override
	public void parar(Conexion con) {
		throw new UnsupportedOperationException("Accion no permitida... ");
	}

	@Override
	public void iniciar(Conexion con) {
		throw new UnsupportedOperationException("Accion no permitida... ");
	}

	@Override
	public void enviar(Conexion con, String msg) {
		throw new UnsupportedOperationException("Accion no permitida... ");
	}

	@Override
	public void recibir(Conexion con, int respuesta) {
		if (respuesta == 0) {
			con.setEstado(new Preparado());
        } else {
        	con.setEstado(new Cerrado());
        }
	}

}
