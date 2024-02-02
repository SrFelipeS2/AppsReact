package com.avalencia.expresioneslambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        //casos de uso: apiStream, Metodos que reciben lambda creados por nosotros, programacion Funcional
        Function<String, String> f1 = param -> "Hola Que tal  " + param;
        String resultado;
        System.out.println(resultado = f1.apply("Andres"));

        //Ejemplo de referencia de metodos
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("aNdReS"));

        //Ejemplo biFunction
        BiFunction<Integer, Integer, Integer> f3 = (a,b)->a+b;
        Integer r2 =(f3.apply(5688,6523));
        System.out.println(r2);

        BiFunction<String, String, Integer> f4 = String::compareTo;
        System.out.println(f4.apply("Andres", "Andres"));

        BiFunction<String, String, String> f5 = String::concat;
        System.out.println(f5.apply("Andres", "Andrea"));
    }
}
