package org.mgobea.poointerfaces.imprenta.model;

public class Pagina extends Hoja{

    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.getContenido();
    }
}
