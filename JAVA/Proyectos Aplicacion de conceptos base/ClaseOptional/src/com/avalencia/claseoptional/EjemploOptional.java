package com.avalencia.claseoptional;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {

        //formas de crear un Optional
        String nombre = "Andres";
        //Esta si o si tiene que tener un valor asignado
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }

        System.out.println(opt.isEmpty());
        opt.ifPresent(valor -> System.out.println("hola " + valor));

        nombre = null;
        //EL ofNullable permite pasar nullos y no nullos
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresent( valor-> System.out.println("Hola " + valor));

        opt.ifPresentOrElse( valor-> System.out.println("Hola " + valor), () -> System.out.println("No esta presente o esta vacio"));

        //CREANDO  un optional vacio

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("optionalEmpty = " + optionalEmpty);
        System.out.println(optionalEmpty.isPresent());
    }
}
