package com.avalencia.desafiocatalogoherenciainterface.catalogo;

import com.avalencia.desafiocatalogoherenciainterface.catalogo.clasesabstractas.Producto;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.ILibro;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IProducto;

import java.util.Date;

public class Libro extends Producto  implements ILibro, IProducto{
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }
    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
    @Override
    public String getAutor() {
        return autor;
    }
    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }


    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.2;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Precio de venta: " + this.getPrecioVenta());
        System.out.println("Fecha de publicación: " + this.getFechaPublicacion());
        System.out.println("Autor: " + this.getAutor());;
        System.out.println("titulo: " + this.getTitulo());
        System.out.println("Editorial: " + this.getEditorial());
    }
}
