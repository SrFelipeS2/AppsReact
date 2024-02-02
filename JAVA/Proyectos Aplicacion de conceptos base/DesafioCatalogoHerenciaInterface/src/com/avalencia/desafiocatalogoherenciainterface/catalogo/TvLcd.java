package com.avalencia.desafiocatalogoherenciainterface.catalogo;

import com.avalencia.desafiocatalogoherenciainterface.catalogo.clasesabstractas.Electronico;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IElectronico;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IProducto;

public class TvLcd extends Electronico implements IElectronico, IProducto {
    private double pulgada;

    public TvLcd(String fabricante, double pulgada) {
        super(fabricante);
        this.pulgada = pulgada;
    }

    public double getPulgada() {
        return pulgada;
    }
    @Override
    public String getFabricante(){
        return fabricante;
    }


    @Override
    public int getPrecio() {
        return 3000000;
    }

    @Override
    public double getPrecioVenta() {

        return getPrecio() * 1.15;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Precio de venta: " + this.getPrecioVenta());
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Pulgadas: " + this.getPulgada());
    }
}
