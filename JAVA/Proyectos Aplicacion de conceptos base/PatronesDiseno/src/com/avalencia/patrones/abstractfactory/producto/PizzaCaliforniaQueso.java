package com.avalencia.patrones.abstractfactory.producto;

import com.avalencia.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {
    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California Queso";
        masa = "Delgada";
        salsa = "Salsa de tomate + BBQ";
        ingredientes.add("Queso Azul");
        ingredientes.add("Queso Mozarella");
        ingredientes.add("Queso Cebolla");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 35 minutos a 100°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la piza en pequeños triangulos");
    }
}
