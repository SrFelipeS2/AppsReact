package com.avalencia.java.jdbc;

import com.avalencia.java.jdbc.modelo.Categoria;
import com.avalencia.java.jdbc.modelo.Producto;
import com.avalencia.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.avalencia.java.jdbc.repositorio.Repositorio;
import com.avalencia.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcTransaction {
    public static void main(String[] args) throws SQLException {

        try (Connection conn = ConexionBaseDatos.getInstance()) {
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
                System.out.println("==========Listar=========");
                repositorio.listar().forEach(System.out::println);
                //repositorio.listar().forEach(elemento -> System.out.println(elemento));
                System.out.println("==========Listar por id=========");
                System.out.println(repositorio.porId(2L));
                System.out.println("==========Insertar nuevo producto=========");
                Producto producto = new Producto();
                producto.setNombre("Teclado IBM Mecanico");
                producto.setPrecio(1550);
                producto.setFechaRegistro(new Date());
                Categoria categoria = new Categoria();
                categoria.setId(3L);
                producto.setCategoria(categoria);
                producto.setSku("abcde12345");
                repositorio.guardar(producto);
                System.out.println("Producto guardado con exito");
                System.out.println("==========Editar producto=========");
                producto = new Producto();
                producto.setId(19L);
                producto.setNombre("Teclado Razer");
                producto.setPrecio(1000);
                producto.setSku("a12345");
                categoria = new Categoria();
                categoria.setId(1L);
                producto.setCategoria(categoria);
                repositorio.guardar(producto);
                System.out.println("Producto editado con exito");

                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
        }

    }
}
