package org.mgobea.poointerfaces.imprenta.model;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
    private List<Hoja> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public List<Hoja> getPaginas() {
        return this.paginas;
    }

    public Persona getAutor() {
        return this.autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public Libro addPagina(Hoja pagina) {
        this.paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.getTitulo())
                .append("\nGenero: ").append(this.getGenero())
                .append("\nAutor: ").append(this.getAutor());
        for (Hoja pagina: this.getPaginas()) {
            sb.append(pagina.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
