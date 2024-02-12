package com.avalencia.java.jdbc.repository;

import com.avalencia.java.jdbc.model.User;
import com.avalencia.java.jdbc.util.DataBaseConnexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImplementation implements Repositorio<User> {

    private Connection getConnection() throws SQLException {
        return DataBaseConnexion.getInstance();
    }

    @Override
    public List<User> listar() {
        List<User> users = new ArrayList<>();
        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios")) {
            while (rs.next()) {
                User u = createUser(rs);
                users.add(u);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public User porId(Long id) {
        User u = null;
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuarios where id = ?")) {
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    u = createUser(rs);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return u;
    }

    @Override
    public void guardar(User user) {
        String sql;
        if (user.getId() != null && user.getId()>0){
            sql = "UPDATE usuarios set username = ?, password = ?, email = ? WHERE id = ?";
        }else {
            sql = "INSERT INTO usuarios(username, password, email) values(?,?,?)";
        }
        try(Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());
            if (user.getId() != null && user.getId() > 0) {
                stmt.setLong(4, user.getId());
            }
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void eliminar(Long id) {
        try(Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement("DELETE FROM usuarios WHERE id = ?")) {
            stmt.setLong(1,id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static User createUser(ResultSet rs) throws SQLException {
        User u = new User();
        u.setId(rs.getLong(1));
        u.setUsername(rs.getString(2));
        u.setEmail(rs.getString(3));
        u.setPassword(rs.getString(4));
        return u;
    }
}
