package com.avalencia.patrones.abstractfactory;

import com.avalencia.patrones.abstractfactory.producto.PizzaNewYorkItaliana;
import com.avalencia.patrones.abstractfactory.producto.PizzaNewYorkPeperoni;
import com.avalencia.patrones.abstractfactory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> new PizzaNewYorkPeperoni();
        };
    }
}
