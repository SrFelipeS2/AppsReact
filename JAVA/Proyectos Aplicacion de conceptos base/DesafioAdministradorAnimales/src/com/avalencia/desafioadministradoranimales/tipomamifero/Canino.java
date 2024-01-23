package com.avalencia.desafioadministradoranimales.tipomamifero;

import com.avalencia.desafioadministradoranimales.mamifero.Mamifero;

abstract public class Canino extends Mamifero {
    protected String color;

    protected float tamanoComlmillos;

    public Canino(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoComlmillos) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoComlmillos = tamanoComlmillos;
    }
}
