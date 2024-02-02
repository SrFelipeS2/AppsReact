package com.avalencia.thread.ejemplosync;

import com.avalencia.thread.ejemplosync.runnable.Consumidor;
import com.avalencia.thread.ejemplosync.runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorFuncional {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                p.hornear("Pan n°: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                p.consumirElPan();
            }
        }).start();
    }
}
