package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamOperadorFlatMap {
    public static void main(String[] args) {

        //Hay otra manera de filtrar y modificar, usando un flatMap:
        //el Flatmap devuelve un objeto del tipo Stream
        //el flatmap por cada elemento crea un stream diferente
        // y despues lo aplana en un unico stream
        //En pocas palabras
        //El map devuelve: un objeto comun y corriente, en este caso Usuario
        //El Flatmap Devuelve: un stream de ese objeto, otro flujo, otra salida


        Stream<Usuario> nombresflat = Stream.of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pipe Mena", "Pepe Garcia", "Pepe Lopez")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getNombre().equalsIgnoreCase("pepe")){
                        return Stream.of(u);
                    }else {
                        return Stream.empty();
                    }
                })
                .peek(System.out::println);

        //nombresflat.forEach(System.out::println);
        System.out.println(nombresflat.count());



    }
}
