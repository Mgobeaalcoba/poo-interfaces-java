package org.mgobea.poointerfaces.imprenta.model;

abstract public class Hoja {
    protected String contenido;

    abstract public String imprimir();

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}
