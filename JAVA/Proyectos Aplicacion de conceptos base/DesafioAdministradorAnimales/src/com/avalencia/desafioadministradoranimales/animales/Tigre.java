package com.avalencia.desafioadministradoranimales.animales;

import com.avalencia.desafioadministradoranimales.tipomamifero.Felino;

public class Tigre extends Felino {

    private String especieTigre;


    public Tigre(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamanogarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanogarras, velocidad);
    }

    public Tigre(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamanogarras, int velocidad, String especieTigre) {
        this(habitad, altura, largo, peso, nombreCientifico, tamanogarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre "+this.especieTigre+" se alimenta de un búfalo asiático en la selva.";
    }

    @Override
    public String dormir() {
        return "El tigre "+this.especieTigre+" descansa bajo la sombra de la vegetación.";
    }

    @Override
    public String correr() {
        return "El tigre "+this.especieTigre+" corre ágilmente a través de su territorio detras de un pavo real.";
    }

    @Override
    public String comunicarse() {
        return "El tigre "+this.especieTigre+" emite rugidos para marcar su territorio y comunicarse con otros tigres.";
    }


}
