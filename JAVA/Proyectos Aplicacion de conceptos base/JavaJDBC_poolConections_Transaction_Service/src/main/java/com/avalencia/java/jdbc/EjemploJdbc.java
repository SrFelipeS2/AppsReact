package com.avalencia.java.jdbc;

import com.avalencia.java.jdbc.modelo.Categoria;
import com.avalencia.java.jdbc.modelo.Producto;
import com.avalencia.java.jdbc.servicio.CatalogoServicio;
import com.avalencia.java.jdbc.servicio.Servicio;

import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {

        Servicio servicio = new CatalogoServicio();
        System.out.println("==========Listar=========");
        servicio.listar().forEach(System.out::println);
        System.out.println("==========Insetar Nueva Categoria ==========");
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminacion");

        System.out.println("==========Insertar nuevo producto=========");
        Producto producto = new Producto();
        producto.setNombre("Lampara Led");
        producto.setPrecio(990);
        producto.setFechaRegistro(new Date());
        producto.setSku("NIL6535");
        servicio.guardarProductoConCategoria(producto,categoria);
        System.out.println("Producto guardado con exito: " + producto.getId());

        System.out.println("==========Listar=========");
        servicio.listar().forEach(System.out::println);

    }
}
