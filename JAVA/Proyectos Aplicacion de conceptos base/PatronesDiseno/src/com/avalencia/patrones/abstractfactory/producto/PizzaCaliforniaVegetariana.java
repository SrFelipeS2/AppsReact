package com.avalencia.patrones.abstractfactory.producto;

import com.avalencia.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {
    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza california Vegetariana";
        masa = "Delgada Ligth";
        salsa = "BBq Ligth";
        ingredientes.add("Queso Mozarella");
        ingredientes.add("Espinaca");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 20 minutos a 100°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la Pizza en forma rectangular");

    }
}
