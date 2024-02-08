package com.avalencia.patrones.abstractfactory.producto;

import com.avalencia.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {
    public PizzaNewYorkItaliana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa delgada gruesa";
        salsa = "Salsa de tomate italiano con carne";
        ingredientes.add("Queso Mozarella");
        ingredientes.add("peperoni");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamon");
        ingredientes.add("Chorizo");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar por 30 minutos a 120°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes");
    }
}
