package com.avalencia.desafioadministradoranimales;

import com.avalencia.desafioadministradoranimales.animales.Guepardo;
import com.avalencia.desafioadministradoranimales.animales.*;
import com.avalencia.desafioadministradoranimales.mamifero.Mamifero;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Guepardo guepardo = new Guepardo("Savannah", 0.9f, 1.5f, 60, "Acinonyx jubatus", 0.08f, 112);
        Leon leon = new Leon("Savannah", 1.2f, 2.0f, 150, "Panthera leo", 0.1f, 80, 15, 180);
        Lobo lobo = new Lobo("Bosque", 0.8f, 1.2f, 40, "Canis lupus", "Gris", 0.05f, 7, "Griseus");
        Perro perro = new Perro("Doméstico", 0.3f, 0.5f, 10, "Canis lupus familiaris", "Marrón", 0.02f, 300, "Philiph");
        Tigre tigre = new Tigre("Selva", 1.0f, 1.8f, 120, "Panthera tigris", 0.09f, 100, "Bengalensis");

        // Crear un array de Mamiferos
        Mamifero[] mamiferos = {guepardo, leon, lobo, perro, tigre};

        // Mostrar información de cada mamífero
        for (Mamifero mamifero : mamiferos) {
            System.out.println("Nombre Científico: " + mamifero.getNombreCientifico());
            System.out.println("Hábitat: " + mamifero.getHabitad());
            System.out.println("Altura: " + mamifero.getAltura() + " metros");
            System.out.println("Largo: " + mamifero.getLargo() + " metros");
            System.out.println("Peso: " + mamifero.getPeso() + " kilogramos");
            System.out.println("Comer: " + mamifero.comer());
            System.out.println("Dormir: " + mamifero.dormir());
            System.out.println("Correr: " + mamifero.correr());
            System.out.println("Comunicarse: " + mamifero.comunicarse());
            System.out.println("--------------------------------------");
        }
    }
}
