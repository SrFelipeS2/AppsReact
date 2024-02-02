package com.avalencia.poointerfaces.repositorio.dao;

import com.avalencia.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdebaleRepositorio<T> {
    List<T> listar(String campo, Direccion dir);


}
