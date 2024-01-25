package com.avalencia.desafiocatalogoherenciainterface.catalogo;

import com.avalencia.desafiocatalogoherenciainterface.catalogo.clasesabstractas.Electronico;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IProducto;

public class TvLcd extends Electronico implements IProducto {
    private double pulgada;

    public TvLcd(String fabricante, double pulgada) {
        super(fabricante);
        this.pulgada = pulgada;
    }

    public double getPulgada() {
        return pulgada;
    }

    @Override
    public int getPrecio() {

        return 3000000;
    }

    @Override
    public double getPrecioVenta() {

        return getPrecio() * 1.15;
    }

}
