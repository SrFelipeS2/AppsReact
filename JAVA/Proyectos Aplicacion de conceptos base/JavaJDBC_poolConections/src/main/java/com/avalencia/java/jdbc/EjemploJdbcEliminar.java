package com.avalencia.java.jdbc;

import com.avalencia.java.jdbc.modelo.Producto;
import com.avalencia.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.avalencia.java.jdbc.repositorio.Repositorio;


public class EjemploJdbcEliminar {
    public static void main(String[] args) {

        Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
        System.out.println("==========Listar=========");
        repositorio.listar().forEach(System.out::println);
        System.out.println("==========Listar por id=========");
        System.out.println(repositorio.porId(2L));
        System.out.println("==========Eliminar=========");
        repositorio.eliminar(5L);
        System.out.println("Producto eliminado con exito");
        System.out.println("==========Listar=========");
        repositorio.listar().forEach(System.out::println);
    }
}
