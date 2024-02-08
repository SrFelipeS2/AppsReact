package com.avalencia.claseoptional.repositorio;

import com.avalencia.claseoptional.models.Computador;
import com.avalencia.claseoptional.models.Fabricante;
import com.avalencia.claseoptional.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador>{

    private List<Computador> dataSource;
    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador proc = new Procesador("Ryzen 9", new Fabricante("Amd"));
        Computador asus = new Computador("Asus Rog", "Strix G512");
        asus.setProcesador(proc);
        dataSource.add(asus);
        dataSource.add(new Computador("Mackbook Pro", "M1 Pro"));
        dataSource.add(new Computador("Mackbook Pro", "MVVK2CI"));

    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        //Mejor optimizacion de codigo
        return dataSource.stream()
                .filter(c->c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findAny();
        //poco optimizado
//        for (Computador c:dataSource){
//            if(c.getNombre().equalsIgnoreCase(nombre)){
//                return Optional.of(c);
//            }
//        }
//        return Optional.empty();
    }
}
