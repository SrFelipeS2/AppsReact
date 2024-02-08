package com.avalencia.patrones.abstractfactory.ejemplo;

import com.avalencia.patrones.abstractfactory.PizzaProducto;
import com.avalencia.patrones.abstractfactory.PizzeriaCaliforniaFactory;
import com.avalencia.patrones.abstractfactory.PizzeriaNewYorkFactory;
import com.avalencia.patrones.abstractfactory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();
        PizzaProducto pizza =  california.ordenarPizza("queso");
        System.out.println("Brice ordena la pizza " + pizza.getNombre());
        PizzaProducto pizza2 =  california.ordenarPizza("vegetariana");
        System.out.println("Luis ordena la pizza " + pizza2.getNombre());
        PizzaProducto pizza3 =  california.ordenarPizza("");
        System.out.println("Alfredo ordena la pizza " + pizza3.getNombre());
        PizzaProducto pizza4 = ny.ordenarPizza("");
        System.out.println("Andres ordena la pizza " + pizza4.getNombre());
        PizzaProducto pizza5 = ny.ordenarPizza("vegetariana");
        System.out.println("Andres ordena la pizza " + pizza5.getNombre());

        System.out.println("pizza5 = " + pizza5);



    }
}
