package com.avalencia.desafiostream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Desafio1 {
    /*
    * Como desafió consiste en un arreglo de 100 elementos
    * del 1 al 100, del tipo int, utilizando el api stream se pide eliminar los divisibles
    * en 10, luego convertir los elementos restante del flujo en tipo double y dividirlos en
    * 2, para finalmente devolver la suma total de todos ellos usando el operador terminal reduce.
    * El resultado debería ser 2250.0
    * */
    public static void main(String[] args) {
        //Se crea una lista de enteros del 1 al 100.
        List<Integer> Lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Lista.add(i+1);
        }

        //Se convierte a Stream
        double numerosDouble = Lista
                .stream()
                //se filtra los numeros divisibles entre 10
                .filter(n-> !(n % 10 == 0))
                //se convierten a double
                .mapToDouble(Integer::doubleValue)
                //se dividen en 2
                .map(n->n/2.0)
                //se hace la sumatoria de todos los numeros
                .reduce(0.0, Double::sum);

        System.out.println("El resultado total es de:" + numerosDouble);



    }

}
