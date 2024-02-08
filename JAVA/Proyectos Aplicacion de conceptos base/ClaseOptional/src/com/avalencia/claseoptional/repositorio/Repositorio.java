package com.avalencia.claseoptional.repositorio;

import com.avalencia.claseoptional.models.Computador;

import java.util.Optional;

public interface Repositorio <T>{
    Optional<Computador> filtrar(String nombre);
}
