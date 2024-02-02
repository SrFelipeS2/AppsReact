package com.avalencia.ejemplo.set;

import com.avalencia.ejemplo.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 4));
        sa.add(new Alumno("Zeus", 3));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 8));

        System.out.println("Iterando usando ForEach");

        for (Alumno a: sa) {
            System.out.println(a.getNombre());
        }
        System.out.println("Iterando usando While y Iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a);
        }
        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
        System.out.println("Iterando usando Stream for");
        for (int i = 0; i < sa.size(); i++) {
            System.out.println(sa);
        }
        
    }
}
