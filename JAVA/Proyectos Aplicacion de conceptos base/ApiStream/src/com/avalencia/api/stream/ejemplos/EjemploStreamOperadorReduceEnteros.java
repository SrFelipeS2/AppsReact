package com.avalencia.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamOperadorReduceEnteros {
    public static void main(String[] args) {


        //Con esta funcion se reduce un flujo de varios elementos en un solo elementos en este caso estamos sumando cada
        //uno de los elementos del arreglo y lo asignamos a una variable para despues mostrarlo
        Stream<Integer> numeros = Stream.of(5,10,12,14,17)
                .distinct();
                
        Integer resultado = numeros.reduce(0, Integer::sum);
        System.out.println( resultado);



    }
}
