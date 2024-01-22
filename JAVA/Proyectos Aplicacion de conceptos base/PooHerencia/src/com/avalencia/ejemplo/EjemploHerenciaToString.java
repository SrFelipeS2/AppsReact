package com.avalencia.ejemplo;

import com.avalencia.PooHerencia.*;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        System.out.println("==============Creando la Instancia de la clase Alumno ==============");
        Alumno alumno = new Alumno("Pepito", "Perez", 13, "Instituto Tecnico San Rafael", 8.6, 6.6, 4.9);
        alumno.setEmail("Pepito@gmail.com");

        System.out.println("==============Creando la Instancia de la clase Alumno Internacional ==============");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Petter", "Gosling", "Australia");
        alumnoInt.setEdad(16);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.2);
        alumnoInt.setNotaEspañol(6.6);
        alumnoInt.setNotaIngles(4.9);
        alumnoInt.setNotaMatematica(8.6);
        alumnoInt.setEmail("Petter@gmail.com");


        System.out.println("==============Creando la Instancia de la clase Profesor ==============");
        Profesor profesor = new Profesor("Alan", "Brito", "Matematicas");
        profesor.setEmail("Alan@gmail.com");

        System.out.println("===========================");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println("===========================");
        System.out.println(persona);
        System.out.println("===========================");

    }
}
