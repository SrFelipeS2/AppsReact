package com.avalencia.thread.ejemploexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExcecutor {
    public static void main(String[] args) throws InterruptedException {
        //este solo ejecuta una tarea, le pasamos una implementacion
        // ya sea por parametro  de una instancia  que implementente Runneable
        //o por una funcion anonima que implemente los metodos necesarios para su funcionamiento
        //Executor
        //El ExcecutorService nos permite ademas de ejecutar una tarea, hace un seguimiento de la misma
        //retornando un objeto del tipo furture y desde ahi se pued manejar la tarea, saber el estado
        // cancelar la tarea y demas acciones y tampoco es necesario usar instancia por que es a travez de una factory que se encarga de crear la instancia.
        ExecutorService execurtor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("finaliza la tarea");
        };
        execurtor.submit(tarea);
        execurtor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo 1");
        execurtor.awaitTermination(2,TimeUnit.SECONDS);
        System.out.println("Continuando con la ejecucion del metodo 2");

    }
}
