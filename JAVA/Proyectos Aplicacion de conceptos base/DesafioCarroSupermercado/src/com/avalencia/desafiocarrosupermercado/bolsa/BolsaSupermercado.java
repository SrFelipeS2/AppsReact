package com.avalencia.desafiocarrosupermercado.bolsa;

import com.avalencia.desafiocarrosupermercado.Direccion.Direccion;
import com.avalencia.desafiocarrosupermercado.Interfaces.Ordenable;
import com.avalencia.desafiocarrosupermercado.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public abstract class BolsaSupermercado<T extends Producto> implements Ordenable<T> {
    protected List<T> dataSource;
    public BolsaSupermercado() {
        this.dataSource = new ArrayList<>();
    }
    public void addProducto(T producto) {
        if (dataSource.size() < 5) {
            dataSource.add(producto);
        } else {
            System.out.println("La bolsa está llena, no se puede agregar más productos.");
        }
    }
    @Override
    public List<T> listar(String campo, Direccion dir) { return dataSource;}

    public List<T> getProductos() {
        return dataSource;
    }

}
