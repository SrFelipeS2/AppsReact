package com.avalencia.desafiocarrosupermercado.Interfaces;

import com.avalencia.desafiocarrosupermercado.Direccion.Direccion;

import java.util.List;

public interface Ordenable<T> {
    List<T> listar(String campo, Direccion dir);
}
