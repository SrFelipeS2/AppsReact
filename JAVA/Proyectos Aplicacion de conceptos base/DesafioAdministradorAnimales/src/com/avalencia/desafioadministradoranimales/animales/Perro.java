package com.avalencia.desafioadministradoranimales.animales;

import com.avalencia.desafioadministradoranimales.tipomamifero.Canino;

public class Perro extends Canino {
    private int fuerzaMordida;
    private String nombreAmo;

    public Perro(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoComlmillos) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanoComlmillos);
    }

    public Perro(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoComlmillos, int fuerzaMordida, String nombreAmo) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanoComlmillos);
        this.fuerzaMordida = fuerzaMordida;
        this.nombreAmo = nombreAmo;
    }

    @Override
    public String comer() {
        return "El perro disfruta de su hueso con una potencia de mordida "+this.fuerzaMordida+", el hueso se lo regalo su amo " + this.nombreAmo;
    }

    @Override
    public String dormir() {
        return "El perro se acomoda en su cama para dormir.";
    }

    @Override
    public String correr() {
        return "El perro corre felizmente en el parque.";
    }

    @Override
    public String comunicarse() {
        return "El perro ladra y mueve la cola para comunicarse con su dueño.";
    }

}
