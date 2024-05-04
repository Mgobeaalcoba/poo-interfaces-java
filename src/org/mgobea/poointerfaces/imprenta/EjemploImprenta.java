package org.mgobea.poointerfaces.imprenta;

import org.mgobea.poointerfaces.imprenta.model.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        // Instancio un Curriculum y un Informe
        Curriculum curriculum = new Curriculum("Contenido del curriculum", "Persona", "Carrera");
        curriculum.addExperiencia("Experiencia 1").addExperiencia("Experiencia 2").addExperiencia("Experiencia 3");
        Informe informe = new Informe("Contenido del informe", "Autor", "Revisor");

        Hoja[] listaHoja = new Hoja[]{curriculum, informe};

        // Imprimo el Curriculum y el Informe
        for(Hoja hoja : listaHoja) {
            imprimir(hoja);
        }
    }

    public static void imprimir(Hoja imprimible) {
        // Como todas mis clases implementan la interfaz Imprimible, puedo llamar al método imprimir sin importar el tipo de objeto
        System.out.println(imprimible.imprimir());
    }
}