package com.avalencia.main;

import com.avalencia.Desafio20Herencia.*;

public class EjemploDesafio20Herencia {
    public static void main(String[] args) {

        System.out.println("==============Creando la Instancia de la clase Empoleado ==============");
        Empleado empleado1 = new Empleado("Juan Guarnizo", "Perez", "000235813", "calle 45 # 56 -86 ", 85000.00, 1);
        Empleado empleado2 = new Empleado("Andres Guarin", "Guarin", "00025226912", "calle 884 # 506 -816 ", 85000.00, 2);
        Empleado empleado3 = new Empleado("Juliana", "Alzate", "001358312", "calle 25 # 55 -26 ", 85000.00, 3);

        System.out.println("==============Creando la Instancia de la clase Gerente ==============");
        Gerente gerente1 = new Gerente("Jorge", "Grajales", "000238415", "calle 44 # 65 -26 ", 900000.00, 4, 1000000.0);


        System.out.println("==============Creando la Instancia de la clase Cliente ==============");
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("ALberto");
        cliente1.setApellido("Alarcon");
        cliente1.setNumeroFiscal("000238965");
        cliente1.setDireccion("calle 45 # 56 -86 ");
        cliente1.setClienteId(1);
        Cliente cliente2 = new Cliente("Luis", "Velez", "000238150", "calle 45 # 56 -86 ", 2);


        System.out.println("=============Imprimiendo la Informacion==============");

        imprimir(empleado1);
        imprimir(empleado2);
        imprimir(empleado3);
        imprimir(gerente1);
        imprimir(cliente1);
        imprimir(cliente2);

    }

    public static void imprimir(Persona persona) {
        System.out.println("===========================");
        System.out.println(persona);
        System.out.println("===========================");

    }
}




