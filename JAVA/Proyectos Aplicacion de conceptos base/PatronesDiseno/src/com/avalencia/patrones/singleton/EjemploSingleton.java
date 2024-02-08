package com.avalencia.patrones.singleton;

public class EjemploSingleton {
    public static void main(String[] args) {
        ConexinBDSingleton con = null;
        for (int i = 0; i < 10; i++) {
             con = ConexinBDSingleton.getInstancia();
            System.out.println("con = " + con);
        }
        ConexinBDSingleton con2 = ConexinBDSingleton.getInstancia();
        ConexinBDSingleton con3 = ConexinBDSingleton.getInstancia();
        boolean b1 = ((con == con2)&&(con2 == con3) && (con == con3));
        System.out.println("b1 = " + b1) ;

    }
}
