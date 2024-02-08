package com.avalencia.claseoptional;

import com.avalencia.claseoptional.models.Computador;
import com.avalencia.claseoptional.repositorio.ComputadorRepositorio;
import com.avalencia.claseoptional.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //La gran diferencia del orElse con respecto a al orElseGet es que asi lo encuentre o no siempre
        //va a invocar al metodo en este caso puntual valorDefecto(), gasta recursos y crea objetos por debajo.
        Computador pc = repositorio.filtrar("rog").
                orElse(valorDefecto());

        System.out.println(pc);
        //por el contrario, este es mas optimizado, en caso de que encuentre el objeto el no ejecuta
        //el mentodo que se le pasa por parametro: EjemploRepositorioMetodosOrElse::valorDefecto
        pc = repositorio.filtrar("Mackbook").
                orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);
    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo Valor Por defecto");
        return new Computador("Hp Omen","LASBD");
    }
}
