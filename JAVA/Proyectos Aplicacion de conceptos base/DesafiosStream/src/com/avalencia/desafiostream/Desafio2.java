package com.avalencia.desafiostream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Desafio2 {
    public static void main(String[] args) {

        List<Integer> Lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Lista.add(i+1);
        }

        //Se convierte a Stream
        Optional<Integer> numeroMayor = Lista.stream()
                .reduce(Integer::max);

        int maximo = numeroMayor.orElse(0);
        System.out.println(maximo);

    }
}
