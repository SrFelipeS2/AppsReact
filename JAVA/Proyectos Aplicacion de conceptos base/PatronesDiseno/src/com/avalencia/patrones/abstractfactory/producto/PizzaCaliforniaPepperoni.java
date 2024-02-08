package com.avalencia.patrones.abstractfactory.producto;

import com.avalencia.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {
    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza California Peperoni";
        masa = "Gruesa Crocante";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso Azul");
        ingredientes.add("Extra de Queso Mozarella");
        ingredientes.add("Queso Cebolla");
        ingredientes.add("Pepperoni");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 50 minutos a 55°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la piza en pequeños rectangulos");
    }
}
