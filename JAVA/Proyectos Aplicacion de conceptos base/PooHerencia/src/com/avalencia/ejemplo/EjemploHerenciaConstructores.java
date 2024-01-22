package com.avalencia.ejemplo;

import com.avalencia.PooHerencia.Alumno;
import com.avalencia.PooHerencia.AlumnoInternacional;
import com.avalencia.PooHerencia.Persona;
import com.avalencia.PooHerencia.Profesor;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo los datos de la perosna");
        System.out.println(
                " Nombre: " + persona.getNombre()
                        + " Apellido: " + persona.getApellido()
                        + " Edad: " + persona.getEdad()
                        + " Email: " + persona.getEmail()
        );
        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del Alumno");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion()
                    + " Nota Matematicas: " + ((Alumno) persona).getNotaMatematica()
                    + " Nota Español: " + ((Alumno) persona).getNotaEspañol()
                    + " Nota Ingles: " + ((Alumno) persona).getNotaIngles());
            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo los datos del Alumno Internacional");
                System.out.println("pais:" + ((AlumnoInternacional) persona).getPais()
                        + "Nota Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
            }
            System.out.println("============Sobreescritura promedio===============");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("============Sobreescritura promedio===============");


        } else {
            System.out.println("Imprimiendo los datos del Profesor");
            System.out.println("Asignatura:" + ((Profesor) persona).getAsignatura());
        }
        System.out.println("============Sobreescritura Saludar===============");
        System.out.println(persona.saludar());
        System.out.println("===========================");
    }
}
