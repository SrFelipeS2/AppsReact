package com.avalencia.thread.ejemploexecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduleExecutorServicePeriodo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        System.out.println("Alguna tarea en el main");

        AtomicInteger contador = new AtomicInteger(5);
        //para que se ejecute durante una cantidad de veces de 5 a 0, esta clase opera de manera atomica;
        //CountDownLatch lock = new CountDownLatch(5);
        Future<?> future = executor.scheduleAtFixedRate(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                //para que se ejecute durante una cantidad de veces de 5 a 0, decrementa el objeto hasta 0
                //lock.countDown();
                contador.getAndDecrement();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hola mundo soy una tarea programada");
        },1000, 2000,TimeUnit.MILLISECONDS);
        //para que se ejecute durante una cantidad de veces de 5 a 0, bloquea el thread pricipal
        //lock.await();
        //future.cancel(true);
        //Para que la tarea se ejecute durante un tiempo determinado:▼
        //TimeUnit.SECONDS.sleep(10);
        while (contador.get()>=0){
            if(contador.get()==0){
                future.cancel(true);
                contador.getAndDecrement();
            }
        }
        System.out.println("Alguna otra Tara en el Main");
        executor.shutdown();
    }
}
