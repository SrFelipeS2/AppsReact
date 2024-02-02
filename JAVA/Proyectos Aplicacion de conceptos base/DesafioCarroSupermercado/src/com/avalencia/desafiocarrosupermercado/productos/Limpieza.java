package com.avalencia.desafiocarrosupermercado.productos;

import com.avalencia.desafiocarrosupermercado.modelo.Producto;

public class Limpieza extends Producto {
    private String componentes;
    private Double litros;
    public Limpieza(String nombre, Double precio) {
        super(nombre, precio);
    }

    public Limpieza(String nombre, Double precio, String componentes, Double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public Double getLitros() {
        return litros;
    }

    @Override
    public String toString() {
        return "Limpieza{" +
                "componentes='" + componentes + '\'' +
                ", litros=" + litros +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
