package com.avalencia.thread.ejemplos;

import com.avalencia.thread.ejemplos.runnable.ImprimirFrases;

public class EjemploSincroizacionThread {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFrases("Hola ", "Que tal!")).start();
        new Thread(new ImprimirFrases("Quien  eres ", "Tu?")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new ImprimirFrases("Muchas ", "Gracias amigo!?"));
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());



    }

    public synchronized static void imprimirFrases(String frase1, String frase2) throws InterruptedException {
        System.out.print(frase1);
        Thread.sleep(1000);
        System.out.println(frase2);
    }
}
