package es.upm.miw.ecp2.patrones.Connection;

import es.upm.miw.ecp2.patrones.Connection.*;

public final class LinkMock implements Link {
    private String msg;

    private int respuesta;

    public String getMsg() {
        return msg;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void enviar(String msg) {
        this.msg = msg;
    }

    public void recibir(int respuesta) {
        this.respuesta = respuesta;
    }

}
