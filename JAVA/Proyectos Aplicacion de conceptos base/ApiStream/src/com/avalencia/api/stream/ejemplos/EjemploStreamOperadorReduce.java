package com.avalencia.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamOperadorReduce {
    public static void main(String[] args) {


        //Con esta funcion se reduce un flujo de varios elementos en un solo elementos
        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pipe Mena", "Pepe Garcia", "Pepe Lopez", "Pepe Lopez", "Pepe Lopez")
                .distinct();
                
        String resultado =nombres.reduce("Resultado: ", (a,b)->a+", "+b);
        System.out.println( resultado);




    }
}
