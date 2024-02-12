package com.avalencia.java.jdbc.servicio;

import com.avalencia.java.jdbc.modelo.Categoria;
import com.avalencia.java.jdbc.modelo.Producto;

import java.sql.SQLException;
import java.util.List;

public interface Servicio {
    List<Producto> listar() throws SQLException;

    Producto porId(Long id) throws SQLException;

    Producto guardar(Producto p) throws SQLException;

    void eliminar(Long id) throws SQLException;
    List<Categoria> listarCategoria() throws SQLException;

    Categoria porIdCategoria(Long id) throws SQLException;

    Categoria guardarCategoria(Categoria p) throws SQLException;

    void elimnarCategoria(Long id) throws SQLException;


    void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException;
}
