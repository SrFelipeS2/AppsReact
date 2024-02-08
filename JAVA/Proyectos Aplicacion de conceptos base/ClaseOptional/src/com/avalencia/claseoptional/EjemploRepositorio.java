package com.avalencia.claseoptional;

import com.avalencia.claseoptional.models.Computador;
import com.avalencia.claseoptional.repositorio.ComputadorRepositorio;
import com.avalencia.claseoptional.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

//        Optional<Computador> pc = repositorio.filtrar("asus rog");
        //Sin Optional
//        if (pc != null) {
//            System.out.println(pc.getNombre());
//        } else {
//            System.out.println("No Se encontro!");
//        }
        //Con Optional
//        if (pc.isPresent()) {
//            System.out.println(pc.get());
//        } else {
//            System.out.println("No Se encontro!");
//        }
//         Simplificado
        repositorio.filtrar("rog").ifPresentOrElse(System.out::println, () -> System.out.println("No se encontro"));


    }
}
