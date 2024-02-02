package com.avalencia.thread.ejemplos;

import com.avalencia.thread.ejemplos.thread.NombreThread;

public class ExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Jhon Doe");
        System.out.println(hilo.getState());
        hilo.start();
        //Thread.sleep(100);
        //System.out.println(hilo.getState());
        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();
        Thread hilo3 = new NombreThread("Pepe");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}