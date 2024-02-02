package com.avalencia.poointerfaces.repositorio.dao;

import com.avalencia.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
