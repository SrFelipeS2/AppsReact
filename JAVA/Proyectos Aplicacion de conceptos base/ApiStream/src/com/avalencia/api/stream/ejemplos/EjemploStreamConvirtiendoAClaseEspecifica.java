package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamConvirtiendoAClaseEspecifica {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pipe Mena")
                //este map usnado programacion funcional y expresiones lambda convierte este arreglo de nombres
                //a una clase Usuario especifica uno a uno, que contiene nombre y apellido
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(u -> System.out.println(u.toString()));

    }
}
