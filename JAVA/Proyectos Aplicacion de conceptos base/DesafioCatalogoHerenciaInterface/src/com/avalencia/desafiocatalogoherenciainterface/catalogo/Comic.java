package com.avalencia.desafiocatalogoherenciainterface.catalogo;

import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IProducto;

import java.util.Date;

public class Comic extends Libro implements IProducto {
    private String personaje;

    public Comic(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Personaje: " + this.getPersonaje());
    }
}
