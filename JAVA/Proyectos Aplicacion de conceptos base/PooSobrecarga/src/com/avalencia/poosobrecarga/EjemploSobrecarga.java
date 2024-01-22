package com.avalencia.poosobrecarga;
import static com.avalencia.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        System.out.println("Sumar int: " + sumar(2,10));
        System.out.println("Sumar float: " + sumar(5F,10.0F));
        System.out.println("Sumar float int: " + sumar(10F,5));
        System.out.println("Sumar float int: " + sumar(10,5.0));
        System.out.println("Sumar double: " + sumar(10.0, 5.0));
        System.out.println("Sumar String: " + sumar("5","10"));
        System.out.println("Sumar tres Enteros: " + sumar(10,5,3));
        System.out.println("Sumar muchos enteros: " + sumar(10,5,3,4));
        System.out.println("Sumar un float + n cantidad de enteros: " + sumar(10.5F,5,9,15));

        System.out.println("Sumar dos long: " + sumar(10L,5L));
        System.out.println("Sumar dos enteros: " + sumar(10,'@'));
        System.out.println("Sumar float-int " + sumar(10F,'@'));


    }
}
