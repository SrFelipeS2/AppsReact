package com.avalencia.thread.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExcecutorFutureMultiTask {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService execurtor = Executors.newFixedThreadPool(2);

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

        Callable<Integer> tarea3 =()->{
            System.out.println("Iniciando tarea 3....");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };
        Future<String> resultado = execurtor.submit(tarea);
        Future<String> resultado2 = execurtor.submit(tarea);
        Future<Integer> resultado3 = execurtor.submit(tarea3);

        execurtor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo 1");

        //System.out.println(resultado.isDone());
        while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.println(String.format("Resultado1: %s - Resultado2: %s - Resultado3: %s",
                    resultado.isDone()? "Finalizo" : "En Proceso",
                    resultado2.isDone()? "Finalizo" : "En Proceso",
                    resultado3.isDone()? "Finalizo" : "En Proceso"));
            TimeUnit.MICROSECONDS.sleep(1000);
        }

        System.out.println("Obtenemos el resultado de la tarea: " + resultado.get(2, TimeUnit.SECONDS));
        System.out.println("finaliza la tarea: "+resultado.isDone());
        System.out.println("Obtenemos el resultado de la tarea: " + resultado2.get(2, TimeUnit.SECONDS));
        System.out.println("finaliza la tarea: "+resultado2.isDone());
        System.out.println("Obtenemos el resultado de la tarea: " + resultado3.get(2, TimeUnit.SECONDS));
        System.out.println("finaliza la tarea: "+resultado3.isDone());

    }
}
