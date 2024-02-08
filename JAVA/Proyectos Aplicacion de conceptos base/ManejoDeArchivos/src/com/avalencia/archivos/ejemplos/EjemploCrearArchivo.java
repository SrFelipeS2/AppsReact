package com.avalencia.archivos.ejemplos;

import com.avalencia.archivos.ejemplo.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
            String nombreArchivo = "E:\\CursoJava\\ArchivosCreadosPorCodigo\\java.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);
    }
}
