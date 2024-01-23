package com.avalencia.desafioadministradoranimales.animales;

import com.avalencia.desafioadministradoranimales.tipomamifero.Felino;

public class Guepardo extends Felino {

    public Guepardo(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamanogarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanogarras, velocidad);
    }


    @Override
    public String comer() {
        return "El guepardo está cazando una gacelas alta velocidad.";
    }

    @Override
    public String dormir() {
        return "El guepardo descansa en la sombra de un acacia tortilis.";
    }

    @Override
    public String correr() {
        return "El guepardo corre a una velocidad impresionante se esta acercando a los 80 km/hora.";
    }

    @Override
    public String comunicarse() {
        return "El guepardo emite sonidos agudos amenazantes para comunicarse con otros guepardos indicandoles que dejen su territorio.";
    }

}
