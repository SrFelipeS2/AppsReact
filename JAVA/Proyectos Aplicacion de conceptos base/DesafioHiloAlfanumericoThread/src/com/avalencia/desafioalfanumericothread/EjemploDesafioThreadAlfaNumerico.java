package com.avalencia.desafioalfanumericothread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjemploDesafioThreadAlfaNumerico {
    public static void main(String[] args) {
        AlfanumericoTarea h1 = new AlfanumericoTarea(Tipo.NUMERO);
        AlfanumericoTarea h2 = new AlfanumericoTarea(Tipo.LETRA);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();

    }
}
