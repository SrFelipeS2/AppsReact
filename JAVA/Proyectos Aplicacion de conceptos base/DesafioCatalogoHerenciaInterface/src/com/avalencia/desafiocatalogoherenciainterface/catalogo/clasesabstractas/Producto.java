package com.avalencia.desafiocatalogoherenciainterface.catalogo.clasesabstractas;

import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IProducto;

abstract public class Producto implements IProducto {
    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
