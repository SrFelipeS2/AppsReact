package com.avalencia.desafiocatalogoherenciainterface.catalogo;

import com.avalencia.desafiocatalogoherenciainterface.catalogo.clasesabstractas.Electronico;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IElectronico;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IProducto;

public class IPhone extends Electronico implements IElectronico, IProducto {
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
    public String getFabricante(){
        return fabricante;
    }

    @Override
    public int getPrecio() {
        return 5000000;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.2;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Precio de venta: " + this.getPrecioVenta());
        System.out.println("fabircante: " + this.getFabricante());
        System.out.println("Color: " + this.getColor());;
        System.out.println("Modelo: " + this.getModelo());
    }
}
