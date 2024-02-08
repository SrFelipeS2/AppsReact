package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilterSingle {
    public static void main(String[] args) {


        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pipe Mena", "Pepe Garcia", "Pepe Lopez")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equalsIgnoreCase("pepe"))
                .peek(System.out::println);

        //find first es un operador final que lo que hace es convertir nuestor flujo a un solo objeto
        // de esta manera combinado Filter con findFirst podemos buscar un objeto en particular

        Optional<Usuario> usuario = nombres.findFirst();
        //Aqui usamos mas a detalle la API Optional, aplicamos el metodo orElse, que devuelve un valor por defecto
        //en caso de que no se encutentre.
        System.out.println(usuario.orElse(new Usuario("Jhon", "Doe ")));
        //Aqui tambien usamos una funcion que me obtiene el id y el objeto en si con una expresion lambda
        System.out.println(usuario.orElseGet(()->new Usuario("Jhon", "Doe ")).getId());
        //Aqui si lo encuentra devuelve el objeto si no devuelve la excepcion
        //System.out.println(usuario.orElseThrow());
        //Esta es otra alternativa que podemos usar, aqui implementamos metodos helper
        if(usuario.isPresent()){
            System.out.println(usuario.get().getNombre());
        }else {
            System.out.println("No se encontro el objeto");
        }


    }
}
