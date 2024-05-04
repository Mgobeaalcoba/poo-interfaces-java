package org.mgobea.poointerfaces.imprenta.model;

public class Informe extends Hoja{
    private Persona autor;
    private Persona revisor;

    public Informe(String contenido, Persona autor, Persona revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    public Persona getAutor() {
        return this.autor;
    }

    public Persona getRevisor() {
        return this.revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.getAutor() +
                ". \nRevisado por: " + this.getRevisor() +
                ". \nContenido:" + this.getContenido();
    }
}
