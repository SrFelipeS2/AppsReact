package com.avalencia.expresioneslambda;

import com.avalencia.expresioneslambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(7);
        System.out.println("r = " + r);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String, String> t3 = String::equals;
        System.out.println(t3.test("Andres", "Andrea"));

        BiPredicate<Integer, Integer> t4 = t4 = (i,j)->j>i;
        boolean r2 = t4.test(5,10);
        System.out.println("r2 = " + r2);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Cata");
        b.setNombre("Cata");

        BiPredicate<Usuario, Usuario> t5 = Usuario::equals;
        System.out.println(t5.test(a, b));
    }
}
