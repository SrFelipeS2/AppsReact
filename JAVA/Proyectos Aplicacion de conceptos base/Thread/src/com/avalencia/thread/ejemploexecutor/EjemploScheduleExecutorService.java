package com.avalencia.thread.ejemploexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduleExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        System.out.println("Alguna tarea en el main");

        executor.schedule(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hola mundo soy una tarea programada");
        },2000, TimeUnit.MILLISECONDS);

        System.out.println("Alguna otra Tara en el Main");
        executor.shutdown();
    }
}
