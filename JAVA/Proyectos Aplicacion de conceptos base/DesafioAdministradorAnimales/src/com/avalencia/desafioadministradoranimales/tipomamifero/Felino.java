package com.avalencia.desafioadministradoranimales.tipomamifero;

import com.avalencia.desafioadministradoranimales.mamifero.Mamifero;

abstract public class Felino extends Mamifero {
    protected float tamanogarras;
    protected int velocidad;

    public Felino() {
    }

    public Felino(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamanogarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.tamanogarras = tamanogarras;
        this.velocidad = velocidad;
    }

    public float getTamanogarras() {
        return tamanogarras;
    }

    public void setTamanogarras(float tamanogarras) {
        this.tamanogarras = tamanogarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
