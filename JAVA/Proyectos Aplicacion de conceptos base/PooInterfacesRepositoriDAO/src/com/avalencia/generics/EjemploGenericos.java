package com.avalencia.generics;

import com.avalencia.poointerfaces.modelo.Cliente;
import com.avalencia.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List <Cliente> clientes = new ArrayList();
        clientes.add(new Cliente("Andres", "Guzman"));
        Cliente andres = clientes.iterator().next();

        Cliente[] clientesArreglo = {
                (new Cliente("Andres", "Guzman")),
                (new Cliente("Andres1", "Guzman2"))
        };
        Integer[] enteros = {1,2,3};
        List<Cliente> clientes2 = fromArrayToList(clientesArreglo);
        List<Integer> enteros2 = fromArrayToList(enteros);

        clientes2.forEach(System.out::println);
        enteros2.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres","Luci","Pepe"}, enteros );

        List<ClientePremium> clientesPremiumList =  fromArrayToList(new ClientePremium[]{
                (new ClientePremium("Paco", "fernandez"))
        });

        imprimirClientes(clientes);
        imprimirClientes(clientes2);
        imprimirClientes(clientesPremiumList);
        System.out.println("Maximo de 1 , 9 , 4 es: " + maximo(1,9,4));
        System.out.println("Maximo de 3.9 , 11.6 , 7.78 es: " + maximo(3.9,11.6,7.78));
        System.out.println("Maximo de zanahoria , arandanos , manzana es: "
                + maximo("zanahoria","arandano","manzana "));
    }
    //metodos Genericos
    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    //bounded generic
    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
// Cuando se crea un metodo gneerico, por debajo se crea algo como esto:
//    public static List<Cliente> fromArrayToList(Cliente[] c){
//        return Arrays.asList(c);
//    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){
        for(T elemento: c){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for(G elemento: g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    //comodines, solo para listas
    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }
    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;
    }
}
