package com.avalencia.desafiocatalogoherenciainterface.catalogo;

import com.avalencia.desafiocatalogoherenciainterface.catalogo.clasesabstractas.Electronico;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IProducto;

public class IPhone extends Electronico implements IProducto {
    private String color;
    private String modelo;

    public IPhone(String fabricante, String color, String modelo) {
        super(fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getPrecio() {
        return 5000000;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.2;
    }

}
