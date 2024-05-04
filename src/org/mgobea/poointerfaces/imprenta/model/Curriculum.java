package org.mgobea.poointerfaces.imprenta.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja{
    private Persona persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculum(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Persona getPersona() {
        return persona;
    }

    public String getCarrera() {
        return carrera;
    }

    public List<String> getExperiencia() {
        return experiencia;
    }

    public Curriculum addExperiencia(String experiencia) {
        this.experiencia.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curriculum de: ").append(this.getPersona())
                .append(". \nResumen: ").append(this.getContenido())
                .append(". \nCarrera: ").append(this.getCarrera())
                .append(". \nExperiencia: ");
        for (String exp : this.getExperiencia()) {
            sb.append(exp).append(", ");
        }
        return sb.toString();
    }
}
