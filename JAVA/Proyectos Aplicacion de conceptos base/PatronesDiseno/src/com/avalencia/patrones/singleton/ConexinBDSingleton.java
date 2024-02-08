package com.avalencia.patrones.singleton;

public class ConexinBDSingleton {

    private static ConexinBDSingleton instancia;
    private ConexinBDSingleton(){
        System.out.println("Conextandose a algun motor de base de datos");
    }
    public static ConexinBDSingleton getInstancia(){
        if(!(instancia instanceof ConexinBDSingleton)){
            instancia = new ConexinBDSingleton();
        }return instancia;
    }

}
