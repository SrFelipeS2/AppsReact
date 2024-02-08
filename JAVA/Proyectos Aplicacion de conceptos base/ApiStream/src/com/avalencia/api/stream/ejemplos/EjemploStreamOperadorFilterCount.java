package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilterCount {
    public static void main(String[] args) {

        //Esto es un ejemplo del operador Count este devuelve la cantidad de elementos.

        Long count = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pipe Mena", "Pepe Garcia", "Pepe Lopez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(u -> System.out.println(u.getId()))
                .count();


        System.out.println(count);
        System.out.println("------------------------");


    }
}
