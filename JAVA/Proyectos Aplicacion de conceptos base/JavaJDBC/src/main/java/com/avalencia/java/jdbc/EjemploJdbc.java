package com.avalencia.java.jdbc;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_curso";
        String username = "root";
        String password = "sese10";
        //CON AUTOCLOSE
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet resultado = stmt.executeQuery("SELECT * FROM productos")) {

            while (resultado.next()) {
                System.out.print(resultado.getInt(1));
                System.out.print(" | ");
                System.out.print(resultado.getString(2));
                System.out.print(" | ");
                System.out.print(resultado.getInt(3));
                System.out.print(" | ");
                System.out.println(resultado.getDate(4));
            }

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
