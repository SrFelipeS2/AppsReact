package com.avalencia.patrones.abstractfactory;

import com.avalencia.patrones.abstractfactory.producto.*;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        return  switch (tipo) {
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            case "queso" -> new PizzaCaliforniaQueso();
            default -> new PizzaCaliforniaPepperoni();
        };
    }
}
