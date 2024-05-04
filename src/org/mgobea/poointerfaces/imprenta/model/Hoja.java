package org.mgobea.poointerfaces.imprenta.model;

abstract public class Hoja implements Imprimible{
    protected String contenido;

    @Override
    abstract public String imprimir();

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}
