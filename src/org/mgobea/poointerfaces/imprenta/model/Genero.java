package org.mgobea.poointerfaces.imprenta.model;

public enum Genero {
    // Géneros posibles para un libro
    DRAMA("Drama"),
    ACCION("Acción"),
    AVENTURA("Aventura"),
    TERROR("Terror"),
    CIENCIA_FICCION("Ciencia Ficción");

    private String nombre;

    Genero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
