package com.avalencia.java.jdbc;

import com.avalencia.java.jdbc.modelo.Categoria;
import com.avalencia.java.jdbc.modelo.Producto;
import com.avalencia.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.avalencia.java.jdbc.repositorio.Repositorio;

import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {

        Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
        System.out.println("==========Listar=========");
        repositorio.listar().forEach(System.out::println);
        System.out.println("==========Listar por id=========");
        System.out.println(repositorio.porId(2L));
        System.out.println("==========Insertar nuevo producto=========");
        Producto producto = new Producto();
        producto.setNombre("Notebook Omen Hp");
        producto.setPrecio(2900);
        producto.setFechaRegistro(new Date());
        Categoria categoria = new Categoria();
        categoria.setId(3L);
        producto.setCategoria(categoria);
        repositorio.guardar(producto);
        System.out.println("Producto guardado con exito");
        System.out.println("==========Listar=========");
        repositorio.listar().forEach(System.out::println);

    }
}
