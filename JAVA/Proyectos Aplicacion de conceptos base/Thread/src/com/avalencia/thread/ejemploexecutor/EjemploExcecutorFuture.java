package com.avalencia.thread.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExcecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService execurtor = Executors.newSingleThreadExecutor();

        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("finaliza la tarea");
            return "Algun resultado importante de la tarea";
        };
        Future<String> resultado = execurtor.submit(tarea);
        execurtor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo 1");
        //System.out.println(resultado.isDone());
        while (!resultado.isDone()){
            System.out.println("ejecutando tarea ....");
            TimeUnit.MICROSECONDS.sleep(1500);
        }
        execurtor.awaitTermination(1,TimeUnit.SECONDS);
        System.out.println("Obtenemos el resultado de la tarea: " + resultado.get(2, TimeUnit.SECONDS));
        System.out.println("finaliza la tarea: "+resultado.isDone());

    }
}
