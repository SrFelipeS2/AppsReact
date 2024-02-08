package com.avalencia.archivos.ejemplos;

import com.avalencia.archivos.ejemplo.servicio.ArchivoServicio;

import java.security.Provider;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        ArchivoServicio servicio = new ArchivoServicio();
        System.out.println(servicio.leerArchivo2("E:\\CursoJava\\ArchivosCreadosPorCodigo\\java.txt"));
    }
}
