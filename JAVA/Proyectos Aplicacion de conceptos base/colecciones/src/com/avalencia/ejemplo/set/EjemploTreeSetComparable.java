package com.avalencia.ejemplo.set;

import com.avalencia.ejemplo.modelo.Alumno;

import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //Set<Alumno> sa = new TreeSet<>((a,b)->b.getNota().compareTo(a.getNota()));
        //nomenclatura de refetencia
        Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNota).reversed());
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 4));
        sa.add(new Alumno("Zeus", 3));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 8));
        sa.add(new Alumno("Andres", 8));

        System.out.println(sa);
    }
}
