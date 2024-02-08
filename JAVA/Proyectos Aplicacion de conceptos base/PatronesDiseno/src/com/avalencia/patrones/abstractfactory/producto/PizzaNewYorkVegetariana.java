package com.avalencia.patrones.abstractfactory.producto;

import com.avalencia.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral vegana sin leche ni huevos";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso Vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");


    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 minutos a 150°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la Pizza en rebanada cuadradas");
    }
}
