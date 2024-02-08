package com.avalencia.claseoptional;

import com.avalencia.claseoptional.models.Computador;
import com.avalencia.claseoptional.models.Fabricante;
import com.avalencia.claseoptional.models.Procesador;
import com.avalencia.claseoptional.repositorio.ComputadorRepositorio;
import com.avalencia.claseoptional.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

//        String pc = repositorio.filtrar("rog")
//                .map(Computador::getProcesador)
//                .map(Procesador::getFabricante)
//                .filter(f->"amd".equalsIgnoreCase(f.getNombre()))
//                .map(Fabricante::getNombre)
//                .orElse("Desconocido");
//
//        System.out.println(pc);

        //flatMap
        String pc = repositorio.filtrar("rog")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(f->"amd".equalsIgnoreCase(f.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(pc);



    }


}
