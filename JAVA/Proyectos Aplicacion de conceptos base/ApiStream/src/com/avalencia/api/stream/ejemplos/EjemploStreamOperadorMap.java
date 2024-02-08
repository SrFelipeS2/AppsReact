package com.avalencia.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamOperadorMap {
    public static void main(String[] args) {

        //Esta es una manera larga de implementar un map y un for each para visualizar los cambios hechos
//        Stream<String> nombresPorP = Stream.of("Pato", "Paco", "Pepa", "Pipe")
//                .map(nombrePorP -> {
//                    return nombrePorP.toUpperCase();
//                });

//        nombresPorP.forEach(System.out::println);
//        //Esta es la manera simplificada
//        Stream.of("Pato", "Paco", "Pepa", "Pipe")
//                .map(nombrePorP -> {
//                    return nombrePorP.toUpperCase();
//                }).forEach(System.out::println);

        //Aqui otros dos operadores peek(), sirve para hacer debuig por que inspecciona el stream
        //El collect sirve para convertir el stream a List
        List<String> lista = Stream.of("Pato", "Paco", "Pepa", "Pipe")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        lista.forEach(System.out::println);

    }
}
