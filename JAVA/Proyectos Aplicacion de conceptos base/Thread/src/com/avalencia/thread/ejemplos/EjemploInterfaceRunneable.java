package com.avalencia.thread.ejemplos;

import com.avalencia.thread.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunneable {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("Isla de Pascua")).start();
        new Thread(new ViajeTarea("canada")).start();
        new Thread(new ViajeTarea("USA")).start();
        new Thread(new ViajeTarea("Vancuver")).start();
    }
}
