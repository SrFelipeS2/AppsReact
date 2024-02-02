package com.avalencia.pooexcepciones;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("ingrese un entero numerador:");
        String denominador = JOptionPane.showInputDialog("ingrese un entero denominador:");
        try {
            double division2 = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        } catch (FormatoNumeroException e){
            System.out.println("Se detecto una excepcion Ingrese un numero valido: " +  e.getMessage());
            e.printStackTrace(System.out);
        }
        catch (DivisionPorceroException e) {
            System.out.println("capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional pero se ejecuta siempre con o sin excepcion");
        }
        System.out.println("Continuamos con el flujo de la ejecucion");

    }
}
