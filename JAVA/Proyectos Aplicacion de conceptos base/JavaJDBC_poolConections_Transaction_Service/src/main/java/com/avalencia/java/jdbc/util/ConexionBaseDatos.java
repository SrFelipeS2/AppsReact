package com.avalencia.java.jdbc.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexionBaseDatos {
    private static String url = "jdbc:mysql://localhost:3306/java_curso";
    private static String username = "root";
    private static String password = "sese10";
    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            //Configuracion de los parametros para la conexion a la base de datos
            pool.setUrl(url);
            pool.setUsername(username);
            pool.setPassword(password);
            //Cantas conexiones iniciales estaran abiertas:
            pool.setInitialSize(3);
            //este es el minimo de conexiones inactivas, esperando a ser utilizadas
            pool.setMinIdle(3);
            //este es el maximo de conexiones inactivas, esperando a ser utilizadas
            pool.setMaxIdle(8);
            //el pool en total entre activas que se esten utilizando eh inactivas que no
            pool.setMaxTotal(8);
            // si no se configuran estos parametros inicialmente se toman como valor 0
            // y se van incrementando hasta llegar  a 8
        }
        return pool;
    }

    //este metodo devuelve una nueva conexion a la base de datos, es decir que con este
    //se obtiene una sola conexion del pool de conexiones

    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }

}
