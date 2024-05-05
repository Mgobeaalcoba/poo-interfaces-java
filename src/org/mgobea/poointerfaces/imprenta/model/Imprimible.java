package org.mgobea.poointerfaces.imprenta.model;

public interface Imprimible {
    // Puedo agregar un atributo final a una interface:
    String MENSAJE_DEFAULT = "Imprimiendo un valor por defecto...";


    String imprimir(); // Este método es abstracto por defecto y es public por defecto. Es necesario implementarlo en las clases que implementen esta interfaz.

    default String imprimirDos() {
        return Imprimible.MENSAJE_DEFAULT; // Al tener un valor por defecto, no es necesario implementar este método en las clases que implementen esta interfaz
    };

    // Tmb puedo sumarle a una interface un método estático:
    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
