package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListtoStream {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres", "Valencia"));
        lista.add(new Usuario("Luisa", "Lopez"));
        lista.add(new Usuario("Luis", "Gonzales"));
        lista.add(new Usuario("Valentina", "Escobar"));
        lista.add(new Usuario("Fernando", "Gallego"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));

        //De esta manera convertimos una lista a un stream y a su vez convertirlos a String concatenado
        //el nombre y apellido convirtiendolos ademas en mayusculas
        //NOTA: si deseo fltrar por algun nombre hay que tener cuidado donde lo hacemos, es decir que si
        //filtramos antes del map deberiamos de filtrar por el tipo Usuario mediante sus atributos
        // y despues del mas debemos filtrar por string
        Stream<String> nombres = lista.stream().map(u -> u.getNombre()
                .toUpperCase()
                .concat(" ")
                .concat(u.getApellido()
                        .toUpperCase()))
                .flatMap(nombre -> {
                    if(nombre.contains("Bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }else {
                        return Stream.empty();
                    }
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(nombres.count());


    }
}
