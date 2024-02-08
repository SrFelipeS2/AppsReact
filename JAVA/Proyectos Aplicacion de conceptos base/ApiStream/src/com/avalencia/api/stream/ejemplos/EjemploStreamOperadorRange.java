package com.avalencia.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamOperadorRange {
    public static void main(String[] args) {


        //NOTA: El stram no tiene rangos, pero si hya una manera de hacerlo  y adaptarlo, como podemos ver
        // la interface IntStream si tiene el metodo range que permite crear un flujo de el rango especificado
        //A parte del range normal, tambien tenemos a dispocision el rangeClosed que es incluyente es decir incluye hasta el 20 en el ejemplo anterior
        //A parte de la interface IntStream tambien esta la LongStream   y el DoubleStream para trabajar con decimales y con enteros mas grandes
        IntStream numeros = IntStream.range(5,20).peek(System.out::println);


        //esta es una manera de sumar el rando pero hay otra.
//        int resultado = numeros.reduce(0, Integer::sum);
//        System.out.println( resultado);

        //esta es la otra manera
//        int resultadoSum = numeros.sum();
//        System.out.println("resultadoSum = " + resultadoSum);

        //Aqui una manera mas optimizada por que nos brinda muchas mas opciones de manejo de datos
        IntSummaryStatistics status = numeros.summaryStatistics();
        System.out.println("max: " + status.getMax());
        System.out.println("min: " + status.getMin());
        System.out.println("sum: " + status.getSum());
        System.out.println("promedio: " + status.getAverage());
        System.out.println("total: " + status.getCount());





    }
}
