package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilterAnyMatch {
    public static void main(String[] args) {

        //Esto es un ejemplo del operador AnyMatch, el cual devuelve un booleano si se encuentra el objeto
        //que se esta filtrando.

        Boolean existe = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pipe Mena", "Pepe Garcia", "Pepe Lopez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(u -> System.out.println(u.getId()))
                .anyMatch(u -> u.getId().equals(1));


        System.out.println(existe);
        System.out.println("------------------------");

        //aqui trato de hacer la misma implementacion de arriba pero con codigo puro sin usar stream
        List<Usuario> lista = Arrays.asList(new Usuario("Pato", "Guzman"),
                new Usuario("Paco", "Gonzales"),
                new Usuario("Pepa", "Gutierrez"),
                new Usuario("Pipe", "Mena"),
                new Usuario("Pepe", "Garcia"),
                new Usuario("Pepe", "Lopez"));


        boolean resultado = false;
        for (Usuario u: lista){
            if(u.getId().equals(3)){
                 resultado = true;
                 break;
            }
        }
        System.out.println(resultado);
    }
}
