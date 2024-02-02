package com.avalencia.poointerfaces;

import com.avalencia.poointerfaces.modelo.Producto;
import com.avalencia.poointerfaces.repositorio.dao.*;
import com.avalencia.poointerfaces.repositorio.dao.OrdenablePaginableCrudRepositorio;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.AccesoDatoexception;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.LecturaAccesDatoException;
import com.avalencia.poointerfaces.repositorio.dao.lista.ProductoListrepositorio;

import java.util.List;

public class EjemploRepositorioProductoList {
    public static void main(String[] args) {
        try {
            OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListrepositorio();
            repo.crear(new Producto("Iphone", 5000.000));
            repo.crear(new Producto("Samsung", 4000.000));
            repo.crear(new Producto("Oppo", 3000.000));
            repo.crear(new Producto("Motorola", 2000.000));

            List<Producto> productos = repo.listar();
            productos.forEach(System.out::println);
            System.out.println("===== paginable =====");
            List<Producto> productosPAginables = repo.listar(1, 4);
            productosPAginables.forEach(System.out::println);

            System.out.println("===== ordenar =====");
            List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);
            productosOrdenAsc.forEach(System.out::println);

            System.out.println("===== editar =====");
            ;
            Producto OppoActualizar = new Producto("Oppo 1", 3500.000);
            OppoActualizar.setId(3);
            repo.editar(OppoActualizar);
            Producto oppo = repo.porId(3);
            System.out.println(oppo);
            System.out.println("--------------");
            List<Producto> andres2 = repo.listar("precio", Direccion.ASC);
            andres2.forEach(System.out::println);
            System.out.println("-------------");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println("---------Total-------");
            System.out.println("total registros: " + repo.total());

        }catch(LecturaAccesDatoException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (AccesoDatoexception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
