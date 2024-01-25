package com.avalencia.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja{
    private String persona;
    private String carrera;
    private List<String> experiencias;
    private List<String> habilidades;

    public Curriculo(String contenido) {
        super(contenido);
    }

    public Curriculo(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
        this.habilidades = new ArrayList<>();
    }
    public Curriculo addExperiencias(String ex){
        experiencias.add(ex);
        return this;
    }
    public  Curriculo addHanilidades(String hab){
        habilidades.add(hab);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ").append(this.carrera)
                .append("\n").append("Esperiencia: \n");
        for (String exp: this.experiencias){
            sb.append("- ").append(exp).append("\n");
        }
        sb.append("\nHabilidades");
        for (String hab: this.habilidades){
            sb.append("- ").append(hab).append("\n");
        }
        return sb.toString();
    }
}
