package com.avalencia.thread.ejemplosync;

import com.avalencia.thread.ejemplosync.runnable.Consumidor;
import com.avalencia.thread.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
