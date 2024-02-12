package com.avalencia.java.jdbc.repositorio;

import com.avalencia.java.jdbc.modelo.Categoria;
import com.avalencia.java.jdbc.modelo.Producto;
import com.avalencia.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Producto> {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(
                     "SELECT p.*, c.nombre as categoria FROM productos AS p inner join  categorias AS c " +
                             "ON (p.id_categoria = c.id)")) {
            while (rs.next()) {
                Producto p = crearProducto(rs);
                productos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    @Override
    public Producto porId(Long id) {
        Producto producto = null;
        try (PreparedStatement stmt = getConnection()
                .prepareStatement("SELECT p.*, c.nombre AS " +
                        "categoria FROM productos AS p inner join  categorias AS c ON (p.id_categoria = c.id) WHERE p.id = ?")) {
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    producto = crearProducto(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) {
        String sql;
        if (producto.getId() != null && producto.getId() > 0) {
            sql = "UPDATE productos SEt nombre = ?, precio = ?, id_categoria = ? WHERE id = ?";
        } else {
            sql = "INSERT INTO productos(nombre, precio, id_categoria, fecha_registro) values(?,?,?,?)";
        }
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, producto.getNombre());
            stmt.setLong(2, producto.getPrecio());
            stmt.setLong(3, producto.getCategoria().getId());
            if (producto.getId() != null && producto.getId() > 0) {
                stmt.setLong(4, producto.getId());
            } else {
                stmt.setDate(4, new Date(producto.getFechaRegistro().getTime()));
            }
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminar(Long id) {
        try (PreparedStatement stmt = getConnection().prepareStatement("DELETE FROM productos WHERE id = ?")){
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static Producto crearProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setId(rs.getLong(1));
        p.setNombre(rs.getString(2));
        p.setPrecio(rs.getInt(3));
        p.setFechaRegistro(rs.getDate(4));
        Categoria categoria = new Categoria();
        categoria.setId(rs.getLong(5));
        categoria.setNombre(rs.getString(6));
        p.setCategoria(categoria);
        return p;
    }
}
