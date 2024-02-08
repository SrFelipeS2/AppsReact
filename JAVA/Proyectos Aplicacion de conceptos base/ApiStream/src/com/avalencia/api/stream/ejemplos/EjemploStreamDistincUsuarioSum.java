package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistincUsuarioSum {
    public static void main(String[] args) {


        //Si quiseramos saber, que noimbre es mas largo incluyendo el apellido,
        //cual es el mas corto y cual es el pormedio en cantidad de caracteres
        //para esto se puede usar un mapToInt

        IntStream largoNombres = Stream.of("Pato Guzman","Pato Guzman","Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pipe Mena", "Pepe Garcia", "Pepe Lopez")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct()
                //se usa esto para hacer las operaciones con los nombres, en caso tal de que sea con los
                //iDS se hace asi
                //.mapToInt(u->u.getId())
                .mapToInt(u->u.toString().length())
                .peek(System.out::println);

        //largoNombres.forEach(System.out::println);
        //como .sum() .average .max son operadores finales se debe de hacer los siguiente:
        //Esto es un operador terminal que envuelve todas estas operaciones
        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("------------");
        System.out.println(stats.getSum());
        System.out.println(stats.getMax());
        System.out.println(stats.getAverage());
        System.out.println(stats.getMin());
        System.out.println(stats.getCount());





    }
}
