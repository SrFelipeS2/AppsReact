package com.avalencia.desafioadministradoranimales.animales;

import com.avalencia.desafioadministradoranimales.tipomamifero.Canino;

public class Lobo extends Canino {

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoComlmillos) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanoComlmillos);
    }

    public Lobo(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoComlmillos, int numCamada, String especieLobo) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanoComlmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo "+ this.especieLobo +" se alimenta en grupo cazando presas grandes y el numero de la camada es: " + this.numCamada;
    }

    @Override
    public String dormir() {
        return "El lobo "+ this.especieLobo +" descansa en la entrada de la madriguera.";
    }

    @Override
    public String correr() {
        return "El lobo "+ this.especieLobo +" corre en busca de presas en la oscuridad de la noche.";
    }

    @Override
    public String comunicarse() {
        return "El lobo  "+ this.especieLobo +"aúlla para comunicarse con otros miembros de la manada.";
    }

}
