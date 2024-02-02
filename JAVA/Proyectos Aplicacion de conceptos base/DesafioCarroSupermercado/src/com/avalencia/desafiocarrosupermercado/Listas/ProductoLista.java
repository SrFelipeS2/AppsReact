package com.avalencia.desafiocarrosupermercado.Listas;

import com.avalencia.desafiocarrosupermercado.Direccion.Direccion;
import com.avalencia.desafiocarrosupermercado.bolsa.BolsaSupermercado;
import com.avalencia.desafiocarrosupermercado.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoLista extends BolsaSupermercado<Producto> {
    public ProductoLista() {
        super();
    }

    @Override
    public void addProducto(Producto producto) {
        super.addProducto(producto);
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if(dir.equals(Direccion.ASC)){
                resultado = ordenar(campo, a, b);
            } else if(dir.equals(Direccion.DESC)){
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });
        return listaOrdenada;
    }
    public static int ordenar(String campo, Producto a, Producto b){
        int resultado = 0;
        switch (campo){
            case "nombre" ->
                    resultado = a.getNombre().compareToIgnoreCase(b.getNombre());
            case "precio" ->
                    resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }
}
