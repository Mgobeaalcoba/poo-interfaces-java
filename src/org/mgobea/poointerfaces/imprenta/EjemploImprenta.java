package org.mgobea.poointerfaces.imprenta;

import org.mgobea.poointerfaces.imprenta.model.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        // Instancio 4 personas para asignar a los objetos
        Persona persona = new Persona("Lisandro", "Raccio Fernandez");
        Persona persona2 = new Persona("Lautaro", "Gobea Fernandez");
        Persona persona3 = new Persona("Mariano", "Gobea");
        Persona persona4 = new Persona("Nicole", "Fernadez");

        // Instancio un Curriculum y un Informe
        Curriculum curriculum = new Curriculum("Contenido del curriculum", persona3, "Carrera");
        curriculum.addExperiencia("Experiencia 1").addExperiencia("Experiencia 2").addExperiencia("Experiencia 3");
        Informe informe = new Informe("Contenido del informe", persona2, persona);

        // Instancio un Libro
        Libro libro = new Libro(persona4, "Mi odisea", Genero.CIENCIA_FICCION);
        libro.addPagina(new Pagina("Esta es la pagina 1"))
                .addPagina(new Pagina("Esta es la pagina 2"))
                .addPagina(new Pagina("Esta es la pagina 1"));

        Imprimible[] listaHoja = new Imprimible[]{curriculum, informe, libro};

        // Imprimo el Curriculum y el Informe
        for(Imprimible hoja : listaHoja) {
            imprimir(hoja);
        }
    }

    public static void imprimir(Imprimible imprimible) {
        // Como todas mis clases implementan la interfaz Imprimible, puedo llamar al método imprimir sin importar el tipo de objeto
        System.out.println(imprimible.imprimir());
    }
}
