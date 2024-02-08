package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamOperadorDistinct {
    public static void main(String[] args) {

//con esta funcion pueodo eliminar los repetidos en una lista
        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pipe Mena", "Pepe Garcia", "Pepe Lopez", "Pepe Lopez", "Pepe Lopez")
                .distinct();

        nombres.forEach(System.out::println);




    }
}
