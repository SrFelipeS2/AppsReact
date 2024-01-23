package com.avalencia.desafioadministradoranimales.animales;

import com.avalencia.desafioadministradoranimales.tipomamifero.Felino;

public class Leon extends Felino {

    private int numeroManada;
    private float potenciaRugido;

    public Leon(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamanogarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanogarras, velocidad);
    }

    public Leon(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamanogarras, int velocidad, int numeroManada, float potenciaRugido) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanogarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public float getPotenciaRugido() {
        return potenciaRugido;
    }

    @Override
    public String comer() {
        return "El león se alimenta en la caza en grupo, el numero de la manada es: " + this.numeroManada;
    }

    @Override
    public String dormir() {
        return "El león descansa después de una larga jornada de caza.";
    }

    @Override
    public String correr() {
        return "El león corre en busca de presas en las llanuras.";
    }

    @Override
    public String comunicarse() {
        return "El león ruge con una intensidad de "+this.potenciaRugido+" para comunicarse con otros miembros de su manada.";
    }

}
