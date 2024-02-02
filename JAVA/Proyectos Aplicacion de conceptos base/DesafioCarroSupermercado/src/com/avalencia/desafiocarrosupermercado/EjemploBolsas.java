package com.avalencia.desafiocarrosupermercado;

import com.avalencia.desafiocarrosupermercado.Direccion.Direccion;
import com.avalencia.desafiocarrosupermercado.Listas.ProductoLista;
import com.avalencia.desafiocarrosupermercado.bolsa.BolsaSupermercado;
import com.avalencia.desafiocarrosupermercado.modelo.Producto;
import com.avalencia.desafiocarrosupermercado.productos.*;

import java.util.List;


public class EjemploBolsas {
    public static void main(String[] args) {
        BolsaSupermercado<Producto> frutas = new ProductoLista();
        System.out.println("-----------------Frutas Organizadas Ascendentemente por el campo nombre-------------");
        frutas.addProducto(new Fruta("Banano",500D,10D,"Amarillo"));
        frutas.addProducto(new Fruta("Aceituna",500D,10D,"Verde"));
        frutas.addProducto(new Fruta("Manzana",5000D,15D,"Roja"));
        frutas.addProducto(new Fruta("Pera",4500D,15D,"Verde"));
        frutas.addProducto(new Fruta("Naranja",800D,8D,"Naranja"));
        frutas.addProducto( new Fruta("Toronja",800D,8D,"Naranja"));
        frutas.listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("-----------------Lacteos Organizadas Ascendentemente por el campo Precio-------------");
        BolsaSupermercado<Producto> lacteos = new ProductoLista();
        lacteos.addProducto(new Lacteo("yogurt",3000D,10,50));
        lacteos.addProducto(new Lacteo("leche",5000D,10,100));
        lacteos.addProducto(new Lacteo("Cafe con Leche",2500D,15,150));
        lacteos.addProducto(new Lacteo("Queso",4500D,15,400));
        lacteos.addProducto(new Lacteo("Yogurt griego",8000D,8,450));
        lacteos.addProducto( new Lacteo("alpinito",800D,8,20));
        lacteos.listar("precio",Direccion.ASC).forEach(System.out::println);
        System.out.println("-----------------Limpieza Organizadas Descendentemente por el campo nombre-------------");
        BolsaSupermercado<Producto> limpieza = new ProductoLista();
        limpieza.addProducto(new Limpieza("Limpido",5000D,"100 % Limpido",1D));
        limpieza.addProducto(new Limpieza("Limpia Vidrios",1000D,"10% Limpido, 30% Agua, 60% jabon",1.5));
        limpieza.addProducto(new Limpieza("Aromatizante para baño",12000D,"10% Aromatizante labanda, 40% Antibaterial, 30% gas Comprimido, 20% Alcohol",700D));
        limpieza.addProducto(new Limpieza("Aromatizante para Pisos",4500D,"50% Limpido, 50% Aromatizante Limon",3D));
        limpieza.addProducto(new Limpieza("Discos para el inodoro",8500D,"50 % Limpido, 50% Antibacterial",8D));
        limpieza.addProducto( new Limpieza("Lava vajillas",1200D,"100% Jabon Liquido",800D));
        limpieza.listar("precio",Direccion.DESC).forEach(System.out::println);
        System.out.println("-----------------Limpieza Organizadas Descendentemente por el campo precio-------------");
        BolsaSupermercado<Producto> noPercibiles = new ProductoLista();
        noPercibiles.addProducto(new NoPerecible("Atun",5000D,1,100));
        noPercibiles.addProducto(new NoPerecible("Frjoles en Lata",12000D,2,550));
        noPercibiles.addProducto(new NoPerecible("Frijol",1200D,5,600));
        noPercibiles.addProducto(new NoPerecible("Arroz",1250D,5,20));
        noPercibiles.addProducto(new NoPerecible("Galletas",5000D,2,10));
        noPercibiles.addProducto( new NoPerecible("Lentejas",1800D,3,120));
        noPercibiles.listar("precio", Direccion.DESC).forEach(System.out::println);


    }
}
