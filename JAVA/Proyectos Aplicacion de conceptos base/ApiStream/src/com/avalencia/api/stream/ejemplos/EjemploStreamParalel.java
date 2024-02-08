package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParalel {
    public static void main(String[] args) {

        //Esto es un ejemplo de una caracteristica importante de los thread
        // que permite se ejecute, que se procesen los datos del flujo de forma paralela
        //mediante un pool de therad va a procesar el stream
        //esto permite que se procese mas rapido
        //pero tiene un costo en rendimiento
        //Aplicamos paralelismo
        //No siempre se usa, mas que todo se usa cuando tenemos una cantidad de elementos importntes
        // y el costo de rendimiento es alto

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres", "Valencia"));
        lista.add(new Usuario("Luisa", "Lopez"));
        lista.add(new Usuario("Luis", "Gonzales"));
        lista.add(new Usuario("Valentina", "Escobar"));
        lista.add(new Usuario("Fernando", "Gallego"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));

        long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n ->{
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName() + " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (nombre.contains("Bruce".toUpperCase())) {
                        return Stream.of(nombre);
                    } else {
                        return Stream.empty();
                    }
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo Total: " + (t2-t1));
        System.out.println(resultado);


    }
}
