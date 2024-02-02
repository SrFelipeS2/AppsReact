package com.avalencia.desafiocarrosupermercado.productos;

import com.avalencia.desafiocarrosupermercado.modelo.Producto;

public class Lacteo extends Producto {
    private Integer cantidad;
    private Integer proteina;
    public Lacteo(String nombre, Double precio) {
        super(nombre, precio);
    }

    public Lacteo(String nombre, Double precio, Integer cantidad, Integer proteina) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteina = proteina;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Integer getProteina() {
        return proteina;
    }

    @Override
    public String toString() {
        return "Lacteo{" +
                "cantidad=" + cantidad +
                ", proteina=" + proteina +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
