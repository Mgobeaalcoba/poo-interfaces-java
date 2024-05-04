package org.mgobea.poointerfaces.imprenta.model;

public class Informe extends Hoja{
    private String autor;
    private String revisor;

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    public String getAutor() {
        return autor;
    }

    public String getRevisor() {
        return revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.getAutor() +
                ". \nRevisado por: " + this.getRevisor() +
                ". \nContenido:" + this.getContenido();
    }
}
