package com.avalencia.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamBasico {
    public static void main(String[] args) {
        //creando stream a travez del metodo off
        Stream<String> nombresPorP = Stream.of("Pato", "Paco", "Pepa", "Pipe");
        //Este es un operador final, por que no devuelve nada y no modifica a los elementos
        nombresPorP.forEach(System.out::println);

        //creando stream a travez de un arreglo
        String[] arr = {"Andres", "Alejandra", "Alfonso", "Alicia"};
        Stream<String> nombresPorA = Arrays.stream(arr);
        nombresPorA.forEach(System.out::println);

        //Creando un Stran a travez de un StreamBuilder
        Stream<Integer> numeros = Stream.<Integer>builder().add(1).add(2).add(3).add(4).build();
        numeros.forEach(System.out::println);

        //Creando uin stream a partir de un tipo collection, ya sea a partir de un set o demas.
        List<String> Lista = new ArrayList<>();
        Lista.add("Juan");
        Lista.add("Juanita");
        Lista.add("Juancho");
        Lista.add("Julian");
        //manera 1 de crear un stream a partir de una lista
        //  Stream<String> nombresPorJ = Lista.stream();
        // nombresPorJ.forEach(System.out::println);
        // manera 2 de crear un stream a partir de un collection
        Lista.stream().forEach(System.out::println);

    }
}
