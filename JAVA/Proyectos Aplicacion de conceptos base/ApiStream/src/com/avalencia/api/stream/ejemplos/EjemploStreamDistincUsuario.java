package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistincUsuario {
    public static void main(String[] args) {


        //Aqui si usamos el distinct antes del map evitamos que se dupliquen registros de la clase usuario en el map
        //Si lo usaramos despues del map crea los registos de usuario repetidos
        //para aplicar el distinc de forma efectiva debemos de imlementar el metodo equals y comparar el nombre y apellido
        //esta implementacion se hace en la clase Usuario y el Ide nos ayuda a implemnentar
        // De esta manera se pued usar el distinct  despues del map para no duplicar registros de Usuario

        Stream<Usuario> nombres = Stream.of("Pato Guzman","Pato Guzman","Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pipe Mena", "Pepe Garcia", "Pepe Lopez")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct();

        nombres.forEach(System.out::println);





    }
}
