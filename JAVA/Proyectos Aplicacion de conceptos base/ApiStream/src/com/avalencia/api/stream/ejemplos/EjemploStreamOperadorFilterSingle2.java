package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilterSingle2 {
    public static void main(String[] args) {


        //esta es la manera simplificada de buscar un objeto unico, en el primer ejemplo se creaba una clase
        // de tipo OIptional que se encargaba de almacenar el restulado, ahora lo hacemos de inmediato
        // usando el Stream.
        Usuario usuario = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pipe Mena", "Pepe Garcia", "Pepe Lopez")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(u-> System.out.println(u.getId()))
                .filter(u -> u.getNombre().equalsIgnoreCase("pepe"))
                .findFirst().get();

        System.out.println(usuario);
        System.out.println("------------------------");


        //vamos a buiscar por Id ya que se agrego el atributo a la clase Usuario
        Usuario usuarioPorId = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez",
                        "Pipe Mena", "Pepe Garcia", "Pepe Lopez")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(u-> System.out.println(u.getId()))
                .filter(u -> {
                    return u.getId().equals(12);
                })
                .findFirst()
                .orElseGet(() -> new Usuario("Jhon", "Doe"));


        System.out.println(usuarioPorId);


    }
}
