package com.avalencia.java.jdbc;

import com.avalencia.java.jdbc.modelo.Categoria;
import com.avalencia.java.jdbc.modelo.Producto;
import com.avalencia.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.avalencia.java.jdbc.repositorio.Repositorio;
import com.avalencia.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getInstance()){
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("==========Listar=========");
            repositorio.listar().forEach(System.out::println);
            repositorio.listar().forEach(elemento -> System.out.println(elemento));
            System.out.println("==========Listar por id=========");
            System.out.println(repositorio.porId(2L));
            System.out.println("==========Insertar nuevo producto=========");
            Producto producto = new Producto();
            producto.setNombre("Teclado Razer");
            producto.setPrecio(550);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto guardado con exito");
            System.out.println("==========Listar=========");
            repositorio.listar().forEach(System.out::println);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


//        try {
//            conn = DriverManager.getConnection(url, username, password);
//            stmt = conn.createStatement();
//            resultado = stmt.executeQuery("SELECT * FROM productos");
//
//            while (resultado.next()) {
//                System.out.println(resultado.getString(2));
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                resultado.close();
//                stmt.close();
//                conn.close();
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
