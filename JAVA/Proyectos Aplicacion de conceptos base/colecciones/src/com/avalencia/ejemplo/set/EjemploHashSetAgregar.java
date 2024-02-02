package com.avalencia.ejemplo.set;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Uno");
        hs.add("Dos");
        hs.add("Tres");
        hs.add("Cuatro");
        hs.add("Cinco");
        System.out.println(hs);
        boolean b = hs.add("Tres");
        System.out.println("Permite elementos duplicados? " + b);

    }
}
