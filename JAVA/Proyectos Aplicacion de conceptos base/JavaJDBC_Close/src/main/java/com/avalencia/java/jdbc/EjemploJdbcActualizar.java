package com.avalencia.java.jdbc;

import com.avalencia.java.jdbc.modelo.Categoria;
import com.avalencia.java.jdbc.modelo.Producto;
import com.avalencia.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.avalencia.java.jdbc.repositorio.Repositorio;
import com.avalencia.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcActualizar {
    public static void main(String[] args) {

        Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
        System.out.println("==========Listar=========");
        repositorio.listar().forEach(System.out::println);
        System.out.println("==========Listar por id=========");
        System.out.println(repositorio.porId(2L));
        System.out.println("==========Editar producto=========");
        Producto producto = new Producto();
        producto.setId(19L);
        producto.setNombre("Teclado Razer");
        producto.setPrecio(550);
        Categoria categoria = new Categoria();
        categoria.setId(1L);
        producto.setCategoria(categoria);
        repositorio.guardar(producto);
        System.out.println("Producto editado con exito");
        System.out.println("==========Listar=========");
        repositorio.listar().forEach(System.out::println);
    }
}



