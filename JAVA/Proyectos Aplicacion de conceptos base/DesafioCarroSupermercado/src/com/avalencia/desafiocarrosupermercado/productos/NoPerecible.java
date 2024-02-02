package com.avalencia.desafiocarrosupermercado.productos;

import com.avalencia.desafiocarrosupermercado.modelo.Producto;

public class NoPerecible extends Producto {
    private Integer contenido;
    private Integer calorias;
    public NoPerecible(String nombre, Double precio) {
        super(nombre, precio);
    }

    public NoPerecible(String nombre, Double precio, Integer contenido, Integer calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public Integer getContenido() {
        return contenido;
    }

    public Integer getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return "NoPerecible{" +
                "contenido=" + contenido +
                ", calorias=" + calorias +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
